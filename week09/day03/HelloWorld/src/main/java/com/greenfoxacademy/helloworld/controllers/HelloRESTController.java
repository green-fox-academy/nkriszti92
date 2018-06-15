package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    @RequestMapping("/greeting1")
    public Greeting greeting(){
        AtomicLong id = new AtomicLong(1);
        return new Greeting(id, "Hello World!");
    }
}
