package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.ProductEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponseDTO extends BaseResponse {

    private String name;
    private String model;
    private String status;
    private String brandId;
    private String categoryId;

}