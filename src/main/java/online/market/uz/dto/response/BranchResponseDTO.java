package online.market.uz.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import online.market.uz.dto.response.base.BaseResponse;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BranchEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchResponseDTO extends BaseResponse {

    private String name;
    private Boolean status;
    private String locationId;
    private String profileId;

}