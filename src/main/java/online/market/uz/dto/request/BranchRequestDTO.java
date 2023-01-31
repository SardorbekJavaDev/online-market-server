package online.market.uz.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * A DTO for the {@link online.market.uz.entity.BranchEntity} entity
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BranchRequestDTO implements Serializable {

    private String id;
    private String name;
    private Boolean status;
    private String locationId;
    private String profileId;
    private LocalDateTime createdDate;
}