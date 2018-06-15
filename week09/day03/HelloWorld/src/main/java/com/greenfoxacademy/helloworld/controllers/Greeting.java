package com.greenfoxacademy.helloworld.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    AtomicLong id;
    String content;

    public AtomicLong getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


    public Greeting(AtomicLong id, String content) {
        this.id = id;
        this.content = content;
    }
}
