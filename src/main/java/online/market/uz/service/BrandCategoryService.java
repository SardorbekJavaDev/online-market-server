package online.market.uz.service;

import online.market.uz.dto.request.BrandCategoryRequestDTO;
import online.market.uz.dto.response.BrandCategoryResponseDTO;
import org.springframework.stereotype.Component;

public interface BrandCategoryService {
    BrandCategoryResponseDTO create(BrandCategoryRequestDTO dto);

    BrandCategoryResponseDTO update(BrandCategoryRequestDTO dto, String bId);

    Boolean delete(String bId);

    BrandCategoryResponseDTO getById(String bId);
}
