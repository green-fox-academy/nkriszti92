package com.greenfocacademy.todoh2;

import com.greenfocacademy.todoh2.models.Todo;
import com.greenfocacademy.todoh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoh2Application implements CommandLineRunner {

    private final
    TodoRepository todoRepository;

    @Autowired
    public Todoh2Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(Todoh2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Plswork", true, true));
        todoRepository.save(new Todo("Plswork", true, true));
        todoRepository.save(new Todo("Plswork", true, true));

    }
}
