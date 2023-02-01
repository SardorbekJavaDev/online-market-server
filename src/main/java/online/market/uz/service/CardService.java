package online.market.uz.service;

import online.market.uz.dto.request.CardRequestDTO;
import online.market.uz.dto.response.CardResponseDTO;

public interface CardService  {
    CardResponseDTO create(CardRequestDTO dto);

    CardResponseDTO update(CardRequestDTO dto, String bId);

    Boolean delete(String bId);

    CardResponseDTO getById(String bId);
}