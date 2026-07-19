package com.nabeel.todoapp.services;

import org.springframework.stereotype.Service;
import com.nabeel.todoapp.schema.Todo;

import lombok.AllArgsConstructor;

import java.util.List;
import com.nabeel.todoapp.repository.TodoRepository;

@Service
@AllArgsConstructor
public class todoService {
    private TodoRepository todoRepository;
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
}
