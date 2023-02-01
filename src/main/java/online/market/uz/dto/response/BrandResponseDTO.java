package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandResponseDTO extends BaseResponse {

    private String name;
    private String type;
    private String status;

}