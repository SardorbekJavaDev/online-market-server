package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "brand_category")
public class BrandCategoryEntity extends BaseEntity {

    @Column(name = "brand_id")
    private String brandId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id",  insertable = false,updatable = false)
    private BrandEntity brand;

    @Column(name = "category_id")
    private String categoryId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

}