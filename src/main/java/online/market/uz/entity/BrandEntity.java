package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.base.BaseWithStatusEntity;

@Getter
@Setter
@Entity
@Table(name = "brand")
public class BrandEntity extends BaseWithStatusEntity {

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "type", length = Integer.MAX_VALUE)
    private String type;


}