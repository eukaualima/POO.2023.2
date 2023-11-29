CREATE DATABASE IF NOT EXISTS papelaria;

USE papelaria;

CREATE TABLE modelos (codigo INT AUTO_INCREMENT PRIMARY KEY, modelo VARCHAR(255));
CREATE TABLE canetas (codigo INT AUTO_INCREMENT PRIMARY KEY, codmod INT, cor VARCHAR(50), ponta DECIMAL(2,1), carga INT, tampada BOOLEAN, FOREIGN KEY (modelo) REFERENCES codmod(codigo));
    
INSERT INTO modelos (modelo) VALUES ('Bic');
INSERT INTO modelos (modelo) VALUES ('Pilot');
INSERT INTO modelos (modelo) VALUES ('Faber-Castell');
INSERT INTO modelos (modelo) VALUES ('Stabilo');
INSERT INTO modelos (modelo) VALUES ('Sharpie');
INSERT INTO modelos (modelo) VALUES ('Paper Mate');

INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES (0, 'Verde', 1.0, 100, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES (1, 'Azul', 0.7, 50, false);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES (2, 'Preto', 0.5, 80, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES (3, 'Rosa', 1.2, 20, false);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES (4, 'Amarelo', 0.8, 60, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES (5, 'Laranja', 1.4, 40, false);