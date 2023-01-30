package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.entity.DeviceEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link DeviceEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceDTO implements Serializable {

    private String id;
    private String deviceType;
    private String deviceToken;
    private String status;
    private LocalDateTime createdDate;

}