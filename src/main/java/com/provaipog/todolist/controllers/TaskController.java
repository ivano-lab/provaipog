package com.provaipog.todolist.controllers;

import com.provaipog.todolist.domain.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository repository;
    @GetMapping
    public ResponseEntity getAllTasks() {
        var allTasks = repository.findAll();
        return ResponseEntity.ok(allTasks);
    }

}