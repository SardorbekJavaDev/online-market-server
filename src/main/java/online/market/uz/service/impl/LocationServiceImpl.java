package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.LocationRequestDTO;
import online.market.uz.dto.response.LocationResponseDTO;
import online.market.uz.service.LocationService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {
    @Override
    public LocationResponseDTO create(LocationRequestDTO dto) {
        return null;
    }

    @Override
    public LocationResponseDTO update(LocationRequestDTO dto, String bId) {
        return null;
    }

    @Override
    public Boolean delete(String bId) {
        return null;
    }

    @Override
    public LocationResponseDTO getById(String bId) {
        return null;
    }
}
