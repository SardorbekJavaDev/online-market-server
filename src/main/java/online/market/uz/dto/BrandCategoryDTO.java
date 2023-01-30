package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.BaseEntity;
import online.market.uz.entity.BrandEntity;
import online.market.uz.entity.CategoryEntity;

import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BrandCategoryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandCategoryDTO {

    private String id;
    private String brandId;
    private String categoryId;
    private LocalDateTime createdDate;

}