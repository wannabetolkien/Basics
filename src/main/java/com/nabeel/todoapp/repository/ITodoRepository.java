package com.nabeel.todoapp.repository;

import java.util.List;

import com.nabeel.todoapp.schema.Todo;

public interface ITodoRepository {
    public List<Todo> findAll();
}
