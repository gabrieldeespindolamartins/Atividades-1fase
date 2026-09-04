CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL, 
    email VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    endereco VARCHAR(300)
    matricula_id INT,
    CONSTRAINT fk_aluno_martricula FOREIGN KEY (matricula_id) REFERENCES matricula (id),
);

CREATE TABLE instrutores (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    biografia TEXT,
    especialidade VARCHAR(300)
);

CREATE TABLE cursos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco FLOAT,
    nivel ENUM('basico','intermediario','avancado'),
    instrutor_id INT,
    CONSTRAINT fk_cursos_instrutores FOREIGN KEY (instrutor_id) REFERENCES instrutores (id)
);

CREATE TABLE aulas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    duracao TIME,
    curso_id INT,
    CONSTRAINT fk_aulas_curso FOREIGN KEY (curso_id) REFERENCES cursos (id)
);

CREATE TABLE matriculas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_matricula DATE NOT NULL,
    aluno_id INT,
    curso_id INT,
    CONSTRAINT fk_matriculas_curso FOREIGN KEY (curso_id) REFERENCES cursos (id),
    CONSTRAINT fk_matriculas_aluno FOREIGN KEY (aluno_id) REFERENCES alunos (id)
);

CREATE TABLE progresso_aluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_concluido DATE NOT NULL,
    aluno_id INT,
    curso_id INT,
    aula_id INT,
    CONSTRAINT fk_progresso_aluno_aluno FOREIGN KEY (aluno_id) REFERENCES alunos (id),
    CONSTRAINT fk_progresso_aluno_curso FOREIGN KEY (curso_id) REFERENCES cursos (id),
    CONSTRAINT fk_progresso_aluno_aula FOREIGN KEY (aula_id) REFERENCES aulas (id)
);
