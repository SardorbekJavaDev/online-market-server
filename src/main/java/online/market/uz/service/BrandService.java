package online.market.uz.service;

import online.market.uz.dto.request.BrandRequestDTO;
import online.market.uz.dto.response.BrandResponseDTO;

public interface BrandService{
    BrandResponseDTO create(BrandRequestDTO dto);

    BrandResponseDTO update(BrandRequestDTO dto, String bId);

    Boolean delete(String bId);

    BrandResponseDTO getById(String bId);
}