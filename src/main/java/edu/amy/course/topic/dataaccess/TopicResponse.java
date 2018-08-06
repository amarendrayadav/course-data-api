package edu.amy.course.topic.dataaccess;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by amya0316 on 5/9/2018.
 */
@Data
public class TopicResponse {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal studentsCount;
}
