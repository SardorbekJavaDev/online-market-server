package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.OrderProductEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderProductRequestDTO implements Serializable {

    private String id;
    private String productId;
    private String orderId;
    private LocalDateTime createdDate;

}