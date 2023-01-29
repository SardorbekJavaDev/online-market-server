package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "billing_information")
public class BillingInformationEntity extends BaseEntity {

    @Column(name = "passport_front", length = Integer.MAX_VALUE)
    private String passportFront;

    @Column(name = "passport_back", length = Integer.MAX_VALUE)
    private String passportBack;

    @Column(name = "passport_selfie", length = Integer.MAX_VALUE)
    private String passportSelfie;

    @Column(name = "phone_1", length = Integer.MAX_VALUE)
    private String phone1;

    @Column(name = "phone_2", length = Integer.MAX_VALUE)
    private String phone2;

    @Column(name = "card_id")
    private String cardId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id",  insertable = false,updatable = false)
    private CardEntity card;

}