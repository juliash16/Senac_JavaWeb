create database crud;

use crud;

create table funcionario(
	idfuncionario int primary key auto_increment,
	nome varchar(40) not null,
	email varchar(40) not null,
	cpf varchar(20) not null,
	salario double(10,2) not null,
	nascimento date


);