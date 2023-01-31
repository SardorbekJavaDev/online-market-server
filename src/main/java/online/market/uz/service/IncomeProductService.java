package online.market.uz.service;

import online.market.uz.dto.request.IncomeProductRequestDTO;
import online.market.uz.dto.response.IncomeProductResponseDTO;

public interface IncomeProductService {
    IncomeProductResponseDTO create(IncomeProductRequestDTO dto);

    IncomeProductResponseDTO update(IncomeProductRequestDTO dto, String bId);

    Boolean delete(String bId);

    IncomeProductResponseDTO getById(String bId);
}
