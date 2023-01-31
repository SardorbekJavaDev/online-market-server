package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.BrandRequestDTO;
import online.market.uz.dto.response.BrandResponseDTO;
import online.market.uz.service.BrandService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandCategoryServiceImpl implements BrandService {
    @Override
    public BrandResponseDTO create(BrandRequestDTO dto) {
        return null;
    }

    @Override
    public BrandResponseDTO update(BrandRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public BrandResponseDTO getById(String bId) {
        return null;
    }
}
