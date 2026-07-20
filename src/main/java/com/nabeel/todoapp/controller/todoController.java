package com.nabeel.todoapp.controller;
import com.nabeel.todoapp.dto.createTodoDTO;
import com.nabeel.todoapp.schema.Todo;
import com.nabeel.todoapp.services.todoService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public void createTodo(@RequestBody createTodoDTO newTodo){
        todoService.createTodo(newTodo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id){
        todoService.deleteTodo(id);
    }

    @PutMapping("/{id}")
    public void updateTodo(@RequestBody createTodoDTO updatedTodo, @PathVariable String id){
        todoService.updateTodo(id,updatedTodo.getContent());
    }


}
