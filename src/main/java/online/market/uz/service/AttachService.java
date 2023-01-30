package online.market.uz.service;

import online.market.uz.dto.AttachDTO;
import online.market.uz.entity.AttachEntity;
import online.market.uz.exception.AppBadRequestException;
import online.market.uz.exception.ItemNotFoundException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

public interface AttachService {

    AttachDTO upload(MultipartFile file);

    AttachDTO update(MultipartFile file, String id);

    byte[] openGeneral(String id);

    ResponseEntity<Resource> download(String id);

    Boolean delete(String key);

}
