create database colegio;
use colegio;

drop table if exists alumnos;
drop table if exists profesores;
 
 create table alumnos(
  documento char(8),
  nombre varchar(30),
  nota decimal(4,2),
  codigoprofesor int,
  primary key(documento)
 );

 create table profesores (
   codigo int auto_increment,
   nombre varchar(30),
   primary key(codigo)
 );


 insert into alumnos values('30111111','Ana Algarbe', 5.1, 1);
 insert into alumnos values('30222222','Bernardo Bustamante', 3.2, 1);
 insert into alumnos values('30333333','Carolina Conte',4.5, 1);
 insert into alumnos values('30444444','Diana Dominguez',9.7, 1);
 insert into alumnos values('30555555','Fabian Fuentes',8.5, 2);
 insert into alumnos values('30666666','Gaston Gonzalez',9.70, 2);

 insert into profesores(nombre) values ('Maria Luque');
 insert into profesores(nombre) values ('Jorje Dante'); 