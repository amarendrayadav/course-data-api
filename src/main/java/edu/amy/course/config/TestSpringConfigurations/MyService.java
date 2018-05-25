package edu.amy.course.config.TestSpringConfigurations;

/**
 * Created by amya0316 on 5/25/2018.
 */
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String generateSomeString() {
        return myRepository.findString() + "-from-MyService";
    }
}
