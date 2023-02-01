package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.ProfileEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileRequestDTO implements Serializable {

    // Asosan Xodimlarni qo'shish uchun Admin tomonidan ishlatiladi
    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name not valid")
    private String name;
    @NotBlank(message = "Surname required")
    @Size(min = 3, max = 50, message = "Surname not valid")
    private String surname;
    @NotBlank(message = "Phone required")
    @Size(min = 9, max = 13, message = "Phone not valid")
    private String phone;
    @NotBlank(message = "Birth Date required")
    private Instant birthDate;
    @NotBlank(message = "Password required")
    @Size(min = 6, max = 20, message = "Password not valid")
    private String password;
    @NotBlank(message = "Password required")
    @Size(min = 6, max = 20, message = "Password not valid")
    private String userRole;
    private String billingInformationId;

}