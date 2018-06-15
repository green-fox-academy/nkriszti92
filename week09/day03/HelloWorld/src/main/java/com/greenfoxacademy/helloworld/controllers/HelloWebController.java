package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong id = new AtomicLong();
    @RequestMapping("/web/greeting")

    public String greeting(@RequestParam("name") String name, Model model) {
        id.incrementAndGet();
        /*model.addAttribute("name", " World");*/
        model.addAttribute("name", name);
        model.addAttribute("id", id);
        return "greeting";
    }

}
