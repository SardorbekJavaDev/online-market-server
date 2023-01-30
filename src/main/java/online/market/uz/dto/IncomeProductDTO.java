package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.IncomeProductEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncomeProductDTO implements Serializable {

    private String id;
    private int count;
    private String productId;
    private String branchId;
    private LocalDateTime createdDate;

}