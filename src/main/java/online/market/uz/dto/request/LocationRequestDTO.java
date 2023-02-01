package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.enums.LocationStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.LocationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationRequestDTO implements Serializable {

    private String name;
    private LocationStatus status;
    private BigDecimal latitude;
    private BigDecimal longitude;

}