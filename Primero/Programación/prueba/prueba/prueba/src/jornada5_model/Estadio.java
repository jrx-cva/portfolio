package jornada5_model;

public class Estadio {
	
	
	/***
	 * ESTADO
	 * 
	 */
	private String ciudad;
	private String nombre;
	
	private int aforo;

	
	
	
	/***
	 * COMPORTAMIENTO
	 * 
	 */
	
	
	/*GETTERS AND SETTERS*/
	//getter ciudad
	public String getCiudad() {
		return ciudad;
	}

	//setter ciudad
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	
	
	//getter nombre
	public String getNombre() {
		return nombre;
	}

	//setter nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	//getter aforo
	public int getAforo() {
		return aforo;
	}

	//setter aforo
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	

}
