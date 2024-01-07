package com.provaipog.todolist.domain.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, String> {
    List<Task> findAllByPendenteTrue();
}
