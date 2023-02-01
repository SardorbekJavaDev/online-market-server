package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.base.BaseWithoutStatusEntity;
import online.market.uz.enums.PaymentType;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class PaymentEntity extends BaseWithoutStatusEntity {

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "service_id")
    private Integer serviceId;

    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "transaction_time")
    private Instant transactionTime;

    @Column(name = "method", length = Integer.MAX_VALUE)
    private String method;

    @Column(name = "comment", length = Integer.MAX_VALUE)
    private String comment;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "order_id")
    private String orderId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private OrderEntity order;

    @Column(name = "profile_id",insertable = false, updatable = false)
    private String profileId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", insertable = false, updatable = false)
    private ProfileEntity profile;

}