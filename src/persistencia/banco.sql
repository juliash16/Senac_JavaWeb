create database aula12;

use aula12;

create table funcionario(
	id int primary key auto_increment,
	nome varchar(40) not null,
	email varchar(40) not null,
	cpf varchar(12) not null,
	salario float(10,2) not null,
	nascimento date
);