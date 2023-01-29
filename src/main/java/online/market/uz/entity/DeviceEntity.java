package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "device")
public class DeviceEntity extends BaseEntity{

    @Column(name = "device_type", length = Integer.MAX_VALUE)
    private String deviceType;

    @Column(name = "device_token", length = Integer.MAX_VALUE)
    private String deviceToken;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "profile_id",insertable = false, updatable = false)
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id",  insertable = false,updatable = false)
    private ProfileEntity profile;

}