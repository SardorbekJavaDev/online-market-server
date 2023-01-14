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
@Table(name = "\"order\"")
public class Order {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "count")
    private Integer count;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "due_amount")
    private BigDecimal dueAmount;

    @Column(name = "paid_amount")
    private BigDecimal paidAmount;

    @Column(name = "installments")
    private Integer installments;

    @Column(name = "status", length = Integer.MAX_VALUE)
    private String status;

    @Column(name = "delivery_id", length = Integer.MAX_VALUE)
    private String deliveryId;

    @Column(name = "payment_type_id", length = Integer.MAX_VALUE)
    private String paymentTypeId;

    @Column(name = "end_date")
    private Instant endDate;

}