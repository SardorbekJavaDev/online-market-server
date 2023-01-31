package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.BillingInformationRequestDTO;
import online.market.uz.dto.response.BillingInformationResponseDTO;
import online.market.uz.service.BillingInformationService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BillingInformationServiceImpl implements BillingInformationService {

    @Override
    public BillingInformationResponseDTO create(BillingInformationRequestDTO dto) {
        return null;
    }

    @Override
    public BillingInformationResponseDTO update(BillingInformationRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public BillingInformationResponseDTO getById(String bId) {
        return null;
    }
}