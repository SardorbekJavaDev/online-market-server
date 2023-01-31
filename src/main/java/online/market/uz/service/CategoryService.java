package online.market.uz.service;

import online.market.uz.dto.request.CategoryRequestDTO;
import online.market.uz.dto.response.CategoryResponseDTO;

public interface CategoryService {
    CategoryResponseDTO create(CategoryRequestDTO dto);

    CategoryResponseDTO update(CategoryRequestDTO dto, String bId);

    Boolean delete(String bId);

    CategoryResponseDTO getById(String bId);
}
