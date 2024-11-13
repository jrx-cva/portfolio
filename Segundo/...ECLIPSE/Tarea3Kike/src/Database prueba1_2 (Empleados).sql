create database if not exists prueba1_2;

use prueba1_2;


 
  create table Región(
 CodRegión int not null,
 primary key (CodRegión),
 Nombre varchar(50)
 );

 
 create table Provincia(
 CodProvincia int not null,
 primary key (CodProvincia),
 Nombre varchar(50),
 CodRegión int not null REFERENCES Región(CodRegión)
 );
 
 create table Localidad(
 CodLocalidad int not null,
 primary key (CodLocalidad),
 CodProvincia int not null REFERENCES Provincia(CodProvincia)
 );

create table Empleado(
ID int not null,
PRIMARY KEY (ID),
dni varchar(12) UNIQUE,
Nombre varchar(50),
FechaNac date,
Teléfono varchar(12),
Salario int,
CodLocalidad int not null REFERENCES Localidad(CodLocalidad)
 );