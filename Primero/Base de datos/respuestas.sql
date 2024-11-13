/*1*/
create view vista_alumnos as select * from alumnos where nota>=5;
/*2*/
alter view vista_alumnos as select * from alumnos where codigoprofesor=1;
/*3*/
drop view vista_alumnos;
/*4*/
create view vista_nota_alumnos_aprobados as select documento,alumnos.nombre as 'nombre_alumnos',alumnos.nota,profesores.nombre as 'nombre_profesores',codigoprofesor from alumnos,profesores where alumnos.codigoprofesor=profesores.codigo and alumnos.nota>=6;
/*5*/
insert into vista_nota_alumnos_aprobados(documento,nombre_alumnos,nota,codigoprofesor) values('99999999','Pablo Rodriguez',10,1);
/*6*/
update vista_nota_alumnos_aprobados set nota=10 where documento='30444444';

