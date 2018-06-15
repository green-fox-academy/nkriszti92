package com.greenfocacademy.todoh2.controllers;

import com.greenfocacademy.todoh2.models.Todo;
import com.greenfocacademy.todoh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "/todo")
public class WebController {

    @Autowired
    TodoRepository todoRepository;
    public WebController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
        public String worksFine(Model model) {
        todoRepository.save(new Todo( "Plswork", true, true));
        model.addAttribute("todos",
        todoRepository.findAll());
        return "index";

    }

}
