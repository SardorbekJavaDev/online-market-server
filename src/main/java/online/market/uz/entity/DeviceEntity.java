package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.enums.DeliveryStatus;
import online.market.uz.enums.DeviceStatus;

@Getter
@Setter
@Entity
@Table(name = "device")
public class DeviceEntity extends BaseEntity{

    @Column(name = "device_id", length = Integer.MAX_VALUE)
    private String deviceId;

    @Column(name = "device_name", length = Integer.MAX_VALUE)
    private String deviceName;

    @Column(name = "device_token", length = Integer.MAX_VALUE)
    private String deviceToken;

    @Column(name = "status", length = Integer.MAX_VALUE)
    @Enumerated(EnumType.STRING)
    private DeviceStatus status;

    @Column(name = "profile_id",insertable = false, updatable = false)
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id",  insertable = false,updatable = false)
    private ProfileEntity profile;

}