package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.PaymentTypeRequestDTO;
import online.market.uz.dto.response.PaymentTypeResponseDTO;
import online.market.uz.service.PaymentTypeService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentTypeServiceImpl implements PaymentTypeService {
    @Override
    public PaymentTypeResponseDTO create(PaymentTypeRequestDTO dto) {
        return null;
    }

    @Override
    public PaymentTypeResponseDTO update(PaymentTypeRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public PaymentTypeResponseDTO getById(String bId) {
        return null;
    }
}
