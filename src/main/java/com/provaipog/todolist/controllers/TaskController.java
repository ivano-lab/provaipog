package com.provaipog.todolist.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @GetMapping
    public ResponseEntity getAllTasks() {
        return ResponseEntity.ok("FOI!");
    }

}