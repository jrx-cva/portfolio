package com.carmen.me;

public class Empleado {
	String empresa;
	String edad;
	String num_empleados;
	
	public Empleado(String linea){
		//crear array
		String[] empleado = linea.split(",");
		
		//separar del array
		empresa = empleado[0];
		edad = empleado[1];
		num_empleados = empleado[2];
	}
	
	public Empleado(String empresa, String edad, String num_empleados) {
		this.empresa = empresa;
		this.edad = edad;
		this.num_empleados = num_empleados;
		
	}
	
	/**
	 * Método toString: para pasar un objeto a String.
	 */
	@Override
	public String toString() {
		return "Empleado [empresa=" + empresa + ", edad=" + edad + ", num_empleados=" + num_empleados + "]";
	}

	//GETTERS Y SETTERS
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNum_empleados() {
		return num_empleados;
	}

	public void setNum_empleados(String num_empleados) {
		this.num_empleados = num_empleados;
	}

}
