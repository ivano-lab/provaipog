package com.provaipog.todolist.controllers;

import com.provaipog.todolist.domain.task.RequestTask;
import com.provaipog.todolist.domain.task.Task;
import com.provaipog.todolist.domain.task.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository repository;
    @GetMapping
    public ResponseEntity getAllTasks(){
        var allTasks = repository.findAll();
        return ResponseEntity.ok(allTasks);
    }

    @PostMapping
    public ResponseEntity registerTask(@RequestBody @Valid RequestTask data){
        Task newTask = new Task(data);
        repository.save(newTask);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateTask(@RequestBody @Valid RequestTask data) {
        Optional<Task> optionalTask = repository.findById(data.id());
        if (optionalTask.isPresent()){
            Task task = optionalTask.get();
            task.setTitulo(data.titulo());
            task.setDescricao(data.descricao());
            task.setPrioridade(data.prioridade());
            return ResponseEntity.ok(task);
        } else {
            throw new EntityNotFoundException();
        }
    }
}