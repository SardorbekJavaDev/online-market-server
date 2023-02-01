package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import online.market.uz.enums.CategoryStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CategoryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryRequestDTO implements Serializable {

    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name not valid")
    private String name;
    @Size(min = 3, max = 10, message = "Status not valid")
    private CategoryStatus status;
    @Size(min = 30, max = 40, message = "Card Type id not valid")
    private String parentCategoryId;

}