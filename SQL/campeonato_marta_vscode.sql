CREATE TABLE bola(
    id_bola INT AUTO_INCREMENT,
    id_equipa INT,
    fabricante VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_bola)
    );
    
CREATE TABLE equipa(
    id_equipa INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(50),
    diretor VARCHAR(50),
    PRIMARY KEY (id_equipa)
    );
    
CREATE TABLE experiencia(
    id_experiencia INT AUTO_INCREMENT,
    id_equipa INT,
    id_treinador INT,
    id_escalao INT,
    anos INT DEFAULT 0,
    PRIMARY KEY (id_experiencia)
    );
    
CREATE TABLE treinador(
    id_treinador INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    idade INT,
    telefone INT,
    PRIMARY KEY (id_treinador)
    );
    
CREATE TABLE escalao(
    id_escalao INT AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_escalao)
    );

ALTER TABLE bola
ADD FOREIGN KEY (id_equipa) REFERENCES equipa(id_equipa);

ALTER TABLE experiencia
ADD FOREIGN KEY (id_equipa) REFERENCES equipa(id_equipa),
ADD FOREIGN KEY (id_treinador) REFERENCES treinador(id_treinador),
ADD FOREIGN KEY (id_escalao) REFERENCES escalao(id_escalao);

INSERT INTO treinador (nome, idade, telefone)
VALUES
('António', 34, 922424561),
('Barbosa', 45, 965552936),
('Tavares', 48, 933332267),
('Joaquim', 57, 918638465),
('Alberto', 33, 966785309),
('Duarte', 54, 912773446);

INSERT INTO equipa (nome, cidade, diretor)
VALUES
('Académico', 'Porto', 'Mário'),
('Universitário', 'Coimbra', 'João'),
('Juventude', 'Braga', 'Silva'),
('Tigres', 'Espinho', 'Cardoso');

INSERT INTO bola (id_equipa, fabricante)
VALUES
(1, 'Adidas'),
(1, 'Reebok'),
(1, 'Adidas'),
(2, 'Adidas'),
(2, 'Olimpic'),
(2, 'Nike'),
(3, 'Reebok'),
(3, 'Olimpic');

INSERT INTO experiencia (id_equipa, id_treinador, id_escalao, anos)
VALUES
(1, 1, 3, 10),
(1, 1, 4, 5),
(1, 2, 1, 2),
(1, 2, 3, 3),
(1, 2, 2, 4),
(2, 3, 3, 15),
(4, 5, 2, 12);

INSERT INTO escalao (descricao)
VALUES
('iniciados'),
('juvenis'),
('juniores'),
('seniores');

CREATE VIEW Ex_a AS
SELECT id_treinador, nome, idade
FROM treinador
WHERE idade < 40;

CREATE VIEW Ex_b AS
SELECT *
FROM experiencia
WHERE id_escalao = 3 OR anos > 10;

CREATE VIEW ex_c AS
SELECT *
FROM treinador
WHERE idade BETWEEN 45 AND 53
ORDER BY idade DESC;

CREATE VIEW Ex_d AS
SELECT *
FROM treinador
WHERE nome LIKE 'A%';