package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CardTypeEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardTypeDTO implements Serializable {

    private String id;
    private String type;
    private String primeNumber;
    private Boolean status;
    private LocalDateTime createdDate;

}