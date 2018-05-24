package edu.amy.course.topic.dataaccess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by amya0316 on 4/9/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "topic")
public class Topic {
    @Id
    private UUID id;
    private String name;
    private String description;

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
