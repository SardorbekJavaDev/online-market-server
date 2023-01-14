package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "device")
public class Device {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "device_type", length = Integer.MAX_VALUE)
    private String deviceType;

    @Column(name = "device_token", length = Integer.MAX_VALUE)
    private String deviceToken;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

}