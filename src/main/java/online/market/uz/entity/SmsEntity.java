package online.market.uz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.enums.SmsStatus;

@Getter
@Setter
@Entity
@Table(name = "sms_table")
public class SmsEntity extends BaseEntity {
    private String phone;
    private String content;
    private SmsStatus status;
}
