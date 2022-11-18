create database BdCopa;

use BdCopa;
select * from usuario;
create table usuario
(
id int auto_increment primary key,
nome varchar(25) not null,
login varchar(15) not null,
senha varchar(10) not null 
);

insert into usuario (nome, login, senha) 
values ("Teste", "teste2", "1234");
select * from usuario;
SELECT senha FROM USUARIO WHERE login = "admisdsdsn";

