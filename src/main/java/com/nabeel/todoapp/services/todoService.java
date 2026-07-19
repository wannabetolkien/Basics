package com.nabeel.todoapp.services;

import org.springframework.stereotype.Service;
import com.nabeel.todoapp.schema.Todo;

import lombok.AllArgsConstructor;

import java.util.List;

import com.nabeel.todoapp.repository.ITodoRepository;

@Service
@AllArgsConstructor
public class todoService {
    private ITodoRepository todoRepository;

    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
}
