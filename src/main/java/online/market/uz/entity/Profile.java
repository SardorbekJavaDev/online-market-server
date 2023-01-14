package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile extends BaseEntity{


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

    @Column(name = "billing_information_id", length = Integer.MAX_VALUE)
    private String billingInformationId;

}