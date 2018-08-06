package edu.amy.course.topic;

import edu.amy.course.topic.adapter.TopicAdapter;
import edu.amy.course.topic.dataaccess.Topic;
import edu.amy.course.topic.dataaccess.TopicRepository;
import edu.amy.course.topic.dataaccess.TopicRequest;
import edu.amy.course.topic.dataaccess.TopicResponse;
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
public class TopicService {
    private final TopicRepository topicRepository;
    private final TopicAdapter topicAdapter;

    protected TopicResponse getTopicById(final UUID id) {
        return topicAdapter.convert(topicRepository.findOne(id));
    }

    public List<TopicResponse> getAllTopics() {
        return topicRepository.findAll().stream().map(topicAdapter::convert).collect(Collectors.toList());
    }

    public void addNewTopic(final TopicRequest topicRequest) {
        log.debug("request {} ", topicRequest);
        this.topicRepository.save(topicAdapter.convert(topicRequest));
    }

    public void updateTopic(final TopicRequest topicRequest, final UUID id) {
        final Topic topic = topicRepository.findOne(id);
        if (nonNull(topic)) {
            topic.setName(topicRequest.getName());
            topic.setDescription(topicRequest.getDescription());
            log.debug("topic updated {} ", topic);
        }
        topicRepository.save(topic);
    }

    public void deleteTopic(final UUID id) {
        topicRepository.delete(id);
    }

    public void deleteAll() {
        topicRepository.deleteAll();
    }
}
