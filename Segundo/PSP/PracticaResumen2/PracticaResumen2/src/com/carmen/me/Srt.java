package com.carmen.me;

import java.util.ArrayList;

public class Srt {
	ArrayList<Procesos> listaProcesos = new ArrayList();
	int ciclos = 1;
	int cantidad_de_procesos;
	Procesos minRafaga;
	Procesos minTiempo;
	
	/**
	 * CONSTRUCTOR
	 * @param listaProcesos
	 */
	public Srt(ArrayList<Procesos> listaProcesos) {
		this.listaProcesos = listaProcesos;
		cantidad_de_procesos = listaProcesos.size();
	}
	
	/**
	 * METODO QUE CONTIENE EL ALGORITMO DEL SRT
	 */
	public void simular() {
		float indice = 0;
		float rendimiento0 = 0;
		float rendimiento = 0;
		
		//recorrer la lista e imprimirlos segun orden de llegada y rafaga mas corta
		
		while (!listaProcesos.isEmpty()) { //cuando la lista de procesos este vacia 
			comprobarRafaga(); //seria igual
			comprobarTiempo();
			
			for (int i=0; i < minRafaga.getRafagas(); i++){
				minRafaga.restar();
				
				if (minRafaga.getRafagaPendiente() == 0) {
					indice = (ciclos-minRafaga.getTiempo_de_llegada())/minRafaga.getRafagas();
					rendimiento0 = rendimiento0 + indice;
					System.out.println(minRafaga.terminado(ciclos));
				} else {
					System.out.println(minRafaga.mostrarLinea(ciclos));
				}
				ciclos++;
			}
			listaProcesos.remove(minRafaga);
		}
		rendimiento = rendimiento0/cantidad_de_procesos;
		System.out.println("rendimiento: " + rendimiento);
	}
	
	/**
	 * METODO PARA COMPROBAR LA RAFAGA DE CADA PROCESO
	 */
	private void comprobarRafaga() {
		minRafaga = listaProcesos.get(0);
		
		//comprobar cual tiene menor ráfaga en menor ciclo
		for (int i=1; i<listaProcesos.size(); i++) {
			if (listaProcesos.get(i).getTiempo_de_llegada() < ciclos) { //comparar ciclo con orden de llegada //B; tiempo de llegada=2 ciclos=5
				if (listaProcesos.get(i).getRafagas() < minRafaga.getRafagas() ) {
					minRafaga = listaProcesos.get(i);
					
				}
			}
		}
	}
	
	/**
	 * METODO PARA COMPROBAR EL TIEMPO EN EL QUE LLEGAN LOS PROCESOS
	 */
	private void comprobarTiempo() {
		minTiempo = listaProcesos.get(0); //minimo tiempo siempre va a ser el que esta en la posicion 0
		
		//comprobar orden de llegada
		for (int i=1; i<listaProcesos.size(); i++) {
			if (listaProcesos.get(i).getTiempo_de_llegada() < ciclos) {
				minTiempo = listaProcesos.get(i);
			}
		}
		
		
	}

}
