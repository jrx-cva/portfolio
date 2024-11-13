create database if not exists prueba1;

use prueba1;

create table Alumnos(
NumMatrícula int not null,
PRIMARY KEY (NumMatrícula),
Nombre varchar(50),
FechaNacimiento date,
Teléfono varchar(12)
 );
 
  create table Profesor(
 IdProfesor int not null,
 primary key (IdProfesor),
 NIF_P varchar(12) UNIQUE,
 Nombre varchar(50),
 Especialidad varchar(50),
 Teléfono varchar(12)
 );

 
 create table Asignatura(
 CodAsignatura int not null,
 primary key (CodAsignatura),
 Nombre varchar(50),
 IdProfesor int,
 FOREIGN KEY(IdProfesor)
 REFERENCES Profesor(IdProfesor)
 );
 
 create table Recibe(
 NumMatrícula int not null  REFERENCES Alumnos(NumMatrícula),
 CodAsignatura int not null  REFERENCES Asignatura(CodAsignatura),
 primary key (NumMatrícula,CodAsignatura),
 CursoEscolar varchar(50)
 );


