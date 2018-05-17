create database aula09;

use aula09;

create table aluno(
	mat int primary key auto_increment,
	nome varchar (30) not null,
	email varchar (30) not null,
	nascimento date not null
);

create table endereco(
	idEndereco int primary key auto_increment,
	rua varchar (40) not null,
	bairro varchar (40) not null,
	cidade varchar (40) not null,
	mat_aluno int not null unique,  <!-- para que o aluno n tenha mais de um endereço -->
	foreign key(mat_aluno) references aluno(mat)
);

<!--avenida washington luiz -->

desc aluno;
desc endereco;

