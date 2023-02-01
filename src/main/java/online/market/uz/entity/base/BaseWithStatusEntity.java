package online.market.uz.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.enums.GeneralStatus;

@Setter
@Getter
@MappedSuperclass
public class BaseWithStatusEntity extends BaseEntity {

    @Column
    private GeneralStatus status;

}
