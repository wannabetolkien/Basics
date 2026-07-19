package com.nabeel.todoapp.controller;
import com.nabeel.todoapp.schema.Todo;
import com.nabeel.todoapp.services.todoService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todos")
@AllArgsConstructor
public class todoController {
    private todoService todoService;
    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }
}
