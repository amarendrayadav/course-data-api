package edu.amy.course.testMisc.mapper;

import edu.amy.course.testMisc.dataaccess.TestEntity;
import edu.amy.course.testMisc.dataaccess.TestRequest;
import edu.amy.course.testMisc.dataaccess.TestResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by amya0316 on 5/9/2018.
 */
@Mapper
public abstract class TestMapper {
    public static final TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    @Mappings({
            @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")})
    public abstract TestEntity map(final TestRequest testRequest);

    public abstract TestResponse map(final TestEntity testEntity);
}
