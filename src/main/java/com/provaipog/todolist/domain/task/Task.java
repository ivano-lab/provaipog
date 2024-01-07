package com.provaipog.todolist.domain.task;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

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

    public Task(RequestTask requestTask){
        this.titulo = requestTask.titulo();
        this.descricao = requestTask.descricao();
        this.prioridade = requestTask.prioridade();
        this.pendente = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isPendente() {
        return pendente;
    }

    public void setPendente(boolean pendente) {
        this.pendente = pendente; // aqui vai ser false depois
    }
}
