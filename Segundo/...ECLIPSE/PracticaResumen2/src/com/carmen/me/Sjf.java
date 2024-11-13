package com.carmen.me;

import java.util.ArrayList;

public class Sjf {
	ArrayList<Procesos> listaProcesos = new ArrayList();
	int ciclos = 1;
	int cantidad_de_procesos;
	Procesos minRafaga;
	
	/**
	 * CONSTRUCTOR SJF
	 * @param listaProcesos
	 */
	public Sjf(ArrayList<Procesos> listaProcesos) {
		this.listaProcesos = listaProcesos;
		cantidad_de_procesos = listaProcesos.size();
	}
	
	/**
	 * METODO DEL ALGORITMO DE SJF Y SU RENDIMIENTO
	 */
	public void simular() {
		float indice = 0;
		float rendimiento0 = 0;
		float rendimiento = 0;
		
		//recorrer la lista e imprimirlos según tiempo de servicio más corto
		while (!listaProcesos.isEmpty()) {
			comprobarRafaga();
			for (int i=0; i < minRafaga.getRafagas(); i++){
				minRafaga.restar();
				
				if (minRafaga.getRafagaPendiente() == 0) {
					indice = (ciclos-minRafaga.getTiempo_de_llegada())/minRafaga.getRafagas(); //calcular el indice
					rendimiento0 = rendimiento0 + indice; //calcular la suma
					System.out.println(minRafaga.terminado(ciclos));
				} else {
					System.out.println(minRafaga.mostrarLinea(ciclos));
				}
				ciclos++;
			}	
			listaProcesos.remove(minRafaga);
		}
		
		//calcular rendimiento final
		rendimiento = rendimiento0/cantidad_de_procesos;
		System.out.println("rendimiento: " + rendimiento);
	}
	
	//private void tiempo() {
	//	for (int i=0; i<listaProcesos.size(); i++) { 
	//		if (listaProcesos.get(i).getTiempo_de_llegada() < ciclos) {
	//		}
	//	}
	//}
	
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
}
