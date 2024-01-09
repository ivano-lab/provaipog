export class TaskFormBase {
  titulo: string;
  descricao: string;
  prioridade: string;

  constructor() {
    this.titulo = '';
    this.descricao = '';
    this.prioridade = 'baixa';
  }
}
