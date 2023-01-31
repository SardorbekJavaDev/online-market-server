package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.OrderProductRequestDTO;
import online.market.uz.dto.response.OrderProductResponseDTO;
import online.market.uz.service.OrderProductService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProductServiceImpl implements OrderProductService {
    @Override
    public OrderProductResponseDTO create(OrderProductRequestDTO dto) {
        return null;
    }

    @Override
    public OrderProductResponseDTO update(OrderProductRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public OrderProductResponseDTO getById(String bId) {
        return null;
    }
}
