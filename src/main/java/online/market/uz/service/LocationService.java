package online.market.uz.service;

import online.market.uz.dto.request.LocationRequestDTO;
import online.market.uz.dto.response.LocationResponseDTO;

public interface LocationService {
    LocationResponseDTO create(LocationRequestDTO dto);

    LocationResponseDTO update(LocationRequestDTO dto, String bId);

    Boolean delete(String bId);

    LocationResponseDTO getById(String bId);
}
