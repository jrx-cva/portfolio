CREATE DATABASE IF NOT EXISTS DISTRIBUCION;

USE DISTRIBUCION;

drop table personas;
drop table emple;
drop table depart;
drop table hospital;
drop table personas1;
drop table personas2;

create table personas(
  cod_hospital int,
  dni int,
  apellidos varchar(50),
  funcion varchar(50),
  salario int);

create table emple(
  emp_no int,
  apellido varchar(50),
  oficio varchar(10),
  dir int,
  fecha_alt int,
  salario int,
  comision int,
  dept_no int);

create table depart(
  dept_no int,
  dnombre varchar(50),
  loc varchar(20));

create table hospital(
  cod_hospital int,
  nombre varchar(50),
  direccion varchar(15),
  num_plazas int);


insert into personas values(1, 12345678,'Garcia Hernandez, Eladio','CONSERJE',1500);
insert into personas values(4, 22233311,'Martinez Molina, GLoria','MEDICO',1600);
insert into personas values(2, 22233322,'Tristan Garcia, Ana','MEDICO',1900);
insert into personas values(2, 22233333,'MArtinez Molina, Andres','MEDICO',1600);
insert into personas values(4, 33222111,'Mesa del Castillo, Juan','MEDICO',2200);
insert into personas values(3, 55544411,'Ruiz Hernandez, Caridad','MEDICO',1900);
insert into personas values(4, 55544412,'Jimenez Jimenez, Dolores','CONSERJE',1200);
insert into personas values(2, 55544433,'Gonzalez Marin, Alicia','CONSERJE',1200);
insert into personas values(1, 66655544,'Castillo Montes, Pedro','MEDICO',1700);
insert into personas values(1, 87654321,'Fuentes Bermejo, Carlos','DIRECTOR',2000);
insert into personas values(3, 99988333,'Serrano Diaz, Alejandro','DIRECTOR',2400);

insert into emple values(7369,'SANCHEZ','EMPLEADO',7902,'17/12/1980',104000, NULL, 20);
insert into emple values(7499,'ARROYO','VENDEDOR',7698,'20/02/1980',208000, 39000, 30);
insert into emple values(7521,'SALA','VENDEDOR',7698,'22/02/1981',162500, 162500, 30);
insert into emple values(7566,'JIMENEZ','DIRECTOR',7839,'02/04/1981',386750, NULL, 20);
insert into emple values(7654,'MARTIN','VENDEDOR',7698,'29/09/1981',162500, 182000, 30);
insert into emple values(7698,'NEGRO','DIRECTOR',7839,'01/05/1981',370500, NULL, 30);
insert into emple values(7788,'GIL','ANALISTA',7566,'09/11/1981',390000, NULL, 20);
insert into emple values(7839,'REY','PRESIDENTE',NULL,'17/11/1981',650000, NULL, 10);
insert into emple values(7844,'TOVAR','VENDEDOR',7698,'08/09/1981',195000, 0, 30);
insert into emple values(7876,'ALONSO','EMPLEADO',7788,'23/09/1981',143000, NULL, 20);
insert into emple values(7900,'JIMENO','EMPLEADO',7698,'03/12/1981',1235000, NULL, 30);
insert into emple values(7902,'FERNANDEZ','ANALISTA',7566,'03/12/1981',390000, NULL, 20);
insert into emple values(7934,'MUÑOZ','EMPLEADO',7782,'23/01/1982',390000, NULL, 10);


insert into depart values(10,'CONTABILIDAD','SEVILLA');
insert into depart values(20,'INVESTIGACION','MADRID');
insert into depart values(30,'VENTAS','BARCELONA');
insert into depart values(40,'PRODUCCION','BILBAO');

insert into hospital values(1,'Vivian Pellas','Managua',500);
insert into hospital values(2,'Oscar Danilo Rosales','Leon',230);
insert into hospital values(3,'Bertha Calderon','Managua',210);
insert into hospital values(4,'La Mascota','Managua',156);
insert into hospital values(5,'La Asuncion','Chontales',120);




















