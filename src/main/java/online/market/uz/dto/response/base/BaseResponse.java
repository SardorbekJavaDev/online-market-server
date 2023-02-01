package online.market.uz.dto.response.base;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class BaseResponse {
    private String id;
    private LocalDateTime createdDate;

}
