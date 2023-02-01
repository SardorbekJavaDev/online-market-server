package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BillingInformationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingInformationResponseDTO extends BaseResponse {

    private String passportFront;
    private String passportBack;
    private String passportSelfie;
    private String phone1;
    private String phone2;
    private String cardId;

}