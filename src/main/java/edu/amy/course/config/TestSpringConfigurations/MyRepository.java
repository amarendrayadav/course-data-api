package edu.amy.course.config.TestSpringConfigurations;

/**
 * Created by amya0316 on 5/25/2018.
 */
public class MyRepository {
    private final String prefix;
    private final String suffix;

    public MyRepository(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String findString() {
        return prefix + "-some-string-" + suffix;
    }
}

