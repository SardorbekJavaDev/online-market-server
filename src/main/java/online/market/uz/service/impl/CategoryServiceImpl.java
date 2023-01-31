package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.CategoryRequestDTO;
import online.market.uz.dto.response.CategoryResponseDTO;
import online.market.uz.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Override
    public CategoryResponseDTO create(CategoryRequestDTO dto) {
        return null;
    }

    @Override
    public CategoryResponseDTO update(CategoryRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public CategoryResponseDTO getById(String bId) {
        return null;
    }
}
