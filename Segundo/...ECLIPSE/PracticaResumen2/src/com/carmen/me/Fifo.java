package com.carmen.me;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Fifo {
	
	//imprimir procesos segun orden de llegada
	ArrayList<Procesos> listaProcesos = new ArrayList();
	int ciclos = 1;
	
	/**
	 * CONSTRUCTOR FIFO
	 * @param listaProcesos
	 */
	public Fifo(ArrayList<Procesos> listaProcesos) {
		this.listaProcesos = listaProcesos;
	}
	
	/**
	 * MÉTODO DEL ALGORITMO DEL FIFO Y CALCULAR SU RENDIMIENTO
	 */
	public void simular() {
		float indice = 0;
		float rendimiento0 = 0;
		float rendimiento = 0;
		
		//recorrer lista e imprimir uno a uno
		for (int i=0; i<listaProcesos.size(); i++) {
			for (int f=0; f<listaProcesos.get(i).getRafagas(); f++){
				
				listaProcesos.get(i).restar();
				if (listaProcesos.get(i).getRafagaPendiente() == 0) {
					indice = (ciclos-listaProcesos.get(i).getTiempo_de_llegada())/listaProcesos.get(i).getRafagas(); //calcular el indice
					rendimiento0 = rendimiento0 + indice;   //calcular la suma 
					System.out.println(listaProcesos.get(i).terminado(ciclos));
				} else {
					System.out.println(listaProcesos.get(i).mostrarLinea(ciclos));
				}
				ciclos++;
			}	
		}
		
		//calcular rendimiento e imprimir por pantalla
		rendimiento = rendimiento0/listaProcesos.size();
		System.out.println("rendimiento: " + rendimiento);
	}

}
