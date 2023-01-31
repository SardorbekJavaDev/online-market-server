package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.CardTypeRequestDTO;
import online.market.uz.dto.response.CardTypeResponseDTO;
import online.market.uz.service.CardTypeService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardTypeServiceImpl implements CardTypeService {
    @Override
    public CardTypeResponseDTO create(CardTypeRequestDTO dto) {
        return null;
    }

    @Override
    public CardTypeResponseDTO update(CardTypeRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public CardTypeResponseDTO getById(String bId) {
        return null;
    }
}
