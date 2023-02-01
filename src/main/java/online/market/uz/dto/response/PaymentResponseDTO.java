package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.PaymentEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentResponseDTO extends BaseResponse {

    private BigDecimal amount;
    private Integer serviceId;
    private Integer transactionId;
    private Instant transactionTime;
    private String method;
    private String comment;
    private String orderId;

}