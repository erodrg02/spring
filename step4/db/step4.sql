CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE clients (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  dni varchar(255),
  personName varchar(255),
  surnames varchar(255),
  civilState varchar(25),
  phoneNumber1 int,
  phoneNumber2 int,
  profession varchar(255)
); 

DROP TABLE clients;

CREATE INDEX clients_name ON clients(name); 