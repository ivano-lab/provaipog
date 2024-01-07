CREATE TABLE tasks (
    id_tarefa UUID PRIMARY KEY UNIQUE NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    prioridade VARCHAR(10) NOT NULL,
    pendente BOOLEAN NOT NULL
);