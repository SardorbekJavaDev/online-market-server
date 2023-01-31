package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.CardRequestDTO;
import online.market.uz.dto.response.CardResponseDTO;
import online.market.uz.service.CardService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    @Override
    public CardResponseDTO create(CardRequestDTO dto) {
        return null;
    }

    @Override
    public CardResponseDTO update(CardRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public CardResponseDTO getById(String bId) {
        return null;
    }
}