CREATE TABLE veiculo (
    placa VARCHAR(10) PRIMARY KEY NOT NULL,
    modelo VARCHAR(100),
    ano INT,
    capacidade_carga DECIMAL(10,2),
    tipo ENUM('carro', 'moto', 'van'),
    status ENUM('disponivel', 'em_manutencao','em_rota')
);

CREATE TABLE motorista (
    cpf VARCHAR(100) PRIMARY KEY NOT NULL,
    nome VARCHAR(100) NOT NULL,
    data_nascimento DATE,
    numero_cnh VARCHAR(20) UNIQUE NOT NULL,
    telefone VARCHAR(20),
    placa_veiculo VARCHAR(10),
    CONSTRAINT fk_placa_veiculo FOREIGN KEY (placa_veiculo) REFERENCES veiculo (placa)
);



CREATE TABLE item_entrega (
    id_item INT PRIMARY KEY,
    descricao VARCHAR(255),
    quantidade INT,
    peso DECIMAL(10,2),
    id_entrega INT,
    CONSTRAINT fk_identrega_entrega FOREIGN KEY (id_entrega) REFERENCES entrega (id_entrega
    )
);
