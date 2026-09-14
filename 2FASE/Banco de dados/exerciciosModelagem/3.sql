CREATE TABLE Projeto (
    id_projeto INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    data_inicio DATE,
    data_fim_prevista DATE,
    status ENUM('planejando', 'em_andamento', 'concluido', 'cancelado'),
    CONSTRAINT PK_Projeto PRIMARY KEY (id_projeto)
);

CREATE TABLE Equipe (
    id_equipe INT NOT NULL,
    nome VARCHAR(100) NOT NULL,
    id_projeto INT,
    CONSTRAINT PK_Equipe PRIMARY KEY (id_equipe),
    CONSTRAINT FK_Equipe_Projeto FOREIGN KEY (id_projeto) 
        REFERENCES Projeto (id_projeto)
);

CREATE TABLE Tarefa (
    id_tarefa INT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    data_inicio DATE,
    data_fim_prevista DATE,
    status ENUM('a_fazer', 'em_progresso', 'concluida', 'bloqueada'),
    prioridade ENUM('baixa', 'media', 'alta'),
    id_projeto INT NOT NULL,
    CONSTRAINT PK_Tarefa PRIMARY KEY (id_tarefa),
    CONSTRAINT FK_Tarefa_Projeto FOREIGN KEY (id_projeto) 
        REFERENCES Projeto (id_projeto)
);

CREATE TABLE Colaborador (
    matricula VARCHAR(20) NOT NULL,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cargo ENUM('Desenvolvedor', 'QA', 'Gerente_de_Projeto'),
    CONSTRAINT PK_Colaborador PRIMARY KEY (matricula),
    CONSTRAINT UK_Colaborador_Email UNIQUE (email)
);

CREATE TABLE Atribuicao (
    id_atribuicao INT NOT NULL,
    id_tarefa INT NOT NULL,
    matricula VARCHAR(20) NOT NULL,
    CONSTRAINT PK_Atribuicao PRIMARY KEY (id_atribuicao),
    CONSTRAINT FK_Atribuicao_Tarefa FOREIGN KEY (id_tarefa) 
        REFERENCES Tarefa (id_tarefa),
    CONSTRAINT FK_Atribuicao_Colaborador FOREIGN KEY (matricula) 
        REFERENCES Colaborador (matricula)
);
