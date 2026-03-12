package com.example.demo.Controlleur;

import com.example.demo.restservice.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingService.Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        return new GreetingService.Greeting(counter.incrementAndGet(), template.formatted(name));
}
}
