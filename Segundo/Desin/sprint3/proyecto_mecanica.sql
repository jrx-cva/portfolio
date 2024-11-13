create database if not exists proyecto_mecanica;

create table if not exists concesionario(
id_concesionario int primary key auto_increment,
cif varchar(50) unique not null,
nombre_concesionario varchar(100) not null,
provincia varchar(50),
direccion_concesionario varchar(250) not null,
descripcion_concesionario text
);

create table if not exists cliente(
id_cliente int primary key auto_increment,
nombre_cliente varchar(50) not null,
nif_cliente varchar(50) not null unique,
email_cliente varchar(250),
num_cuenta varchar(100)
);

create table if not exists especialidad(
id_especialidad int primary key auto_increment,
nombre_especialidad varchar(100),
descripcion_especialidad text
);

create table if not exists usuario(
id_usuario int  primary key auto_increment,
id_concesionario int,
nombre_usuario varchar(100) not null unique,
contrasenia varchar(50) not null,
antiguedad year,
sueldo decimal(7,2),
tipo_contrato varchar(250),
nif_usuario varchar(50) not null unique,
email_usuario varchar(100) not null,
estudios varchar(250),

constraint fk_usuario_concesionario foreign key(id_concesionario) references concesionario(id_concesionario)
);

create table if not exists mecanico(
id_mecanico int primary key auto_increment,
id_usuario int,
id_especialidad int,
id_jefemecanico int,

constraint fk_mecanico_usuario foreign key(id_usuario) references usuario(id_usuario),
constraint fk_mecanico_especialidad foreign key(id_especialidad) references especialidad(id_especialidad)
);

alter table mecanico
add constraint fk_mecanico_mecanico foreign key(id_jefemecanico) references mecanico(id_mecanico);

create table if not exists venta(
id_ventas int primary key auto_increment,
id_usuario int,
num_vendidos int,
fecha_venta datetime,

constraint fk_venta_usuario foreign key(id_usuario) references usuario(id_usuario)
);

create table if not exists jefe(
id_jefe int default 1,
id_usuario int,

constraint fk_jefe_usuario foreign key(id_usuario) references usuario(id_usuario)
);

create table if not exists vehiculo(
id_vehiculo int primary key auto_increment,
id_concesionario int,
id_cliente int,
id_ventas int,
num_bastidor varchar(100) not null,
matricula varchar(10) default null,
marca varchar(50) not null,
modelo varchar(50) not null,
tipo_vehiculo enum('Nuevo', 'Segunda mano', 'Km 0'),
color varchar (50),
potencia varchar(10) not null,
anio year,
combustible enum('Electrico', 'Hibrido', 'Gasolina', 'Gasoil'),
precio decimal(11,2),
descripcion_vehiculo text,

constraint fk_vehiculo_concesionario foreign key(id_concesionario) references concesionario(id_concesionario),
constraint fk_vehiculo_cliente foreign key(id_cliente) references cliente(id_cliente),
constraint fk_vehiculo_venta foreign key(id_ventas) references venta(id_ventas)
);

create table if not exists coche(
id_coche int primary key auto_increment,
id_vehiculo int,
tipo_radio varchar(50),
tipo_freno varchar(50),
tipo_embrague varchar(50),
tipo_emision enum('O', 'B', 'C', 'ECO'),
numero_plaza enum('2','4','5','7','8','9'),

constraint fk_coche_vehiculo foreign key(id_vehiculo) references vehiculo(id_vehiculo)
);

create table if not exists motocicleta(
id_motocicleta int primary key auto_increment,
id_vehiculo int,
tipo_motocicleta varchar(50) not null,
tipo_freno varchar(50),
tipo_horquilla varchar(50),
numero_plaza enum('1','2','3'),

constraint fk_coche_motocicleta foreign key(id_vehiculo) references vehiculo(id_vehiculo)
);

create table if not exists ciclomotor(
id_ciclomotor int primary key auto_increment,
id_vehiculo int,
tipo_ciclomotor varchar(50) not null,

constraint fk_coche_ciclomotor foreign key(id_vehiculo) references vehiculo(id_vehiculo)
);

create table if not exists propuesta(
id_propuesta int primary key auto_increment,
id_ventas int,
id_cliente int,
id_vehiculo int,
precio_propuesta decimal(11,2),
fecha_propuesta datetime,
fecha_validez date,
descripcion_propuesta text,

constraint fk_propuesta_vehiculo foreign key(id_vehiculo) references vehiculo(id_vehiculo),
constraint fk_propuesta_ventas foreign key(id_ventas) references venta(id_ventas),
constraint fk_propuesta_cliente foreign key(id_cliente) references cliente(id_cliente)
);

create table if not exists repara(
id_repara int primary key auto_increment,
id_vehiculo int,
id_mecanico int,
inicio_reparacion datetime,
fin_reparacion datetime,
horas_reparacion float,
tipo_reparacion varchar(250) not null,
descripcion_reparacion text,

constraint fk_repara_vehiculo foreign key(id_vehiculo) references vehiculo(id_vehiculo),
constraint fk_repara_mecanico foreign key(id_mecanico) references mecanico(id_mecanico)
);

insert into cliente(nombre_cliente, nif_cliente, email_cliente, num_cuenta)
values("Pepe Grillo", "15782668M", "pepeg@gmail.com", "4445557788VD"),
("Grillo Man", "12285568L", "grillom@gmail.com", "55245587245JK"),
("Pinocho", "15474168K", "pinocho@gmail.com", "1112459524TH");

