package com.example.sampleapp;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleAppApplication {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(SampleAppApplication.class);


    public static void main(String[] args) {
        logger.info("Hello logback");
        SpringApplication.run(SampleAppApplication.class, args);
    }

}
