package online.market.uz.service;

import online.market.uz.dto.request.DeviceRequestDTO;
import online.market.uz.dto.response.DeviceResponseDTO;

import java.util.List;

public interface DeviceService {
    DeviceResponseDTO create(DeviceRequestDTO dto);

    List<DeviceResponseDTO> getDeviceByProfileId(String id);

    Boolean delete(String deviceId, String pId);
}


