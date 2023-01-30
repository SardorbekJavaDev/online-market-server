package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.PaymentEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDTO implements Serializable {

    private String id;
    private BigDecimal amount;
    private Integer serviceId;
    private Integer transactionId;
    private Instant transactionTime;
    private String method;
    private String comment;
    private String orderId;
    private LocalDateTime createdDate;

}