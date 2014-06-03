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

CREATE TABLE address(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	street varchar(255),
	blockNumber int,
	floor int,
	door char(5),
	locality varchar(255),
	province varchar(255),
	zipCode int
);

DROP TABLE clients;
DROP TABLE address;
CREATE INDEX clients_name ON clients(name); 