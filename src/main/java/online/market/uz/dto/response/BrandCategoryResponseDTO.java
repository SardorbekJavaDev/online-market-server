package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandCategoryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandCategoryResponseDTO {

    private String id;
    private String brandId;
    private String categoryId;
    private LocalDateTime createdDate;

}