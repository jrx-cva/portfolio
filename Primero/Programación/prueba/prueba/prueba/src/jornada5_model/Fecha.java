package jornada5_model;

import java.util.ArrayList;

public class Fecha {
	
	/**
	 * ESTADO
	 * 
	 */
	private int numero;
	
	private boolean fechaFifa;

	private ArrayList<Partido> partidos;
	
	
	
	
	
	/***
	 * COMPORTAMIENTO
	 * 
	 */
	
	public Fecha() {
		
	}
	
	public Fecha(int numero) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
	}
	
	
	
	public void addPartido(Partido partido) {
		
		if (partidos == null) {
			partidos = new ArrayList<Partido>();
			
			partidos.add(partido);
		}
		
	}
	
	
	/*GETTERS AND SETTERS*/
	//getter numero
	public int getNumero() {
		return numero;
	}

	//setter numero
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	//boolean fechaFifa
	public boolean isFechaFifa() {
		return fechaFifa;
	}

	//setter fechaFifa
	public void setFechaFifa(boolean fechaFifa) {
		this.fechaFifa = fechaFifa;
	}
	
	
	

}
