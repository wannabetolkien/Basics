package com.nabeel.todoapp.repository;
import com.nabeel.todoapp.dto.createTodoDTO;
import com.nabeel.todoapp.schema.Todo;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository("InMemoryTodoRepository")
public class InMemoryTodoRepository implements ITodoRepository {

    private List<Todo> todos = new ArrayList<>(Arrays.asList(
        new Todo("1","Buy Grocery"),
        new Todo("2","Build Java Project"),
        new Todo("3","Solve 5 DS Question")
    ));

    public List<Todo> findAll(){
        return todos;
    }
    
    public void createTodo(createTodoDTO newTodo){

        todos.add(new Todo(String.valueOf(todos.size()),newTodo.getContent()));
    }

    public void deleteTodo(String id){
        todos.removeIf(e->e.getId().equals(id));
    }

    public void updateTodo(String id, String content){
        todos.forEach(e->{
            if(e.getId().equals(id)){
                e.setContent(content);
            }
        });
    }
}
