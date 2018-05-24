package edu.amy.course.core.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import javax.persistence.Column;
import java.util.UUID;

/**
 * Created by amya0316 on 4/22/2018.
 */
@Data
@NoArgsConstructor
public abstract class AbstractEntity {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    public UUID id;
    @Version
    private Long version;

    public AbstractEntity(UUID id) {
        this.id = id != null ? id : UUID.fromString("00000000-0000-0000-0000-000000000000");
    }
}
