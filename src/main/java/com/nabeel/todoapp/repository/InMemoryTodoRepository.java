package com.nabeel.todoapp.repository;
import com.nabeel.todoapp.schema.Todo;
import java.util.*;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("InMemoryTodoRepository")
@Profile("dev")
public class InMemoryTodoRepository implements ITodoRepository {
    private List<Todo> todos = new ArrayList<>(Arrays.asList(
        new Todo("1","Buy Grocery"),
        new Todo("2","Build Java Project"),
        new Todo("3","Solve 5 DS Question")
    ));

    public List<Todo> findAll(){
        return todos;
    } 
}
