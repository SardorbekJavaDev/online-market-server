package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class OrderEntity extends BaseEntity {

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

    @Column(name = "end_date")
    private Instant endDate;

    @Column(name = "initial_pay")
    private Boolean initialPay;

    @Column(name = "delivery_id")
    private String deliveryId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id", insertable = false, updatable = false)
    private DeliveryEntity delivery;

    @Column(name = "payment_type_id")
    private String paymentTypeId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_type_id", insertable = false, updatable = false)
    private PaymentTypeEntity paymentType;

    @Column(name = "profile_id", insertable = false, updatable = false)
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", insertable = false, updatable = false)
    private ProfileEntity profile;

}