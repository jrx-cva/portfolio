package com.carmen.me;

import java.util.ArrayList;

public class RoundRobin {
	ArrayList<Procesos> listaProcesos = new ArrayList();
	Procesos minRafaga;
	int ciclos = 0;
	
	/**
	 * CONSTRUCTOR
	 * @param listaProcesos
	 */
	public RoundRobin(ArrayList<Procesos> listaProcesos) {
		this.listaProcesos = listaProcesos;
	}
	
	/**
	 * METODO QUE CONTIENE EL ALGORITMO DEL ROUND ROBIN
	 */
	public void simular() {
		int quantum = 2;
		float indice = 0;
		float rendimiento0 = 0;
		float rendimiento = 0;
		
		while (!listaProcesos.isEmpty()) { //cuando la lista de procesos este vacia entonces crear nueva arraylist 
			ArrayList<Procesos> listaLlegada = new ArrayList();
			
			for (int i=0; i<listaProcesos.size(); i++) {
				if (listaProcesos.get(i).getTiempo_de_llegada() < ciclos)
					listaLlegada.add(listaProcesos.get(i));
			}
			
			if (quantum != 0) { 
			
			} else {
				
			}
		}
	}
}




