package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CategoryEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO implements Serializable {

    private String id;
    private String name;
    private String status;
    private String parentCategoryId;
    private LocalDateTime createdDate;

}