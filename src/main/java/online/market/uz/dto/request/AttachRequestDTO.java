package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
/**
 * A DTO for the {@link online.market.uz.entity.AttachEntity entity
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachRequestDTO {

    @NotBlank(message = "Url required")
    private String url;

}
