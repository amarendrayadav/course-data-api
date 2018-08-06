package edu.amy.course.testMisc.dataaccess;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Created by amya0316 on 5/9/2018.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestRequest {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal studentsCount;
}
