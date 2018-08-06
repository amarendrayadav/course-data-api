package edu.amy.course.testMisc;

import edu.amy.course.testMisc.adapter.TestAdapter;
import edu.amy.course.testMisc.dataaccess.TestEntity;
import edu.amy.course.testMisc.dataaccess.TestRepository;
import edu.amy.course.testMisc.dataaccess.TestRequest;
import edu.amy.course.testMisc.dataaccess.TestResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

/**
 * Created by amya0316 on 4/9/2017.
 * Is a singleton
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    private final TestAdapter testAdapter;

    protected TestResponse getTopicById(final UUID id) {
        return testAdapter.convert(testRepository.findOne(id));
    }

    public List<TestResponse> getAllTopics() {
        return testRepository.findAll().stream().map(testAdapter::convert).collect(Collectors.toList());
    }

    public void addNewTopic(final TestRequest testRequest) {
        log.debug("request {} ", testRequest);
        this.testRepository.save(testAdapter.convert(testRequest));
    }

    public void updateTopic(final TestRequest testRequest, final UUID id) {
        final TestEntity testEntity = testRepository.findOne(id);
        if (nonNull(testEntity)) {
            testEntity.setName(testRequest.getName());
            testEntity.setDescription(testRequest.getDescription());
            log.debug("topic updated {} ", testEntity);
        }
        testRepository.save(testEntity);
    }

    public void deleteTopic(final UUID id) {
        testRepository.delete(id);
    }

    public void deleteAll() {
        testRepository.deleteAll();
    }
}
