package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.ProductRequestDTO;
import online.market.uz.dto.response.ProductResponseDTO;
import online.market.uz.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponseDTO create(ProductRequestDTO dto) {
        return null;
    }

    @Override
    public ProductResponseDTO update(ProductRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public ProductResponseDTO getById(String bId) {
        return null;
    }
}
