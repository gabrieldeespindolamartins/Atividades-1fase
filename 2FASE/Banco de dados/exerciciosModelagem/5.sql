    CREATE TABLE Restaurante (
        id_restaurante INT NOT NULL,
        nome VARCHAR(100) NOT NULL,
        endereco VARCHAR(255),
        telefone VARCHAR(20),
        tipo_culinaria VARCHAR(100),
        CONSTRAINT PK_Restaurante PRIMARY KEY (id_restaurante)
    );

    CREATE TABLE Mesa (
        id_mesa INT NOT NULL,
        numero INT NOT NULL,
        capacidade INT NOT NULL,
        id_restaurante INT NOT NULL,
        CONSTRAINT PK_Mesa PRIMARY KEY (id_mesa),
        CONSTRAINT FK_Mesa_Restaurante FOREIGN KEY (id_restaurante)
            REFERENCES Restaurante (id_restaurante)
    );

    CREATE TABLE Disponibilidade (
        id_disponibilidade INT NOT NULL,
        data_hora TIMESTAMP NOT NULL, -- Corrigido para TIMESTAMP
        status VARCHAR(20) NOT NULL,
        id_mesa INT NOT NULL,
        CONSTRAINT PK_Disponibilidade PRIMARY KEY (id_disponibilidade),
        CONSTRAINT FK_Disponibilidade_Mesa FOREIGN KEY (id_mesa)
            REFERENCES Mesa (id_mesa),
        CONSTRAINT CK_Disponibilidade_Status CHECK (status IN ('livre', 'reservada', 'bloqueada')) -- Substituto do ENUM
    );

    CREATE TABLE Cliente (
        id_cliente INT NOT NULL,
        nome VARCHAR(100) NOT NULL,
        telefone VARCHAR(20),
        email VARCHAR(100) NOT NULL,
        CONSTRAINT PK_Cliente PRIMARY KEY (id_cliente),
        CONSTRAINT UK_Cliente_Email UNIQUE (email)
    );

    CREATE TABLE Reserva (
        id_reserva INT NOT NULL,
        numero_pessoas INT NOT NULL,
        status VARCHAR(20) NOT NULL,
        id_cliente INT NOT NULL,
        id_disponibilidade INT NOT NULL,
        CONSTRAINT PK_Reserva PRIMARY KEY (id_reserva),
        CONSTRAINT UK_Reserva_Disponibilidade UNIQUE (id_disponibilidade),
        CONSTRAINT FK_Reserva_Cliente FOREIGN KEY (id_cliente)
            REFERENCES Cliente (id_cliente),
        CONSTRAINT FK_Reserva_Disponibilidade FOREIGN KEY (id_disponibilidade)
            REFERENCES Disponibilidade (id_disponibilidade),
        CONSTRAINT CK_Reserva_Status CHECK (status IN ('confirmada', 'cancelada', 'concluida')) -- Substituto do ENUM
    );
