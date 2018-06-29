package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    List<Todo> getAllTodos();

    List<Todo> getActiveTodos(boolean active);

    void saveTodo(Todo todo);

    void removeById(Long id);

    Optional<Todo> getTodoById(Long id);

    void updateTodo(Todo todo);
}
