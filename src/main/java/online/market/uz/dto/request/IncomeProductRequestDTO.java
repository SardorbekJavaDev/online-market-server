package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.IncomeProductEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncomeProductRequestDTO implements Serializable {

    @NotBlank(message = "Count required")
    private int count;
    @NotBlank(message = "Product ID required")
    @Size(min = 30, max = 40, message = "Product ID not valid")
    private String productId;
    @NotBlank(message = "Branch ID required")
    @Size(min = 30, max = 40, message = "Branch ID not valid")
    private String branchId;

}