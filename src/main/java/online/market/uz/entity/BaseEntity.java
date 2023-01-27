package online.market.uz.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false,nullable = false)
    private String id;

    @Column
    private Boolean visible;
    @CreatedDate
    private LocalDateTime createdDate;
    @UpdateTimestamp
    private LocalDateTime updatedDate;
    @Column
    private LocalDateTime deletedDate;

    @OneToOne
    @JoinColumn(name = "profile_id")
    @CreatedBy
    Profile profile;

}
