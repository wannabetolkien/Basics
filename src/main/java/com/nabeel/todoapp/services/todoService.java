package com.nabeel.todoapp.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.nabeel.todoapp.schema.Todo;
import java.util.List;

import com.nabeel.todoapp.dto.createTodoDTO;
import com.nabeel.todoapp.repository.ITodoRepository;

@Service
public class todoService {
    private ITodoRepository todoRepository;

    public todoService(@Qualifier("InMemoryTodoRepository")ITodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    public void createTodo(createTodoDTO newTodo){
        todoRepository.createTodo(newTodo);
    }

    public void deleteTodo(String id){
        todoRepository.deleteTodo(id);
    }

    public void updateTodo(String id, String content){
        todoRepository.updateTodo(id,content);
    }
}
