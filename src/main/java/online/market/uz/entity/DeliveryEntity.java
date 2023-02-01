package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.enums.DeliveryStatus;
import online.market.uz.enums.DeliveryType;

import java.math.BigDecimal;
import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "delivery")
public class DeliveryEntity  extends BaseEntity {

    @Column(name = "type", length = Integer.MAX_VALUE)
    private DeliveryType type;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "delivery_time")
    private Instant deliveryTime;

    @Column(name = "status")
    private DeliveryStatus status;

}