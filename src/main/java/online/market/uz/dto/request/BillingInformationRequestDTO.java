package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BillingInformationEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingInformationRequestDTO implements Serializable {

    @NotBlank(message = "Passport Front required")
    private String passportFront;
    @NotBlank(message = "Passport Back required")
    private String passportBack;
    @NotBlank(message = "Passport Selfie required")
    private String passportSelfie;
    @NotBlank(message = "Phone 1 required")
    @Size(min = 9, max = 13, message = "Phone 1 not valid")
    private String phone1;
    @NotBlank(message = "Phone 2 required")
    @Size(min = 9, max = 13, message = "Phone 2 not valid")
    private String phone2;
    @NotBlank(message = "Phone required")
    private String cardId;

}