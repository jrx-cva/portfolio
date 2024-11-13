package jornada5_model;

import java.util.ArrayList;
import java.util.Random;

public class Partido {
	
	/***
	 * ESTADO
	 * 
	 */
	private Estadio estadio;
	private Equipo local;
	private Equipo visita;
	
	private int golesVisita;
	private int golesLocal;
	
	private float promedio;
	
	private static final int GOLES_MAXIMO = 7;
	
	
	
	/***
	 * COMPORTAMIENTO
	 * 
	 */

	
	public void jugarResultado() {
		
		Random rnd = new Random();
		
		//golesLocal = rnd.nextInt(7);
		golesLocal = calcularGol(local);
		//golesVisita = rnd.nextInt(7);
		golesVisita = calcularGol(visita);
		
		
		System.out.println("********************");
		
		System.out.print(golesLocal + " " + local.getNombre() + " - ");
		System.out.println(golesVisita + " " + visita.getNombre());
		
		System.out.println("********************");
	}
	
	
	private int calcularGol(Equipo equipo) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		ArrayList<Jugador> jugadores = equipo.getJugadores();
		
		int promedio = 0;
		
		for (Jugador jugador : jugadores) {
			
			promedio += jugador.getPromedio();
			
		}
		
		promedio /= jugadores.size();
		
		return rnd.nextInt(promedio);
	}


	
	//private void miMetodo() {
	//}
	
	
	
	
	//getter estadio
	public Estadio getEstadio() {
		return estadio;
	}
	
	//setter estadio
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	
	//getter local
	public Equipo getLocal() {
		return local;
	}
	
	//setter local
	public void setLocal(Equipo local) {
		this.local = local;
	}
	
	
	
	
	//getter visita
	public Equipo getVisita() {
		return visita;
	}
	
	//setter visita
	public void setVisita(Equipo visita) {
		this.visita = visita;
	}
	
	
	
	
	
	

}
