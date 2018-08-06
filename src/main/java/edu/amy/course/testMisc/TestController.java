package edu.amy.course.testMisc;

import edu.amy.course.testMisc.dataaccess.TestRequest;
import edu.amy.course.testMisc.dataaccess.TestResponse;
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
public class TestController {
    private final TestService testService;

    @ApiOperation(value = "Get All Topics")
    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<TestResponse> getAllTopics() {
        return testService.getAllTopics();
    }

    @ApiOperation(value = "Get Topic By Id")
    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public TestResponse getTopicById(@PathVariable UUID id) {
        return testService.getTopicById(id);
    }

    @ApiOperation(value = "Add new topics")
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addNewTopic(@RequestBody TestRequest testRequest) {
        testService.addNewTopic(testRequest);
    }

    @ApiOperation(value = "Update Topic")
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody TestRequest testRequest, @PathVariable UUID id) {
        testService.updateTopic(testRequest, id);
    }

    @ApiOperation(value = "Delete By Id")
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable UUID id) {
        testService.deleteTopic(id);
    }

    @ApiOperation(value = "Delete")
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics")
    public void deleteAll() {
        testService.deleteAll();
    }
}
