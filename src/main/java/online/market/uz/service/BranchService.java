package online.market.uz.service;

import online.market.uz.dto.request.BranchRequestDTO;
import online.market.uz.dto.response.BillingInformationResponseDTO;
import online.market.uz.dto.response.BranchResponseDTO;

public interface BranchService {
    BranchResponseDTO create(BranchRequestDTO dto);

    BranchResponseDTO update(BranchRequestDTO dto, String bId);

    Boolean delete(String bId);

    BranchResponseDTO getById(String bId);
}
