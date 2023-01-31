package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CardEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardRequestDTO implements Serializable {

    private String id;
    private String name;
    private String number;
    private String validityPeriod;
    private String cvv;
    private String bank;
    private String phone;
    private Boolean status;
    private String cardTypeId;
    private LocalDateTime createdDate;
}