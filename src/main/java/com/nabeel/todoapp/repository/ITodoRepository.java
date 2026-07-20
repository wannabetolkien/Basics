package com.nabeel.todoapp.repository;

import java.util.List;

import com.nabeel.todoapp.dto.createTodoDTO;
import com.nabeel.todoapp.schema.Todo;

public interface ITodoRepository {
    public List<Todo> findAll();
    public void createTodo(createTodoDTO newTodo);
    public void updateTodo(String id, String content);
    public void deleteTodo(String id);
}
