package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import online.market.uz.enums.GeneralStatus;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A DTO for the {@link online.market.uz.entity.LocationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationRequestDTO implements Serializable {

    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name not valid")
    private String name;
    @NotBlank(message = "Latitude required")
    private BigDecimal latitude;
    @NotBlank(message = "Longitude required")
    private BigDecimal longitude;

}