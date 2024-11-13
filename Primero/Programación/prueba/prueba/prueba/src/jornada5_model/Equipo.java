package jornada5_model;

import java.util.ArrayList;

public class Equipo {
	
	/***
	 * ESTADO
	 * 
	 */
	private String nombre;
	private String escudo;
	private String color;
	
	private int fundacion;
	
	private DT dt;
	
	
	
	
	
	/***
	 * COMPORTAMIENTO
	 * 
	 */

	//private Jugador jugador; //clase Jugador.
	//private Jugador[] jugadores; //array basico
	private ArrayList<Jugador> jugadores; //arraylist jugador
	
	public void addJugador(Jugador jugador) {
		
		if (jugadores == null) {
			
			jugadores = new ArrayList<>();
			
			
			jugadores.add(jugador);
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

	
	
	
	//getter escudo
	public String getEscudo() {
		return escudo;
	}

	
	//setter escudo
	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	
	
	
	
	//getter color
	public String getColor() {
		return color;
	}

	//setter color
	public void setColor(String color) {
		this.color = color;
	}

	
	
	
	//getter fundacion
	public int getFundacion() {
		return fundacion;
	}

	//setter fundacion
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	

	
	
	//getter dt	
	public DT getDt() {
		return dt;
	}

	//setter dt
	public void setDt(DT dt) {
		this.dt = dt;
	}




	public ArrayList<Jugador> getJugadores() {
		// TODO Auto-generated method stub
		return null;
	}













	
	
	

}
