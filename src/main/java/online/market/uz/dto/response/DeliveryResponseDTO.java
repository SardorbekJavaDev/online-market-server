package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;
import online.market.uz.entity.DeliveryEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link DeliveryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryResponseDTO extends BaseResponse {

    private String type;
    private BigDecimal price;
    private Instant deliveryTime;
    private Boolean status;

}