package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "branch")
public class Branch extends BaseEntity{
    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "location_id", length = Integer.MAX_VALUE)
    private String locationId;

    @Column(name = "status")
    private Boolean status;

}