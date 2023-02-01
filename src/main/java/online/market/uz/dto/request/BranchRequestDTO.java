package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BranchEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchRequestDTO implements Serializable {

    @NotBlank(message = "Name required")
    @Size(min = 3, max = 50, message = "Name not valid")
    private String name;
    @Size(min = 3, max = 10, message = "Status not valid")
    private String status;
    @NotBlank(message = "Location id required")
    @Size(min = 30, max = 40, message = "Location id not valid")
    private String locationId;
    @NotBlank(message = "Profile id required")
    @Size(min = 30, max = 40, message = "Profile id not valid")
    private String profileId;

}