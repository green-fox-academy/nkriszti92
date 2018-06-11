package com.greenfoxacademy.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return new String("Hello World!"

        );
    }
}