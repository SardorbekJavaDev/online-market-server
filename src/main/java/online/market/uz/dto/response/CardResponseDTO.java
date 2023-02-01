package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CardEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardResponseDTO extends BaseResponse {

    private String name;
    private String number;
    private String validityPeriod;
    private String cvv;
    private String bank;
    private String phone;
    private Boolean status;
    private String cardTypeId;

}