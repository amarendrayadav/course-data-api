package edu.amy.course.config;

import edu.amy.course.topic.dataaccess.Topic;
import edu.amy.course.topic.dataaccess.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by amya0316 on 5/6/2018.
 */
@EnableMongoRepositories(basePackages = "edu.amy.course")
@Configuration
public class MongoDbConfig {
    /*@Bean
    CommandLineRunner commandLineRunner(TopicRepository topicRepository) {
        return strings -> {
            topicRepository.save(new Topic("B.A", "Arts"));
            topicRepository.save(new Topic("L.L.B", "Law"));
            topicRepository.save(new Topic("B.Pharm", "Pharmacy"));
            topicRepository.save(new Topic("B.Sc", "Science"));
        };
    }*/
}
