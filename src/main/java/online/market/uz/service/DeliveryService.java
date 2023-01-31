package online.market.uz.service;

import online.market.uz.dto.request.DeliveryRequestDTO;
import online.market.uz.dto.response.DeliveryResponseDTO;

public interface DeliveryService {
    DeliveryResponseDTO create(DeliveryRequestDTO dto);

    DeliveryResponseDTO update(DeliveryRequestDTO dto, String bId);

    Boolean delete(String bId);

    DeliveryResponseDTO getById(String bId);
}
