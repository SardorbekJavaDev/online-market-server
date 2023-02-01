package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandCategoryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandCategoryRequestDTO {

    @NotBlank(message = "Brand id required")
    @Size(min = 30, max = 40, message = "Brand id not valid")
    private String brandId;
    @NotBlank(message = "Category id required")
    @Size(min = 30, max = 40, message = "Category id not valid")
    private String categoryId;

}