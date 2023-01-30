package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandDTO  {

    private String id;
    private String name;
    private String type;
    private String status;
    private LocalDateTime createdDate;

}