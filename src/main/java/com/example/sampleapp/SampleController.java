package com.example.sampleapp;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(SampleController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    ResponseEntity test() {
        logger.info("Hello Controller /test");

        return new ResponseEntity("Okay", HttpStatus.OK);

    }

}
