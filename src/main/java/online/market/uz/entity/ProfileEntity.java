package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class ProfileEntity extends BaseEntity {

    @Column(name = "name", length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "surname", length = Integer.MAX_VALUE)
    private String surname;

    @Column(name = "phone", length = Integer.MAX_VALUE)
    private String phone;

    @Column(name = "birthDate")
    private Instant birthDate;

    @Column(name = "password", length = Integer.MAX_VALUE)
    private String password;

    @Column(name = "userRole", length = Integer.MAX_VALUE)
    private String userRole;

    @Column(name = "billing_information_id")
    private String billingInformationId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "billing_information_id",  insertable = false,updatable = false)
    private BillingInformationEntity billingInformation;

}