
public class Medico {
	String nombre;
	Integer edad;
	String dni;
	Integer salario;
	Integer numerodeoperacion;


public Medico(String nombre, Integer edad,String dni,Integer salario,Integer numerodeoperacion) {
	this.nombre = nombre;
	this.edad = edad;
	this.dni = dni;
	this.salario = salario;
	this.numerodeoperacion = numerodeoperacion;
}

public boolean aumentoDeSalario(Integer miNumeroOperacion ) {
	boolean aumento = false;
	
	if(numerodeoperacion<30) {
		salario += 100;
		aumento = true;
	}
	return aumento;
}
public boolean compararNombre(String nombresito) {
	if(nombre == nombresito) {
		return true;
	}
	return false;
}
public boolean compararDni(String dni) {
	boolean comparacion = false;
	if(this.dni.equals(dni)) {
		comparacion = true;
	}
	return comparacion;
}

public String getNombre() {
	return nombre;
}
public String setnombre() {
	return nombre;
}
public String getDni() {
	return dni;
}
public String setDni() {
	return dni;
}




}