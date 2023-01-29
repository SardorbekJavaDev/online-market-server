package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "branch")
public class BranchEntity extends BaseEntity {
    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "location_id")
    private String locationId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id",  insertable = false,updatable = false)
    private LocationEntity food;

    @Column(name = "profile_id")
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id",  insertable = false,updatable = false)
    private ProfileEntity profile;

}