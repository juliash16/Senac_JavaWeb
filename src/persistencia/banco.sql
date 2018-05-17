-- Criar banco de dados

create database projeto01;

use projeto01;

create table cliente(
	id int primary key auto_increment,
	nome varchar (30),
	email varchar (30),
	sexo varchar (10),
	estadocivil varchar (10)
);

insert into cliente values
(null,'ana','ana@gmail.com','feminino','solteiro');