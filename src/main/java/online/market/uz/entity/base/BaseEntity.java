
package online.market.uz.entity.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.ProfileEntity;
import online.market.uz.enums.GeneralStatus;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Setter
@Getter
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private String id;

    @Column
    private Boolean visible;

    @Column
    private LocalDateTime deletedDate;

    @CreatedDate
    private LocalDateTime createdDate;
    @UpdateTimestamp
    private LocalDateTime updatedDate;

    @OneToOne
    @JoinColumn(name = "profile_id")
    @CreatedBy
    ProfileEntity createdBy;

}
