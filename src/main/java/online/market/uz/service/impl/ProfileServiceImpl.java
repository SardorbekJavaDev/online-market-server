package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.ProfileRequestDTO;
import online.market.uz.dto.response.ProfileResponseDTO;
import online.market.uz.service.ProfileService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    @Override
    public ProfileResponseDTO create(ProfileRequestDTO dto) {
        return null;
    }

    @Override
    public ProfileResponseDTO update(ProfileRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public ProfileResponseDTO getById(String bId) {
        return null;
    }
}
