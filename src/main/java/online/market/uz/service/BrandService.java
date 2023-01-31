package online.market.uz.service;

import online.market.uz.dto.request.BrandRequestDTO;
import online.market.uz.dto.response.BrandResponseDTO;
import online.market.uz.entity.BaseEntity;

public interface BrandService{
    BrandResponseDTO create(BrandRequestDTO dto);

    BrandResponseDTO update(BrandRequestDTO dto, String bId);

    Boolean delete(String bId);

    BrandResponseDTO getById(String bId);
}