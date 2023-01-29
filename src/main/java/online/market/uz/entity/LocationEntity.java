package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Entity
@Table(name = "location")
public class LocationEntity extends BaseEntity{

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @Column(name = "profile_id", insertable = false, updatable = false)
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id",  insertable = false,updatable = false)
    private ProfileEntity profile;
}