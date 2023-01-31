package online.market.uz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.ProfileEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfileDTO implements Serializable {

    private String id;
    private String name;
    private String surname;
    private String phone;
    private Instant birthDate;
    private String password;
    private String userRole;
    private String billingInformationId;
    private LocalDateTime createdDate;

}