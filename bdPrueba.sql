create database demo;

use demo;

CREATE TABLE Persona (
    id int NOT NULL identity,
    Nombre varchar(20)  NOT NULL,
    Nota int  NOT NULL,
    CONSTRAINT Persona_pk PRIMARY KEY(id)
);

INSERT INTO Persona
(Nombre,Nota)
VALUES
('Juan',18),
('Marcos',17),
('Alex',20);