package edu.amy.course.config.TestSpringConfigurations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by amya0316 on 5/25/2018.
 */
@Configuration
public class MyConfiguration {
    @Bean
    public MyRepository myFirstRepository() {
        return new MyRepository("first", "repository");
    }

    //a bean that will be injected by name into myService
    @Bean
    public MyRepository mySecondRepository() {
        return new MyRepository("second", "repository");
    }
    /*@Bean
    public MyService myService(MyRepository mySecondRepository) {
        return new MyService(mySecondRepository);
    }*/


    @Bean
    public MyService myService(@Qualifier("myFirstRepository") MyRepository someRepository) {
        return new MyService(someRepository);
    }
}
