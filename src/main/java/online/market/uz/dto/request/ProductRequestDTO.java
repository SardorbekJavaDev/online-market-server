package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.ProductEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductRequestDTO implements Serializable {

    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name not valid")
    private String name;
    @NotBlank(message = "Model required")
    @Size(min = 3, max = 50, message = "Model not valid")
    private String model;
    @Size(min = 3, max = 10, message = "Status not valid")
    private String status;
    @NotBlank(message = "Brand ID required")
    @Size(min = 30, max = 40, message = "Brand ID id not valid")
    private String brandId;
    @NotBlank(message = "Category ID required")
    @Size(min = 30, max = 40, message = "Category ID id not valid")
    private String categoryId;

}