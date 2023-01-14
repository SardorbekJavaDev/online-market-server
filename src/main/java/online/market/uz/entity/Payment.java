package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "comment", length = Integer.MAX_VALUE)
    private String comment;

}