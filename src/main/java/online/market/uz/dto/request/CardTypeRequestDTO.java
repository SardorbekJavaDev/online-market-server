package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.CardTypeEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CardTypeRequestDTO implements Serializable {

    @NotBlank(message = "Type required")
    @Size(min = 3, max = 20, message = "Type not valid")
    private String type;
    @Size(min = 4, max = 8, message = "Prime number not valid")
    private String primeNumber;

}