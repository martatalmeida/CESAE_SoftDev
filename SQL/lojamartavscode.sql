CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(40),
    data_inscricao DATE DEFAULT CURDATE(),
    pontos INT,
	PRIMARY KEY(id_cliente)
);

CREATE TABLE venda (
    id_venda INT AUTO_INCREMENT,
    data_venda DATE,
    desconto FLOAT,
    id_cliente INT,
    PRIMARY KEY(id_venda)
);

CREATE TABLE linha_venda (
    id_linhavenda INT AUTO_INCREMENT,
    id_venda INT,
    id_produto INT,
    quantidade INT,
    PRIMARY KEY(id_linhavenda)
);

CREATE TABLE produto (
    id_produto INT AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    preco FLOAT NOT NULL,
    stock INT NOT NULL,
    PRIMARY KEY(id_produto)
);

ALTER TABLE venda
ADD FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente);

ALTER TABLE linha_venda
ADD FOREIGN KEY (id_venda) REFERENCES venda(id_venda),
ADD FOREIGN KEY (id_produto) REFERENCES produto(id_produto);

insert into cliente (nome, cidade, data_inscricao, pontos) values 
('Ana', 'Maia', '2018-03-11', 123), 
('Bruno', 'Porto', '2006-06-22', 5347), 
('Miguel', 'Porto', '2010-07-26', 1789), 
('Maria', 'Valbom', '2006-05-21', 3234), 
('Joana', 'Maia', '2011-08-7', 678), 
('Anabela', 'Ermesinde', '2012-03-21', 864), 
('Manuel', 'Gaia', '2019-06-22', 1123), 
('Bruna', 'Porto', '2020-07-15', 1589), 
('Joana', 'Gaia', '2021-04-14', 324), 
('Raquel', 'Maia', '2019-01-21', 1899), 
('Vitor', 'Gaia', '2020-09-29', 127); 

insert into produto (descricao, preco, stock) values 
('Martelo', 5.99, 23), 
('Parafuso', 0.99, 241), 
('Prego', 0.2, 147),
('Rosca', 0.3, 0), 
('Berbequim', 35.99, 15), 
('Torneira', 20.99, 11), 
('Lampada', 1.5, 0), 
('Broca', 2.6, 60), 
('Extensão', 10.5, 0), 
('Tripla', 5.5, 16), 
('Pincel', 3.99, 34), 
('Calha', 2.99, 0); 

insert into Venda (id_cliente, data_venda, desconto) values 
(1, '2021-03-29', 0.05), 
(1, '2021-03-31', 0.20), 
(2, '2021-05-03', 0), 
(4, '2021-05-21', 0), 
(1, '2021-06-15', 0.1), 
(5, '2021-06-05', 0), 
(4, '2021-08-11', 0.05), 
(3, '2021-09-03', 0.25), 
(5, '2021-10-23', 0.5), 
(7, '2021-11-04', 0), 
(6, '2021-11-05', 0.5);

insert into linha_venda (id_venda, id_produto, quantidade) values 
(1, 1, 2), 
(1, 3, 10), 
(2, 2, 20), 
(3, 5, 2), 
(4, 8, 5), 
(5, 10, 2), 
(5, 11, 10), 
(6, 6, 20), 
(7, 3, 120), 
(7, 1, 5), 
(7, 7, 2), 
(8, 3, 10), 
(9, 2, 80), 
(9, 3, 50), 
(9, 1, 3), 
(9, 8, 2), 
(10, 9, 10), 
(10, 2, 50), 
(10, 3, 70), 
(11, 5, 1);

INSERT INTO cliente (nome, cidade, data_inscricao, pontos) VALUES
('Marta', 'Porto', '2022-10-14',1414),
('Vasco', 'Lisboa','2020-10-28',1993),
('Mario', 'Porto', '2018,04-02',1960);

INSERT INTO produto (descricao, preco, stock) VALUES
('Almofada',6.90,40),
('Colchao',99.99,10),
('Cobertor',10.50,25),
('Cadeira',30.70,30),
('Mesa',80.90,15);

UPDATE cliente
SET pontos = 2789
WHERE id_cliente=3;

UPDATE produto
SET stock = 13
WHERE descricao='Berbequim';

UPDATE cliente
SET nome = 'Vitorino',
pontos = 327
WHERE id_cliente=11;

DELETE FROM produto
WHERE descricao='Calha';

SELECT *
FROM cliente;

SELECT DISTINCT cidade
FROM cliente;

SELECT descricao, preco, preco*1.23 AS 'Preço + IVA'
FROM produto;

SELECT *
FROM cliente 
WHERE data_inscricao BETWEEN '2000-01-01' AND '2009-01-01' AND pontos > 1000;

SELECT * 
FROM produto 
WHERE stock IN (0,15,60);

SELECT *
FROM cliente
WHERE nome LIKE '%ana%'
ORDER BY id_cliente DESC;

SELECT *
FROM cliente
WHERE nome LIKE '____a';

SELECT *
FROM produto
WHERE descricao REGEXP '^P|^T|CA$'; 

SELECT *
FROM cliente
ORDER BY pontos DESC
LIMIT 5, 3;

SELECT cidade
FROM cliente
GROUP BY cidade
HAVING COUNT(cidade) > 1;

SELECT *
FROM venda
WHERE desconto=0;

SELECT *
FROM produto
ORDER BY preco DESC
LIMIT 0, 3;

SELECT *
FROM venda
WHERE desconto > 0.11;

SELECT v.id_venda, c.nome, c.cidade
FROM cliente AS c
JOIN venda AS v
ON v.id_cliente = c.id_cliente;

SELECT p.descricao, p.preco
FROM venda as v
JOIN linha_venda AS lv
ON v.id_venda = lv.id_venda
JOIN produto as p
ON p.id_produto = lv.id_produto
WHERE v.id_venda = 9;

SELECT p.descricao, p.preco, lv.quantidade
FROM venda as v
JOIN linha_venda AS lv
ON v.id_venda = lv.id_venda
JOIN produto as p
ON p.id_produto = lv.id_produto
WHERE v.id_venda = 10;

SELECT p.descricao, p.preco, lv.quantidade, p.preco*lv.quantidade AS 'Total por Produto'
FROM venda as v
JOIN linha_venda AS lv
ON v.id_venda = lv.id_venda
JOIN produto as p
ON p.id_produto = lv.id_produto
WHERE v.id_venda = 10;

SELECT p.*
FROM venda as v
JOIN linha_venda AS lv
ON v.id_venda = lv.id_venda
JOIN produto as p
ON p.id_produto = lv.id_produto
WHERE v.data_venda BETWEEN '2021-05-01' AND '2021-08-01';

SELECT v.id_venda, CONCAT(ROUND(SUM(p.preco*lv.quantidade),2),' €') AS 'Total faturado'
FROM venda as v
JOIN linha_venda AS lv
ON v.id_venda = lv.id_venda
JOIN produto as p
ON p.id_produto = lv.id_produto
GROUP BY v.id_venda;

SELECT p.*, c.*
FROM venda as v
JOIN linha_venda AS lv
ON v.id_venda = lv.id_venda
JOIN produto as p
ON p.id_produto = lv.id_produto
JOIN cliente AS c
ON c.id_cliente = v.id_cliente
WHERE c.cidade = 'Gaia';