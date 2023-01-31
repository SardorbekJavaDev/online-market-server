package online.market.uz.service;

import online.market.uz.dto.response.AttachResponseDTO;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface AttachService {

    AttachResponseDTO upload(MultipartFile file);

    AttachResponseDTO update(MultipartFile file, String id);

    byte[] openGeneral(String id);

    ResponseEntity<Resource> download(String id);

    Boolean delete(String key);

}
