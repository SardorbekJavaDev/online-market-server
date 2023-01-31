package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.IncomeProductRequestDTO;
import online.market.uz.dto.response.IncomeProductResponseDTO;
import online.market.uz.service.IncomeProductService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncomeProductServiceImpl implements IncomeProductService {
    @Override
    public IncomeProductResponseDTO create(IncomeProductRequestDTO dto) {
        return null;
    }

    @Override
    public IncomeProductResponseDTO update(IncomeProductRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public IncomeProductResponseDTO getById(String bId) {
        return null;
    }
}
