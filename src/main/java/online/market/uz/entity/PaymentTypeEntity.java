package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "payment_type")
public class PaymentTypeEntity extends BaseEntity {

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

}