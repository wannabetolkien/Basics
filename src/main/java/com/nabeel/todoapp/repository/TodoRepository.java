package com.nabeel.todoapp.repository;
import com.nabeel.todoapp.schema.Todo;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
    private List<Todo> todos = new ArrayList<>(Arrays.asList(new Todo("1","Buy Grocery")));

    public List<Todo> findAll(){
        return todos;
    } 
}
