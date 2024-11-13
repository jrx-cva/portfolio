SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS new_table;
DROP TABLE IF EXISTS Alumno;
DROP TABLE IF EXISTS Asignatura;
DROP TABLE IF EXISTS Profesor;




/* Create Tables */

CREATE TABLE Alumno
(
	NumMatricula varchar(20) NOT NULL,
	Nombre varchar(30),
	FechaNacimiento date,
	Telefono varchar(12),
	PRIMARY KEY (NumMatricula)
);


CREATE TABLE Asignatura
(
	CodAsignatura varchar(20) NOT NULL,
	Nombre varchar(30),
	IdProfesor int NOT NULL,
	PRIMARY KEY (CodAsignatura)
);


CREATE TABLE new_table
(
	NumMatricula varchar(20) NOT NULL,
	CodAsignatura varchar(20) NOT NULL,
	CursoEscolar varchar(9)
);


CREATE TABLE Profesor
(
	IdProfesor int NOT NULL,
	NIF_P varchar(12),
	Nombre varchar(30),
	Especialidad varchar(30),
	Telefono varchar(12),
	PRIMARY KEY (IdProfesor)
);



/* Create Foreign Keys */

ALTER TABLE new_table
	ADD FOREIGN KEY (NumMatricula)
	REFERENCES Alumno (NumMatricula)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE new_table
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



