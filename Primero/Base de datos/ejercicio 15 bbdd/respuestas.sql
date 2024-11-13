	/*1.Crea una vista llamada vista_inscritos con todos los inscritos en “natacion”*/
 CREATE VIEW vista_inscritos AS SELECT * FROM inscritos WHERE deporte="natacion";
 
	/*2.Modifica vista_ inscritos para sólo aparezcan los inscritos que han pagado alguna cuota. Comprueba el resultado.*/
 ALTER VIEW vista_inscritos AS SELECT * FROM inscritos WHERE cuotas!=NULL;
 
	/*3.Elimina la vista vista_ inscritos*/
 DROP VIEW vista_inscritos;
 
	/*4.Crea una subconsulta con el operador "exists" para devolver la lista de socios que se inscribieron en 'natacion' y “tenis”. Comprueba el resultado.*/
 SELECT * FROM socios WHERE EXISTS(SELECT * FROM inscritos WHERE socios.numero=inscritos.numerosocio AND deporte IN ("natacion","tenis"));
 
	/*5.Busca los socios que NO se han inscrito en 'natacion' empleando "not exists". Comprueba el resultado.*/
 SELECT * FROM socios WHERE NOT EXISTS(SELECT * FROM inscritos WHERE socios.numero=inscritos.numerosocio AND inscritos.deporte='natacion');	
 
	/*6.Muestra todos los datos de los socios que han pagado todas las cuotas con el operador "exists". Comprueba el resultado.*/
  SELECT * FROM socios WHERE EXISTS(SELECT * FROM inscritos WHERE socios.numero=inscritos.numerosocio AND inscritos.cuotas=10); 
 
	/*7.Muestra todos los datos de los socios que han pagado 5 o más cuotas con el operador "exists". Comprueba el resultado.*/
 SELECT * FROM socios WHERE EXISTS(SELECT * FROM inscritos WHERE socios.numero=inscritos.numerosocio AND inscritos.cuotas>=5);
 
	/*8.Listar los socios que están inscritos en algún deporte con el operador "exists". Comprueba el resultado.*/ 
 SELECT * FROM socios WHERE EXISTS(SELECT * FROM inscritos WHERE socios.numero=inscritos.numerosocio AND inscritos.deporte IN ("natacion","tenis","basquet","futbol"));
 
	/*9.Listar los socios que NO están inscritos en algún deporte con el operador "not exists". Comprueba el resultado.*/
 SELECT * FROM socios WHERE NOT EXISTS(SELECT * FROM inscritos WHERE socios.numero=inscritos.numerosocio AND inscritos.deporte IN ("natacion","tenis","basquet","futbol"));
 
	/*10.Cambiar en la tabla inscritos “basquet“ por “baloncesto”. Comprueba el resultado.*/
 UPDATE inscritos SET deporte ="baloncesto" WHERE inscritos.deporte = "basquet";
 
