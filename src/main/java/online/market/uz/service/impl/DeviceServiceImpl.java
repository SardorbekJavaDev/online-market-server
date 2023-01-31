package online.market.uz.service.impl;

import lombok.RequiredArgsConstructor;
import online.market.uz.dto.request.DeviceRequestDTO;
import online.market.uz.dto.response.DeviceResponseDTO;
import online.market.uz.entity.DeviceEntity;
import online.market.uz.repository.DeviceRepository;
import online.market.uz.service.DeviceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;
//    private final EntityDetails entityDetails;


    public DeviceResponseDTO create(DeviceRequestDTO dto) {
//        UserEntity userEntity = entityDetails.getUserEntity();

        DeviceEntity entity = new DeviceEntity();
        entity.setDeviceId(dto.getDeviceId());
        entity.setDeviceToken(dto.getDeviceToken());
        entity.setDeviceType(dto.getDeviceType());
//        entity.setUserId(userEntity.getId());
        deviceRepository.save(entity);

        return toDTO(entity);
    }


    public List<DeviceResponseDTO> getDeviceByProfileId(String id) {
        List<DeviceEntity> entityList = deviceRepository.findByProfileId(id);
        List<DeviceResponseDTO> dtoList = new ArrayList<>();
        for (DeviceEntity entity : entityList) {
            dtoList.add(toDTO(entity));
        }
        return dtoList;
    }

    @Override
    public Boolean delete(String deviceId, String pId) {
        deviceRepository.deleteByDeviceIdAndProfileId(deviceId, pId);
        return null;
    }


    private DeviceResponseDTO toDTO(DeviceEntity entity) {
        DeviceResponseDTO dto = new DeviceResponseDTO();
        dto.setDeviceId(entity.getDeviceId());
        dto.setDeviceType(dto.getDeviceType());
        dto.setDeviceToken(dto.getDeviceToken());
        dto.setId(entity.getId());
        dto.setCreatedDate(entity.getCreatedDate());
        return dto;
    }

}
