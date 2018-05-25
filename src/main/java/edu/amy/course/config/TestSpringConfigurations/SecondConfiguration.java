package edu.amy.course.config.TestSpringConfigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by amya0316 on 5/25/2018.
 */
@Configuration
public class SecondConfiguration {

    @Autowired
    private FirstConfiguration firstConfiguration;

    @Bean
    public SecondService secondService() {
        return new SecondService();
    }
    @Bean
    public SecondService secondService(FirstService firstService) {
        return new SecondService(firstService);
    }
}
