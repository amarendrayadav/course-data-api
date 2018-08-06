package edu.amy.course.testMisc.adapter;

import edu.amy.course.testMisc.dataaccess.TestEntity;
import edu.amy.course.testMisc.dataaccess.TestRequest;
import edu.amy.course.testMisc.dataaccess.TestResponse;
import edu.amy.course.testMisc.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by amya0316 on 5/9/2018.
 */
@Component
@RequiredArgsConstructor
public class TestAdapter {

    private static TestMapper testMapper = TestMapper.INSTANCE;

    public TestEntity convert(final TestRequest testRequest) {
        return testMapper.map(testRequest);
    }

    public TestResponse convert(final TestEntity testEntity) {
        return testMapper.map(testEntity);
    }
}
