package com.nabeel.todoapp.services;

import org.springframework.stereotype.Service;
import com.nabeel.todoapp.schema.Todo;

import java.util.List;

import com.nabeel.todoapp.repository.ITodoRepository;

@Service
public class todoService {
    private ITodoRepository todoRepository;

    public todoService(ITodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
}
