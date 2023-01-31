package online.market.uz.service;

import online.market.uz.dto.request.OrderProductRequestDTO;
import online.market.uz.dto.response.OrderProductResponseDTO;

public interface OrderProductService {
    OrderProductResponseDTO create(OrderProductRequestDTO dto);

    OrderProductResponseDTO update(OrderProductRequestDTO dto, String bId);

    Boolean delete(String bId);

    OrderProductResponseDTO getById(String bId);
}
