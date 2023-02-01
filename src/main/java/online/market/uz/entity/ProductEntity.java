package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity{

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "model", length = Integer.MAX_VALUE)
    private String model;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "brand_id", length = Integer.MAX_VALUE)
    private String brandId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id",  insertable = false,updatable = false)
    private BrandEntity brand;

    @Column(name = "category_id")
    private String categoryId;
    @ManyToOne(fetch = FetchType.LAZY)
    // TODO: 2/1/2023 Har bitta category qo'shish uchun bitta so'rov yuboramanmi logichna emasku ???
    @JoinColumn(name = "category_id",  insertable = false,updatable = false)
    private CategoryEntity category;

}