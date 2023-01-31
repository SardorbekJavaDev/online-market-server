package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.BranchRequestDTO;
import online.market.uz.dto.response.BranchResponseDTO;
import online.market.uz.service.BranchService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {
    @Override
    public BranchResponseDTO create(BranchRequestDTO dto) {
        return null;
    }

    @Override
    public BranchResponseDTO update(BranchRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public BranchResponseDTO getById(String bId) {
        return null;
    }
}
