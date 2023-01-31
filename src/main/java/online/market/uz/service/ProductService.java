package online.market.uz.service;

import online.market.uz.dto.request.ProductRequestDTO;
import online.market.uz.dto.response.ProductResponseDTO;

public interface ProductService {
    ProductResponseDTO create(ProductRequestDTO dto);

    ProductResponseDTO update(ProductRequestDTO dto, String bId);

    Boolean delete(String bId);

    ProductResponseDTO getById(String bId);
}
