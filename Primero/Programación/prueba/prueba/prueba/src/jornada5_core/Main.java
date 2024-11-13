package jornada5_core;

import jornada5_model.Equipo;
import jornada5_model.Estadio;
import jornada5_model.Fecha;
import jornada5_model.Jugador;
import jornada5_model.Partido;
import jornada5_model.Torneo;


public class Main {
	public static void main(String[] args) {
		
		
		Torneo torneo = new Torneo();
		torneo.setNombre("La Liga");
		
		Fecha fecha = new Fecha(1);
		torneo.addFecha(fecha);
		
		Equipo real = new Equipo();
		real.setNombre("Real Madrid");
		
		Equipo barsa = new Equipo();
		barsa.setNombre("Barcelona");
		
		
		for (int i = 0; i < 5; i++) {
			Jugador jug = new Jugador();
			jug.setNombre(i + "_BARSA");
			jug.setPromedio(7);
			barsa.addJugador(jug);
					
		}
		
		for (int i = 0; i < 5; i++) {
			Jugador jug = new Jugador();
			jug.setNombre(i + "_MADRID");
			jug.setPromedio(9);
			real.addJugador(jug);
					
		}
		
		
		Estadio estadio = new Estadio();
		estadio.setNombre("Bernabeu");
		
		Partido partido = new Partido();
		partido.setEstadio(estadio);
		partido.setLocal(real);
		partido.setVisita(barsa);
		
		partido.jugarResultado();
		
		
		
	}
	
	
	

}
