package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.PaymentTypeEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentTypeResponseDTO implements Serializable {

    private String id;
    private String name;
    private String status;
    private LocalDateTime createdDate;

}