package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandRequestDTO {

    @NotBlank(message = "Name required")
    @Size(max = 20, message = "Name not valid")
    private String name;
    @NotBlank(message = "Type required")
    @Size(min = 3, max = 50, message = "Type not valid")
    private String type;
    @Size(min = 3, max = 10, message = "Status not valid")
    private String status;

}