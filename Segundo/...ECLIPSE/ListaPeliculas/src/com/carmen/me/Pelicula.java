package com.carmen.me;

public class Pelicula {
	
	String titulo;
	String anio;
	String calidad;
	String formato;

	
	

	public Pelicula(String titulo, String año, String calidad, String formato) {
		this.titulo = titulo;
		this.anio = año;
		this.calidad = calidad;
		this.formato = formato;
	}
	



	public Pelicula() {
		this.titulo = null;
		this.anio = null;
		this.calidad = null;
		this.formato = null;
	}




	/**
	 * TO STRING
	 */
	@Override
	public String toString() {
		return titulo + ";" + anio + ";" + calidad + ";" + formato ;
	}
	
	
	
	//GETTERS Y SETTERS
	
	/**
	 * GETTER TITULO
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * SETTER TITULO
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * GETTER AÑO
	 * @return
	 */
	public String getAnio() {
		return anio;
	}
	/**
	 * SETTER AÑO
	 * @param año
	 */
	public void setAnio(String año) {
		this.anio = año;
	}
	
	/**
	 * GETTER CALIDAD
	 * @return
	 */
	public String getCalidad() {
		return calidad;
	}
	/**
	 * SETTER CALIDAD
	 * @param calidad
	 */
	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}
	
	/**
	 * GETTER FORMATO
	 * @return
	 */
	public String getFormato() {
		return formato;
	}
	/**
	 * SETTER FORMATO
	 * @param formato
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	

}