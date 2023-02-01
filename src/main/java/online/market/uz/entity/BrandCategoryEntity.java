package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.base.BaseWithStatusEntity;
import online.market.uz.entity.base.BaseWithoutStatusEntity;

@Getter
@Setter
@Entity
@Table(name = "brand_category")
public class BrandCategoryEntity extends BaseWithoutStatusEntity {

    @Column(name = "brand_id")
    private String brandId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id",  insertable = false,updatable = false)
    private BrandEntity brand;

    @Column(name = "category_id")
    private String categoryId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",insertable = false, updatable = false)
    private CategoryEntity category;

}