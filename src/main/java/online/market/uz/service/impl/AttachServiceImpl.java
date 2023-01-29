package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.AttachDTO;
import online.market.uz.entity.AttachEntity;
import online.market.uz.exception.AppBadRequestException;
import online.market.uz.exception.ItemNotFoundException;
import online.market.uz.repository.AttachRepository;
import online.market.uz.service.AttachService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;


@Service
@RequiredArgsConstructor
public class AttachServiceImpl implements AttachService {

    @Value("${attach.upload.folder}")
    private String uploadFolder;
    @Value("${server.download.url}")
    private String downloadUrl;
    private final AttachRepository attachRepository;

    public AttachDTO upload(MultipartFile file) {
        String pathFolder = getYMDString();
        File folder = new File(uploadFolder + pathFolder);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String extension = getExtension(file.getOriginalFilename());
        AttachEntity entity = saveAttach(pathFolder, extension, file);
        AttachDTO dto = toDTO(entity);

        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get(uploadFolder + pathFolder + "/" + entity.getId() + "." + extension);
            Files.write(path, bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dto;
    }


    public AttachDTO update(MultipartFile file, String id) {
        if (id != null) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    delete(id);
                }
            };
            thread.start();
        }
        return upload(file);
    }

    private AttachEntity saveAttach(String pathFolder, String extension, MultipartFile file) {
        AttachEntity entity = new AttachEntity();
        entity.setPath(pathFolder);
        entity.setOriginalName(file.getOriginalFilename());
        entity.setExtension(extension);
        entity.setSize(file.getSize());
        attachRepository.save(entity);
        return entity;
    }

    public byte[] openGeneral(String id) {
        byte[] data;
        try {
            AttachEntity entity = getById(id);
            String path = entity.getPath() + "/" + id + "." + entity.getExtension();
            Path file = Paths.get(uploadFolder + path);
            data = Files.readAllBytes(file);
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    public ResponseEntity<Resource> download(String id) {
        try {
            AttachEntity entity = getById(id);
            String path = entity.getPath() + "/" + id + "." + entity.getExtension();
            Path file = Paths.get(uploadFolder + path);
            Resource resource = new UrlResource(file.toUri());

            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                                "attachment; filename=\"" + entity.getOriginalName() + "\"")
                        .body(resource);
            } else {
                throw new AppBadRequestException("File is not readable or not found !");
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean delete(String key) {
        AttachEntity entity = getById(key);

        File file = new File(uploadFolder + entity.getPath() +
                "/" + entity.getId() + "." + entity.getExtension());

        if (file.delete()) {
            attachRepository.deleteById(key);
            return true;
        } else throw new AppBadRequestException("Could not read the file!");
    }


    private AttachEntity getById(String id) {
        return attachRepository.findById(id).orElseThrow(() -> {
            throw new ItemNotFoundException("Attach not found");
        });
    }

    private String getExtension(String fileName) {
        int lastIndex = fileName.lastIndexOf(".");
        return fileName.substring(lastIndex + 1);
    }

    private AttachDTO toDTO(AttachEntity entity) {
        AttachDTO dto = new AttachDTO();
        dto.setId(entity.getId());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setOrigenName(entity.getOriginalName());
        dto.setUrl(downloadUrl+entity.getId());
        dto.setSize(entity.getSize());
        return dto;
    }


    //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

    public String getYMDString() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int day = Calendar.getInstance().get(Calendar.DATE);

        return year + "/" + month + "/" + day; // 2022/04/23
    }


}
