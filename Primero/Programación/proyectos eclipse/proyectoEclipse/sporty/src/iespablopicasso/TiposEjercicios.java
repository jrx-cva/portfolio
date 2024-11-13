package com.iespablopicasso;

import java.util.ArrayList;

public class TiposEjercicios {
	
	//ESTADO
	
	//Lista de ejercicios disponibles
	protected ArrayList<Ejercicio> listaEjercicios;
	
	

	//Comportamiento
	
	
	//Constructor
	public TiposEjercicios() {
		listaEjercicios = new ArrayList();
	}
	
	//Añadir un ejercicio
	public void addEjercicio(Ejercicio nuevoE) {
		listaEjercicios.add(nuevoE);
	}
	
	//¿Cuantos hay?
	public int size() {
		return listaEjercicios.size();
	}
	
	//Dar el ejercicio de la posicion i
	public Ejercicio getEjercicioByIndex(int index) {
		return listaEjercicios.get(index);
	}
	
	public Ejercicio getEjercicioByDescripcion(String descr) {
		Ejercicio ejer = null;
		
		int i = 0;
		
		
		while (ejer==null && i<listaEjercicios.size()) {
		    if (listaEjercicios.get(i).getDescripcion() == descr) {
		    	ejer = listaEjercicios.get(i);
		    } else
		    	i++;
		}
		
		
		return ejer;
		
	}
	
}
