package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.enums.SmsStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.SmsEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsRequestDTO implements Serializable {

    // TODO: 2/1/2023 Buni ham Spring Security qo'shlgandan keyin ko'ramiz
    private String id;
    private String phone;
    private String content;
    private SmsStatus status;
    private LocalDateTime createdDate;

}