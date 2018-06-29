package com.greenfoxacademy.connectionwithmysql.controllers;


import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import com.greenfoxacademy.connectionwithmysql.services.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller(value = "/todo")
public class WebController {
    private TodoServiceImpl todoService;

    @Autowired
    public WebController(TodoServiceImpl todoService) {
        this.todoService = todoService;
    }

    @Autowired
    TodoRepository todoRepository;
    public WebController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    public String worksFine(Model model) {
        model.addAttribute("todos",
                todoRepository.findAll());
        return "index";
    }


    @GetMapping("todo/active")
    public String listIsActive(@RequestParam(value = "isActive") boolean active, Model model) {
        model.addAttribute("todoslist", todoService.getActiveTodos(active));
        return "actives";
    }


    @RequestMapping(value = "/add", method = {RequestMethod.GET,RequestMethod.POST})
    public String createTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "add";
    }

    @PostMapping("/create")
    public String saveTodo(@ModelAttribute Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/list";
    }


}