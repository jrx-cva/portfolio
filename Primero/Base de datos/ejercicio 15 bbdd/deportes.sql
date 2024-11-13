create database if not exists club;

use club;

drop table if exists socios;
drop table if exists inscritos;

 create table socios (
  numero int primary key,
  nombre varchar(30),
  domicilio varchar(30)
 );
 
 create table inscritos (
  numerosocio int not null,
  deporte varchar(20) not null,
  cuotas int,
  primary key(numerosocio,deporte)
 );


 insert into socios(numero,nombre,domicilio) values(1,'Alberto Paredes','Colon 11');
 insert into socios(numero,nombre,domicilio) values(2,'Carlos Conte','Sarmiento 55');
 insert into socios(numero,nombre,domicilio) values(3,'Fabian Fuentes','Caseros 87');
 insert into socios(numero,nombre,domicilio) values(4,'Hector Lopez','Sucre 34');
 insert into socios(numero,nombre,domicilio) values(5,'Ana Martin','Mayor 24');


 insert into inscritos values(1,'tenis',1);
 insert into inscritos values(1,'basquet',2);
 insert into inscritos values(1,'natacion',1);
 insert into inscritos values(2,'tenis',9);
 insert into inscritos values(2,'natacion',1);
 insert into inscritos values(2,'basquet',0);
 insert into inscritos values(2,'futbol',2);
 insert into inscritos values(3,'tenis',8);
 insert into inscritos values(3,'basquet',9);
 insert into inscritos values(3,'natacion',0);
 insert into inscritos values(4,'basquet',10);
 

