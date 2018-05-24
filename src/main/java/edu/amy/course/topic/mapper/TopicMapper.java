package edu.amy.course.topic.mapper;

import edu.amy.course.topic.dataaccess.Topic;
import edu.amy.course.topic.dataaccess.TopicRequest;
import edu.amy.course.topic.dataaccess.TopicResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by amya0316 on 5/9/2018.
 */
@Mapper
public abstract class TopicMapper {
    public static final TopicMapper INSTANCE = Mappers.getMapper(TopicMapper.class);

    @Mappings({
            @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")})
    public abstract Topic map(final TopicRequest topicRequest);

    public abstract TopicResponse map(final Topic topic);
}
