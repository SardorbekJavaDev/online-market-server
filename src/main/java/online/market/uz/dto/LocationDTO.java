package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.LocationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDTO implements Serializable {

    private String id;
    private String name;
    private String status;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private LocalDateTime createdDate;

}