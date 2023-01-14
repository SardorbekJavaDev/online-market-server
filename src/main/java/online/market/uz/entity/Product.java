package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "model", length = Integer.MAX_VALUE)
    private String model;

    @Column(name = "brend_id", length = Integer.MAX_VALUE)
    private String brendId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "branch_id", length = Integer.MAX_VALUE)
    private String branchId;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "count")
    private Integer count;


}