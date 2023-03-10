package online.market.uz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import online.market.uz.entity.base.BaseWithoutStatusEntity;

@Getter
@Setter
@Entity
@Table(name = "attach")
public class AttachEntity extends BaseWithoutStatusEntity {

    @Column(name = "originalName", length = Integer.MAX_VALUE)
    private String originalName;

    @Column(name = "generatedName", length = Integer.MAX_VALUE)
    private String generatedName;

    @Column(name = "path", length = Integer.MAX_VALUE)
    private String path;

    @Column(name = "size")
    private Long size;

    @Column(name = "extension", length = Integer.MAX_VALUE)
    private String extension;

}