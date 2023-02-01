package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.LocationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationResponseDTO extends BaseResponse {

    private String name;
    private String status;
    private BigDecimal latitude;
    private BigDecimal longitude;

}