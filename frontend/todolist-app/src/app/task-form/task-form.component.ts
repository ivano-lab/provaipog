import { Component, OnInit } from '@angular/core';
import { TaskFormBase } from './task-form-base';
import { Router } from '@angular/router';

@Component({
  selector: 'app-task-form',
  templateUrl: './task-form.component.html',
  styleUrls: ['./task-form.component.scss']
})
export class TaskFormComponent extends TaskFormBase implements OnInit {

  constructor(private router: Router) {
    super();
  }

  ngOnInit(): void {
  }

}
