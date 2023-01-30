package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.entity.OrderEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link OrderEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    private String id;
    private Integer count;
    private BigDecimal totalAmount;
    private BigDecimal dueAmount;
    private BigDecimal paidAmount;
    private Integer installments;
    private String status;
    private Instant endDate;
    private String deliveryId;
    private String paymentTypeId;
    private LocalDateTime createdDate;

}