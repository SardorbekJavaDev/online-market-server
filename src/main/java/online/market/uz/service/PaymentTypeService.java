package online.market.uz.service;

import online.market.uz.dto.request.PaymentTypeRequestDTO;
import online.market.uz.dto.response.PaymentTypeResponseDTO;

public interface PaymentTypeService {
    PaymentTypeResponseDTO create(PaymentTypeRequestDTO dto);

    PaymentTypeResponseDTO update(PaymentTypeRequestDTO dto, String bId);

    Boolean delete(String bId);

    PaymentTypeResponseDTO getById(String bId);
}
