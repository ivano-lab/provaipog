package com.provaipog.todolist.domain.task;

import jakarta.persistence.*;
import lombok.*;

@Table(name="tasks")
@Entity(name="task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String titulo;
    private String descricao;
    private String prioridade;
    private boolean pendente;


}
