package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.dto.response.base.BaseResponse;

import java.time.LocalDateTime;
/**
 * A DTO for the {@link online.market.uz.entity.AttachEntity entity
 */
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachResponseDTO extends BaseResponse {

    private String origenName;
    private String url;
    private long size;

}
