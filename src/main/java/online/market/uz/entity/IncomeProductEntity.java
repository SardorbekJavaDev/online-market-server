package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "income_product")
public class IncomeProductEntity extends BaseEntity{

    private int count;

    @Column(name = "product_id")
    private String productId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",  insertable = false,updatable = false)
    private ProductEntity product;

    @Column(name = "branch_id")
    private String branchId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id",  insertable = false,updatable = false)
    private BranchEntity branch;

}
