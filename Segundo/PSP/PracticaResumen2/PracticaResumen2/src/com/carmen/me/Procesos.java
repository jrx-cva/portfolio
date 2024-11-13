package com.carmen.me;

public class Procesos { 
	
	
	private String nombre; //string
	private int tiempo_de_llegada;
	private int rafagas;
	private int rafagaPendiente;
	
	/**
	 * CONSTRUCTOR
	 * @param nombre
	 * @param tiempo_de_llegada
	 * @param rafagas
	 */
	public Procesos(String nombre, int tiempo_de_llegada, int rafagas ) {
		this.nombre = nombre;
		this.tiempo_de_llegada = tiempo_de_llegada;
		this.rafagas = rafagas;
		this.rafagaPendiente = rafagas;
	}
	
	
	/**
	 * METODO PARA QUE DESPUES IMPRIMA POR PANTALLA LAS RAFAGAS RESTANTES DE CADA PROCESO
	 */
	public void restar() {
		rafagaPendiente--;
	}
	
	
	/**
	 * TO STRING
	 * @param ciclo
	 * @return
	 */
	public String mostrarLinea(int ciclo) {
		return "CICLO " + ciclo + " - Procesos [id=" + nombre + ", rafaga pendiente=" + rafagaPendiente + "]";
	}
	
	/**
	 * TO STRING 2
	 * @param ciclo
	 * @return
	 */
	public String terminado(int ciclo) {
		return mostrarLinea(ciclo) + " - TERMINADO";
	}


	/**
	 * GETTER NOMBRE
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * SETTER NOMBRE
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * GETTER TIEMPO DE LLEGADA
	 * @return
	 */
	public int getTiempo_de_llegada() {
		return tiempo_de_llegada;
	}

	/**
	 * SETTER TIEMPO DE LLEGADA
	 * @param tiempo_de_llegada
	 */
	public void setTiempo_de_llegada(int tiempo_de_llegada) {
		this.tiempo_de_llegada = tiempo_de_llegada;
	}

	/**
	 * GETTER RAFAGAS
	 * @return
	 */
	public int getRafagas() {
		return rafagas;
	}

	/**
	 * SETTER RAFAGAS
	 * @param rafagas
	 */
	public void setRafagas(int rafagas) {
		this.rafagas = rafagas;
	}
	
	/**
	 * GETTER RAFAGAS PENDIENTE
	 * @return
	 */
	public int getRafagaPendiente() {
		return rafagaPendiente;
	}

	/**
	 * SETTER RAFAGA PENDIENTE
	 * @param rafagaPendiente
	 */
	public void setRafagaPendiente(int rafagaPendiente) {
		this.rafagaPendiente = rafagaPendiente;
	}
	

}
