package online.market.uz.service;

import online.market.uz.dto.request.ProfileRequestDTO;
import online.market.uz.dto.response.ProfileResponseDTO;

public interface ProfileService {
    ProfileResponseDTO create(ProfileRequestDTO dto);

    ProfileResponseDTO update(ProfileRequestDTO dto, String bId);

    Boolean delete(String bId);

    ProfileResponseDTO getById(String bId);
}
