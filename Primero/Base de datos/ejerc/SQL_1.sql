CREATE DATABASE IF NOT EXISTS DISTRIBUCION;

USE DISTRIBUCION;

drop table empleados;
drop table oficinas;
drop table clientes;
drop table productos;
drop table pedidos;
drop table nuevaempleados;
drop table nuevaoficinas;
drop table nuevaproductos;
drop table nuevapedidos;

create table empleados(
  numemp int,
  nombre varchar(50),
  edad int,
  oficina int,
  titulo varchar(50),
  contrato date,
  jefe int,
  cuota int,
  ventas int);

create table oficinas(
  oficina int,
  ciudad varchar(50),
  region varchar(10),
  dir int,
  objetivo int,
  ventas int);

create table clientes(
  numclie int,
  nombre varchar(50),
  repclie int,
  limitecredito int);

create table productos(
  idfab varchar(10),
  idproducto varchar(15),
  descripcion varchar(20),
  precio int,
  existencias int);

create table pedidos(
  codigo int,
  numpedido int,
  fechapedido date,
  clie int,
  rep int,
  fab varchar(10),
  producto varchar(15),
  cant int,
  importe int);

insert into empleados values(101,'Antonio Viguer',45,12,'representante','1986/10/20',104,300000,305000);
insert into empleados values(102,'Alvaro Jaumes',48,21,'representante','1986/12/10',108,350000,474000);
insert into empleados values(103,'Juan Rovira',29,12,'representante','1987/03/01',104,275000,286000);
insert into empleados values(104,'Jose Gonzalez',33,12,'dir ventas','1987/05/19',106,200000,143000);
insert into empleados values(105,'Vicente Pantalla',37,13,'representante','1988/02/12',104,350000,368000);
insert into empleados values(106,'Luis Antonio',52,11,'dir general','1988/06/14',NULL,275000,299000);
insert into empleados values(107,'Jorge Gutierrez',49,22,'representante','1988/11/14',108,300000,186000);
insert into empleados values(107,'Ana Bustamante',62,21,'dir ventas','1989/10/12',106,350000,361000);
insert into empleados values(108,'Maria Sunta',31,11,'representante','1999/10/12',106,300000,392000);
insert into empleados values(110,'Juan Victor',41,NULL,'representante','1990/01/13',104,NULL,76000);

insert into oficinas values(11,'Valencia','este',106,575000,693000);
insert into oficinas values(12,'Alicante','este',104,800000,725000);
insert into oficinas values(13,'Castellon','este',105,350000,368000);
insert into oficinas values(21,'Badajoz','oeste',108,725000,836000);
insert into oficinas values(22,'A Coruña','oeste',108,300000,186000);
insert into oficinas values(23,'Madrid','centro',108,NULL,NULL);
insert into oficinas values(24,'Madrid','centro',108,250000,150000);
insert into oficinas values(26,'Pamplona','norte',NULL,NULL,NULL);
insert into oficinas values(28,'Valencia','este',NULL,900000,0);

insert into clientes values(2101,'Luis Garcia Anton',106,65000);
insert into clientes values(2102,'Alvaro Rodriguez',101,65000);

insert into productos values('aci','41001','arandela',58,277);
insert into productos values('aci','41002','bisagra',80,167);
insert into productos values('aci','41003','art t3',112,207);
insert into productos values('aci','41004','art t4',123,139);
insert into productos values('aci','4100x','junta',26,37);
insert into productos values('aci','4100y','extractor',2888,25);
insert into productos values('aci','4100z','mont',2625,28);
insert into productos values('bic','41003','manivela',652,3);
insert into productos values('bic','41089','rodamiento',225,78);
insert into productos values('bic','41672','plato',180,0);
insert into productos values('fea','112','cubo',148,115);
insert into productos values('fea','114','cubo',243,15);
insert into productos values('imm','773c','reostato',975,28);
insert into productos values('imm','775c','reostato 2',1425,5);
insert into productos values('imm','779c','caja clavos',54,223);
insert into productos values('imm','887p','perno',25,24);
insert into productos values('imm','887x','manivela',475,32);
insert into productos values('qsa','xk47','red',355,38);
insert into productos values('qsa','xk48','red',134,203);
insert into productos values('qsa','xk448a','red',117,37);
insert into productos values('rei','2a44g','pas',350,14);
insert into productos values('rei','2a44l','bomba l',4500,12);
insert into productos values('rei','2a44r','bomba r',4500,12);
insert into productos values('rei','2a45c','junta',79,210);

insert into pedidos values(1,110036,'1997/01/02',2102,110,'aci','4100z',9,22500);
insert into pedidos values(2,110036,'1997/01/02',2102,106,'rei','2a44l',7,31500);
insert into pedidos values(3,112963,'1997/05/10',2102,105,'aci','41004',28,3276);
insert into pedidos values(4,112968,'1990/01/11',2101,101,'aci','41004',34,3978);




















