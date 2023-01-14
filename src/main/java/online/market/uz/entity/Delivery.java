package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "delivery")
public class Delivery {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "type", length = Integer.MAX_VALUE)
    private String type;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "delivery_time")
    private Instant deliveryTime;

    @Column(name = "status")
    private Boolean status;

}