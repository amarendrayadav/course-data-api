package edu.amy.course.topic;

import edu.amy.course.topic.dataaccess.Topic;
import edu.amy.course.topic.dataaccess.TopicRequest;
import edu.amy.course.topic.dataaccess.TopicResponse;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by amya0316 on 4/9/2017.
 */
@RestController
@RequestMapping(value = "/courses")
@RequiredArgsConstructor
public class TopicController {
    private final TopicService topicService;

    @ApiOperation(value = "Get All Topics")
    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<TopicResponse> getAllTopics() {
        return topicService.getAllTopics();
    }

    @ApiOperation(value = "Get Topic By Id")
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public TopicResponse getTopicById(@PathVariable UUID id) {
        return topicService.getTopicById(id);
    }

    @ApiOperation(value = "Add new topics")
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addNewTopic(@RequestBody TopicRequest topicRequest) {
        topicService.addNewTopic(topicRequest);
    }

    @ApiOperation(value = "Update Topic")
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable UUID id) {
        topicService.updateTopic(topic, id);
    }

    @ApiOperation(value = "Delete By Id")
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable UUID id) {
        topicService.deleteTopic(id);
    }

    @ApiOperation(value = "Delete")
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics")
    public void deleteAll() {
        topicService.deleteAll();
    }
}
