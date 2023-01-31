package online.market.uz.service;

import online.market.uz.dto.request.OrderRequestDTO;
import online.market.uz.dto.response.OrderResponseDTO;

public interface OrderService {
    OrderResponseDTO create(OrderRequestDTO dto);

    OrderResponseDTO update(OrderRequestDTO dto, String bId);

    Boolean delete(String bId);

    OrderResponseDTO getById(String bId);
}
