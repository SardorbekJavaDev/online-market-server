package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import online.market.uz.entity.OrderEntity;
import online.market.uz.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link OrderEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRequestDTO {
//  count, installments, initialPay
    @NotBlank(message = "Count required")
    private Integer count;
    @NotBlank(message = "Installments required")
    private Integer installments;
    @NotBlank(message = "Initial Pay required")
    private Boolean initialPay;
    @NotBlank(message = "Delivery ID required")
    @Size(min = 30, max = 40, message = "Delivery ID not valid")
    private String deliveryId;
    @NotBlank(message = "Payment ID required")
    @Size(min = 30, max = 40, message = "Payment ID not valid")
    private String paymentTypeId;

}