package com.nabeel.todoapp.repository;
import com.nabeel.todoapp.schema.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("InMemoryMapTodoRepository")
@Profile("Prod")
public class InMemoryMapTodoRepository implements ITodoRepository{

    private Map<String,Todo> todos = new HashMap<>();

    public List<Todo> findAll(){
        return new ArrayList<Todo>(todos.values());
    }
}
