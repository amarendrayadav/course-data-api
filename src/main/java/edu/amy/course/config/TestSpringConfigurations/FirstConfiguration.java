package edu.amy.course.config.TestSpringConfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by amya0316 on 5/25/2018.
 */
@Configuration
public class FirstConfiguration {
    @Bean
    public FirstService firstService() {
        return new FirstService();
    }
}
