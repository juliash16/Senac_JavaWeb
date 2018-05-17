-- Criar banco de dados

create database avaliacao;

use avaliacao;

create table aluno(
	id int primary key auto_increment,
	nome varchar (40),
	email varchar (40),
	nascimento varchar (10),
	rua varchar (40),
	bairro varchar (40),
	cidade varchar (30),
	cep varchar (9)
);

insert into aluno values
(null,'Julia','julia@gmail.com','26-08-1998','Avenida Rio Branco','Recreio','Rio de Janeiro','33697-884');