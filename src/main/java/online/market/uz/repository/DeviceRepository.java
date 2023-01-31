package online.market.uz.repository;

import online.market.uz.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepository extends JpaRepository<DeviceEntity, String> {
    List<DeviceEntity> findByProfileId(String id);

    DeviceEntity deleteByDeviceIdAndProfileId(String deviceId, String profileId);
}