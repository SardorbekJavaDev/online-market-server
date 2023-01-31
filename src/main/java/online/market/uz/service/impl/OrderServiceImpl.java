package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.OrderRequestDTO;
import online.market.uz.dto.response.OrderResponseDTO;
import online.market.uz.service.OrderService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderResponseDTO create(OrderRequestDTO dto) {
        return null;
    }

    @Override
    public OrderResponseDTO update(OrderRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public OrderResponseDTO getById(String bId) {
        return null;
    }
}
