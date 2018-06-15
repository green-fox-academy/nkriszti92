package com.greenfoxacademy.helloworld.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloUserRESTController {
    AtomicLong id = new AtomicLong();
    @RequestMapping("/greeting3")

    public Greeting greetingYou(@RequestParam("name") String name) {
        id.incrementAndGet();
        Greeting greeting3 = new Greeting(id, "Hello, " + name);
        return greeting3;

    }
}