insert into concesionario(cif, nombre_concesionario, provincia, direccion_concesionario, descripcion_concesionario)
values("Jl1234n", "Seat Antequera", "Malaga", "Avd. Naciones nº7",""),
("N234h89", "Mercedes Malaga", "Malaga", "Calle Cruz Verde nº35",""),
("F48930D", "Peugeot Velez", "Malaga", "Poligono Pañoleta nº12","");

insert into especialidad(nombre_especialidad, descripcion_especialidad)
values("Ruedas",""),
("Motor",""),
("Embrague","");

alter table usuario
modify nombre_usuario varchar(100) unique;

insert into usuario(id_concesionario,nombre_usuario, contrasenia, antiguedad, sueldo, tipo_contrato, nif_usuario, email_usuario, estudios)
values(3,"Carmen V", "fbe60144cc372802e61d766d91e13d9b", 7 , 1784.14, "Fijo", "14257491M","carmenv@gmail.com", "CFGM Mecánica"),
(1,"Laura R", "ba89cfd9f0c17d491750140c4656e536", 2, 997.02 , "Fijo discontinuo", "22601478L","laurar@gmail.com", "Curso Administracion (2200h)"),
(2,"Pepe D", "18da9cfc427be98d938d36e9985cfa8c", 1, 2000.59, "Eventual", "05620074V","peped@gmail.com", "ESO");

insert into mecanico(id_usuario, id_especialidad, id_jefemecanico)
values(1, 2, 1),
(1, 3, 1),
(1, 2, 1);

insert into venta(id_usuario, num_vendidos, fecha_venta)
values(2, 2, current_date()),
(3, 1, current_date()),
(1, 2, current_date());

insert into jefe(id_usuario)
values(2),
(3),
(1);

insert into vehiculo(id_concesionario, id_cliente, id_ventas, num_bastidor, matricula, marca, 
		modelo, tipo_vehiculo, color, potencia, anio, combustible, precio, descripcion_vehiculo)
values(2, 2, 1, "b1475h215","", "Seat", "Leon", "Nuevo", "Azul", "105CV", 2020, "Gasolina", 18687.47, ""),
(3, 1, 3, "124v25478h2", "5458 BGF", "Opel", "Corsa", "Segunda mano", "Blanco", "72CV", 2001, "Gasoil", 2000, ""),
(3, 2, 1, "9956g245H", "1424 LKJ", "Hyundai", "i20", "Km 0", "Negro", "110CV", 2020, "Hibrido", 24985.95,"");

insert into vehiculo(id_concesionario, id_cliente, id_ventas, num_bastidor, matricula, marca, 
		modelo, tipo_vehiculo, color, potencia, anio, combustible, precio, descripcion_vehiculo)
values(2, 2, 1, "b1453h215","", "Suzuki", "GS-500", "Nuevo", "Azul", "48CV", 2020, "Gasolina", 12687.47, ""),
(3, 1, 3, "124v11178h2", "5451 BGF", "Kawasaki", "z-750", "Segunda mano", "Blanco", "120CV", 2001, "Gasolina", 3000, ""),
(3, 2, 1, "8886g245H", "1124 GKJ", "Vespa", "Elettrica L3", "Km 0", "Negro", "49CV", 2020, "Electrico", 5985.95,"");

insert into coche(id_vehiculo, tipo_radio, tipo_freno, tipo_embrague, tipo_emision, numero_plaza)
values(3, "1DIN", "Discos flotantes con pinzas fijas", "Embrague Hidráulico", 'B', '5'),
(1, "Normal", "Discos ranurados con pinzas fijas", "Embrague Mecánico", 'O', '4');

insert into motocicleta(id_vehiculo,tipo_motocicleta, tipo_freno, tipo_horquilla, numero_plaza)
values(5, "Naker", "Frenada combinada", "Telescópica", '2'),
(1, "Naker", "ABS", "Sin horquilla", '1');

insert into ciclomotor(id_vehiculo,tipo_ciclomotor)
values(5, "Scooter"),
(1, "Custom");

insert into propuesta(id_ventas, id_cliente, id_vehiculo, precio_propuesta, fecha_propuesta, fecha_validez, descripcion_propuesta)
values(3, 1, 5, 3000, current_date(), "2020-11-18", "");

insert into repara(id_vehiculo, id_mecanico, inicio_reparacion, fin_reparacion, horas_reparacion, tipo_reparacion, descripcion_reparacion)
values(2, 1, '2020-10-29 08:00:00', current_date(), 8.20, "Reparacion simple de ruedas", ""),
(6, 1, current_date(), null , 0.0, "Reparacion del embrague", "");

alter table propuesta
add nombre_usuario varchar(50) default null;

update propuesta
set nombre_usuario = "Lolita"
where id_cliente = 1;

alter table usuario
add rol_usuario enum('Jefe', 'Ventas', 'Mecánico') not null;

UPDATE `proyecto_mecanica`.`usuario` SET `rol_usuario` = 'Ventas' WHERE (`id_usuario` = '2');
UPDATE `proyecto_mecanica`.`usuario` SET `rol_usuario` = 'Mecánico' WHERE (`id_usuario` = '1');


alter table propuesta
add estado_propuesta varchar(50) default "En curso";

alter table mecanico
add tipo_empleado enum('Jefe', 'Empleado') default 'Empleado';

UPDATE `proyecto_mecanica`.`mecanico` SET `tipo_empleado` = 'Jefe' WHERE (`id_mecanico` = '2');

alter table vehiculo
add km int(6) default 0;

UPDATE `proyecto_mecanica`.`propuesta` SET `estado_propuesta` = 'Finalizada' WHERE (`id_propuesta` = '1');
