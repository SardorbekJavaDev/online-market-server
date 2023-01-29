package online.market.uz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "card")
public class CardEntity extends BaseEntity{

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "number", length = Integer.MAX_VALUE)
    private String number;

    @Column(name = "validity_period", length = Integer.MAX_VALUE)
    private String validityPeriod;

    @Column(name = "cvv", length = Integer.MAX_VALUE)
    private String cvv;

    @Column(name = "bank", length = Integer.MAX_VALUE)
    private String bank;

    @Column(name = "phone", length = Integer.MAX_VALUE)
    private String phone;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "card_type_id")
    private String cardTypeId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_type_id",  insertable = false,updatable = false)
    private CardTypeEntity cardType;

}