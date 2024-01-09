import { Component, OnInit } from '@angular/core';
import { Task } from './task.interface';
import { Router } from '@angular/router';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.scss']
})
export class TodoListComponent implements OnInit {

  tasks: Task [] = [];

  constructor(private router: Router) { }

  ngOnInit(): void { }

  /*addTask() {
    this.tasks.push({
      id: '',
      titulo: '',
      descricao: 'nova descrição',
      prioridade: 'baixa',
      pendente: false
    });
  }*/


  deleteTask(task: Task) {
    this.tasks.splice(this.tasks.indexOf(task), 1);
  }

  markTaskAsDone(task: Task) {
    task.pendente = false; // Marca a tarefa como feita
    // Atualiza a tarefa no backend
  }

}
