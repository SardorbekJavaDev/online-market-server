package online.market.uz.service;

import online.market.uz.dto.request.BillingInformationRequestDTO;
import online.market.uz.dto.response.BillingInformationResponseDTO;

public interface BillingInformationService {
    BillingInformationResponseDTO create(BillingInformationRequestDTO dto);

    BillingInformationResponseDTO update(BillingInformationRequestDTO dto, String bId);

    Boolean delete(String bId);

    BillingInformationResponseDTO getById(String bId);
}