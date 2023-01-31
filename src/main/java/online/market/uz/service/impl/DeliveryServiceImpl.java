package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.DeliveryRequestDTO;
import online.market.uz.dto.response.DeliveryResponseDTO;
import online.market.uz.service.DeliveryService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {
    @Override
    public DeliveryResponseDTO create(DeliveryRequestDTO dto) {
        return null;
    }

    @Override
    public DeliveryResponseDTO update(DeliveryRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public DeliveryResponseDTO getById(String bId) {
        return null;
    }
}
