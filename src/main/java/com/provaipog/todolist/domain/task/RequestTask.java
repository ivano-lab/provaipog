package com.provaipog.todolist.domain.task;

import jakarta.validation.constraints.NotBlank;

public record RequestTask(
        String id,
        @NotBlank
        String titulo,
        @NotBlank
        String descricao,
        @NotBlank
        String prioridade
) { }
