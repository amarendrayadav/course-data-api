package edu.amy.course.topic.adapter;

import edu.amy.course.topic.dataaccess.Topic;
import edu.amy.course.topic.dataaccess.TopicRequest;
import edu.amy.course.topic.dataaccess.TopicResponse;
import edu.amy.course.topic.mapper.TopicMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by amya0316 on 5/9/2018.
 */
@Component
@RequiredArgsConstructor
public class TopicAdapter {

    private static TopicMapper topicMapper = TopicMapper.INSTANCE;

    public Topic convert(final TopicRequest topicRequest) {
        return topicMapper.map(topicRequest);
    }

    public TopicResponse convert(final Topic topic) {
        return topicMapper.map(topic);
    }
}
