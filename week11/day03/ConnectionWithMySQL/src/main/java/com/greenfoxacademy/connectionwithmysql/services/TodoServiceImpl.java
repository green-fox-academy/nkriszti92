package com.greenfoxacademy.connectionwithmysql.services;


import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl {
    TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getActiveTodos(boolean active){
        return (List<Todo>) todoRepository.findAllByDone(false);

    }
    public List<Todo> findAll(){
        return (List<Todo>) todoRepository.findAll();

    }

    public void add(Todo todo) {
        todoRepository.save(todo);
    }


    public Todo findTodoById(Long id) {
        return todoRepository.findById(id).get();
    }

    public void remove(Long idx) {
        todoRepository.deleteById(idx);
    }

    public void saveTodo(Todo todo) {
    }


}
