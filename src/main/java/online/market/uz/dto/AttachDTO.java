package online.market.uz.dto;

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
public class AttachDTO {

    private String id;
    private String origenName;
    private String url;
    private long size;
    private LocalDateTime createdDate;

}
