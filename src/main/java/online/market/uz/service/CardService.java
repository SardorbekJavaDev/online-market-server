package online.market.uz.service;

import online.market.uz.dto.request.CardRequestDTO;
import online.market.uz.dto.response.CardResponseDTO;
import online.market.uz.entity.BaseEntity;

public interface CardService  {
    CardResponseDTO create(CardRequestDTO dto);

    CardResponseDTO update(CardRequestDTO dto, String bId);

    Boolean delete(String bId);

    CardResponseDTO getById(String bId);
}