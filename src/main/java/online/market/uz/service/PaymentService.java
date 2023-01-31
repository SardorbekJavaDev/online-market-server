package online.market.uz.service;

import online.market.uz.dto.request.PaymentRequestDTO;
import online.market.uz.dto.response.PaymentResponseDTO;

public interface PaymentService {
    PaymentResponseDTO create(PaymentRequestDTO dto);

    PaymentResponseDTO update(PaymentRequestDTO dto, String bId);

    Boolean delete(String bId);

    PaymentResponseDTO getById(String bId);
}
