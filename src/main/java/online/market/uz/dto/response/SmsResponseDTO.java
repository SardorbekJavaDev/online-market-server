package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;
import online.market.uz.enums.SmsStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.SmsEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmsResponseDTO extends BaseResponse {

    private String phone;
    private String content;
    private SmsStatus status;

}