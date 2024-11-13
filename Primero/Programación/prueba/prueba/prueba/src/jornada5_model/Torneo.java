package jornada5_model;

import java.util.ArrayList;

public class Torneo {
	 
	
	
	/***
	 * ESTADO
	 * 
	 */
	
	private String nombre;
	private String descripcion;
	
	private boolean nacional;
	
	private ArrayList<Fecha> fechas;
	
	
	

	
	/***
	 * COMPORTAMIENTO
	 * 
	 */
	public Torneo() {
		
		if (fechas != null) {
			fechas = new ArrayList<>();
			
		}
		//System.out.println("Inicializando clase");
	}
	
	public void addFecha(Fecha fecha) {
		
		if (fechas != null) {
			fechas = new ArrayList<Fecha>();
			
			fechas.add(fecha);
		}
		 
	}
	
	
	
	
	/*GETTERS AND SETTERS*/
	//getter nombre
	public String getNombre() {
		return nombre;
	}

	//setter nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	//getter descripcion
	public String getDescripcion() {
		return descripcion;
	}

	//setter descripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	//boolean nacional
	public boolean isNacional() {
		return nacional;
	}

	//setter nacional
	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

	
	
	

}
