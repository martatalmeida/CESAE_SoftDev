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

CREATE VIEW Ex_e AS 
SELECT COUNT(*) AS "Total de Equipas"
FROM equipa;

CREATE VIEW Ex_f AS 
SELECT COUNT(*) AS "Treinadores com + de 40 anos", AVG(idade)
FROM treinador
WHERE idade > 40;

CREATE VIEW Ex_g AS 
SELECT MAX(idade)
FROM treinador;

CREATE VIEW Ex_h AS
SELECT e.id_equipa, b.fabricante
FROM equipa AS e
JOIN bola AS b
ON b.id_equipa = e.id_equipa
WHERE b.fabricante = "Adidas";

CREATE VIEW Ex_i AS
SELECT DISTINCT e.id_equipa, b.fabricante
FROM equipa AS e
JOIN bola AS b
ON b.id_equipa = e.id_equipa
WHERE b.fabricante = "Adidas";

CREATE VIEW Ex_j AS
SELECT AVG(idade)
FROM treinador AS t
JOIN experiencia AS exp
ON t.id_treinador = exp.id_treinador
JOIN escalao AS e
ON exp.id_escalao = e.id_escalao
WHERE e.id_escalao = 2;

CREATE VIEW Ex_k AS
SELECT t.nome, t.telefone, e.nome AS "Equipa"
FROM treinador AS t
JOIN experiencia As exp
ON t.id_treinador = exp.id_treinador
JOIN equipa As e
ON e.id_equipa = exp.id_equipa;

CREATE VIEW Ex_l AS
SELECT e.*, t.nome AS "Treinador"
FROM treinador AS t
JOIN experiencia As exp
ON t.id_treinador = exp.id_treinador
JOIN equipa As e
ON e.id_equipa = exp.id_equipa
WHERE e.nome = "Académico";

CREATE VIEW Ex_m AS
SELECT MAX(idade)
FROM treinador AS t
JOIN experiencia As exp
ON t.id_treinador = exp.id_treinador
JOIN equipa As e
ON e.id_equipa = exp.id_equipa
WHERE e.nome = "Académico"

CREATE VIEW Ex_n AS
SELECT SUM(exp.anos)
FROM treinador AS t
JOIN experiencia As exp
ON t.id_treinador = exp.id_treinador
JOIN equipa As e
ON e.id_equipa = exp.id_equipa
WHERE e.nome = "Académico" AND t.nome = "António";