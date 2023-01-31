package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.PaymentRequestDTO;
import online.market.uz.dto.response.PaymentResponseDTO;
import online.market.uz.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    @Override
    public PaymentResponseDTO create(PaymentRequestDTO dto) {
        return null;
    }

    @Override
    public PaymentResponseDTO update(PaymentRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public PaymentResponseDTO getById(String bId) {
        return null;
    }
}
