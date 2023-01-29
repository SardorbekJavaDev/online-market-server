package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_product")
public class OrderProductEntity extends BaseEntity{

    @Column(name = "product_id")
    private String productId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id",  insertable = false,updatable = false)
    private ProductEntity food;

    @Column(name = "order_id")
    private String orderId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;

}