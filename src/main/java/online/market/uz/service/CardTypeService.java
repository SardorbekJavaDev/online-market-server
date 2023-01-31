package online.market.uz.service;

import online.market.uz.dto.request.CardTypeRequestDTO;
import online.market.uz.dto.response.CardTypeResponseDTO;

public interface CardTypeService {
    CardTypeResponseDTO create(CardTypeRequestDTO dto);

    CardTypeResponseDTO update(CardTypeRequestDTO dto, String bId);

    Boolean delete(String bId);

    CardTypeResponseDTO getById(String bId);
}
