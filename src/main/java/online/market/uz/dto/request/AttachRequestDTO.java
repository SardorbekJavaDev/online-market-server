package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
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

    private String id;
    private String origenName;
    private String url;
    private long size;
    private LocalDateTime createdDate;

}
