package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CardEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardRequestDTO implements Serializable {

    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name not valid")
    private String name;
    @NotBlank(message = "Number required")
    @Size(min = 16, max = 16, message = "Number not valid")
    private String number;
    @NotBlank(message = "Validity Period required")
    private LocalDate validityPeriod;
    @Size(min = 3, max = 5, message = "CVV not valid")
    private int cvv;
    @NotBlank(message = "Bank required")
    @Size(min = 3, max = 50, message = "Bank not valid")
    private String bank;
    @NotBlank(message = "Phone required")
    @Size(min = 9, max = 13, message = "Phone not valid")
    private String phone;
    @Size(min = 3, max = 10, message = "Status not valid")
    private Boolean status;
    @NotBlank(message = "Card Type required")
    @Size(min = 30, max = 40, message = "Card Type id not valid")
    private String cardTypeId;

}