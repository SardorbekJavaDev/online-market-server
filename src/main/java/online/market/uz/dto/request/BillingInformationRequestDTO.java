package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BillingInformationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingInformationRequestDTO implements Serializable {

    private String id;
    private String passportFront;
    private String passportBack;
    private String passportSelfie;
    private String phone1;
    private String phone2;
    private String cardId;
    private LocalDateTime createdDate;

}