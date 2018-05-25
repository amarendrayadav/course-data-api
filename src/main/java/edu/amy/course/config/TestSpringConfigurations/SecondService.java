package edu.amy.course.config.TestSpringConfigurations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by amya0316 on 5/25/2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondService {
    private FirstService firstService;

}
