CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE clients (
  id bigint PRIMARY KEY,
  name varchar(255),
  surnames varchar(255),
  address varchar(255)
);

CREATE INDEX clients_name ON clients(name); 