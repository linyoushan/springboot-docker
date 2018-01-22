package com.vick.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vickl on 1/22/2018.
 */

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "hello, docker!";
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
