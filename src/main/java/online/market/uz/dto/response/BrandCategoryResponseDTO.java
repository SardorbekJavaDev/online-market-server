package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandCategoryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandCategoryResponseDTO extends BaseResponse {

    private String brandId;
    private String categoryId;

}