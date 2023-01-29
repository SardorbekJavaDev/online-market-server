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
@Table(name = "card_type")
public class CardTypeEntity extends BaseEntity{

    @Column(name = "type", length = Integer.MAX_VALUE)
    private String type;

    @Column(name = "prime_number", length = Integer.MAX_VALUE)
    private String primeNumber;

    @Column(name = "status")
    private Boolean status;

}