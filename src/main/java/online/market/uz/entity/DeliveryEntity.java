package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.base.BaseWithStatusEntity;

import java.math.BigDecimal;
import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "delivery")
public class DeliveryEntity  extends BaseWithStatusEntity {

    @Column(name = "type", length = Integer.MAX_VALUE)
    private String type;

    @Column(name = "price")
    private long price;

    @Column(name = "delivery_time")
    private Instant deliveryTime;

}