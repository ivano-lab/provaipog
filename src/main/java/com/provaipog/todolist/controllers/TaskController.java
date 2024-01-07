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

    @GetMapping("/pendentes")
    public ResponseEntity getAllPendentes(){
        var allPendentes = repository.findAllByPendenteTrue();
        return ResponseEntity.ok(allPendentes);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTaskById(@PathVariable String id) {
        var task = repository.findById(id);
        if (task.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task.get());
    }

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

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteTask(@PathVariable String id){
        Optional <Task> optionalTask = repository.findById(id);
        if (optionalTask.isPresent()){
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            throw new EntityNotFoundException();
        }
    }

    @PutMapping("concluir-tarefa/{id}")
    @Transactional
    public ResponseEntity updateTask(@PathVariable(value = "id") String id) {
        Optional<Task> optionalTask = repository.findById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setPendente(false);
            return ResponseEntity.noContent().build();
        } else {
            throw new EntityNotFoundException();
        }
    }
}