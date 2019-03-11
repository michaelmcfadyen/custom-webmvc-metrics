package com.example.customwebmvcmetrics.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricControlller {

    @Timed("hello.world")
    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @Timed("goodbye.world")
    @GetMapping("/goodbye")
    public String goodbyeWorld() {
        return "goodbye world";
    }
}
