SET SESSION FOREIGN_KEY_CHECKS=0;


CREATE TABLE IF NOT EXISTS alumno (
    NumMatricula varchar(20) NOT NULL,
	Nombre varchar(30),
	FechaNacimiento date,
	Telefono varchar(12),
	PRIMARY KEY (NumMatricula)
);


create table if not exists asignatura(
	CodAsignatura varchar(20) NOT NULL,
	Nombre varchar(30),
	IdProfesor int NOT NULL,
	PRIMARY KEY (CodAsignatura)
);

create table if not exists profesor(
	IdProfesor int NOT NULL,
	NIF_P varchar(12),
	Nombre varchar(30),
	Especialidad varchar(30),
	Telefono varchar(12),
	PRIMARY KEY (IdProfesor)
);

create table if not exists recibe(
	NumMatricula varchar(20) NOT NULL,
	CodAsignatura varchar(20) NOT NULL,
	CursoEscolar varchar(9)
);

create table if not exists localidad(
id_localidad int primary key auto_increment,
nombre varchar(45),
cod_provincia int unique
);

create table if not exists provincia(
cod_provincia int primary key auto_increment,
nombre_provincia varchar(45),
id_localidad int unique
);


create table if not exists region(
id_region int primary key unique auto_increment,
nombre varchar(50)
);

/* Create Foreign Keys */

ALTER TABLE recibe
	ADD FOREIGN KEY (NumMatricula)
	REFERENCES Alumno (NumMatricula)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE recibe
	ADD FOREIGN KEY (CodAsignatura)
	REFERENCES Asignatura (CodAsignatura)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Asignatura
	ADD FOREIGN KEY (IdProfesor)
	REFERENCES Profesor (IdProfesor)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


/*
insert into alumno(numMatricula, nombre, fechaNacimiento, telefono)
values("15782668M", "Pepe Grillo", "12diciembre1990", 954765244),
("12285568L", "Grillo Man", "10enero1987", 964387266),
("15474168K", "Pinocho", "10febrero1997", 946377843);

insert into asignatura(nombre, idProfesor)
values("lengua", 1),
("matemáticas", 2),
("tecnología", 3);

insert into profesor(NIF_P, nombre, especialidad, telefono)
values("14257491M","Raul", "matemáticas", 946353722),
("22601478L","Juan", "biología", 973892392),
("05620074V","Blanca", "tecnología", 973628826);

insert into recibe(numMatricula, codAsignatura, cursoEscolar)
values(2, 1, "2ºEso"),
(6, 1, "1ºBachiller");

insert into empleado(id_localidad, dni, nombre, fechaNac, telefono, salario, cod_localidad)
values(3,"14257491M", "Carmen", "12septiembre2001", 976493019 , 1700, 1),
(1,"22601478L", "Laura", "14agosto19990", 926173929, 997.02 , 1689, 2),
(2,"05620074V", "Pepe", "1febrero1980", 972519200, 2000.59, 1950, 3);

insert into localidad(id_provincia, nombre, cod_provincia)
values(2,"Alcaucin‎", 1),
(3,"Frigiliana‎", 2),
(4,"El Borge‎", 3);


insert into provincia(nombre_provincia, id_localidad)
values(2, "Región de Arica y Parinacota" ),
(2, "Región de Tarapacá"),
(1, "Región de Antofagasta");

insert into region(id_provincia, nombre)
values("Huelva", 2 ),
("Álava", 2),
("Cáceres", 1);
*/