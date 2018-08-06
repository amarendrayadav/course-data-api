package edu.amy.course.testMisc.dataaccess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by amya0316 on 4/9/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "test_miscellenous")
public class TestEntity {
    @Id
    private UUID id;
    private String name;
    private String description;
    private BigDecimal studentsCount;

    public TestEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
