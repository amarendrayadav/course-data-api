package edu.amy.course.testMisc.dataaccess;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Created by amya0316 on 4/22/2018.
 */
public interface TestRepository extends MongoRepository<TestEntity, UUID> {
}
