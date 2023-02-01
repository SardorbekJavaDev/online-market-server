package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import online.market.uz.entity.DeviceEntity;

import java.io.Serializable;

/**
 * A DTO for the {@link DeviceEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceRequestDTO implements Serializable {

    @NotBlank(message = "Device ID required")
    @Size(min = 5, max = 50, message = "Device id not valid")
    private String deviceId;
    @NotBlank(message = "Device Name required")
    @Size(min = 5, max = 50, message = "Device name id not valid")
    private String deviceName;
    @NotBlank(message = "Device Token required")
    @Size(min = 5, max = 50, message = "Device token not valid")
    private String deviceToken;

}