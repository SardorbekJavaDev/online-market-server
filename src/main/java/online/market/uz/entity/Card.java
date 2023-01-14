package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "card")
public class Card {
    @Id
    @Column(name = "id", nullable = false, length = Integer.MAX_VALUE)
    private String id;

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "number", length = Integer.MAX_VALUE)
    private String number;

    @Column(name = "validaty_period", length = Integer.MAX_VALUE)
    private String validatyPeriod;

    @Column(name = "cvv", length = Integer.MAX_VALUE)
    private String cvv;

    @Column(name = "bank", length = Integer.MAX_VALUE)
    private String bank;

    @Column(name = "phone", length = Integer.MAX_VALUE)
    private String phone;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "card_type_id", length = Integer.MAX_VALUE)
    private String cardTypeId;

}