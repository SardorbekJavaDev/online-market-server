package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import online.market.uz.entity.DeliveryEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link DeliveryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryRequestDTO implements Serializable {

    @NotBlank(message = "Type required")
    @Size(min = 3, max = 20, message = "Type not valid")
    private String type;
    @NotBlank(message = "Price required")
    private long price;
    @NotBlank(message = "Delivery Time required")
    private LocalDateTime deliveryTime;

}