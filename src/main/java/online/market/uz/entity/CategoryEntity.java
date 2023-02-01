package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.base.BaseEntity;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "parent_category_id")
    private String parentCategoryId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_category_id", insertable = false, updatable = false)
    private CategoryEntity parentCategory;

}