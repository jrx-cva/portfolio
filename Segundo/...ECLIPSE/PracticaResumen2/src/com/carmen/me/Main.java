package com.carmen.me;

import java.util.ArrayList;

public class Main {
	
	static ArrayList<Procesos> listaProcesos = new ArrayList();
	static ArrayList<Procesos> listaProcesos2 = new ArrayList();
	static ArrayList<Procesos> listaProcesos3 = new ArrayList();
	static ArrayList<Procesos> listaProcesos4 = new ArrayList();
	
	/**
	 * MAIN PRINCIPAL 
	 * @param args
	 */
	public static void main (String [] args) {
		listaProcesos.add(new Procesos("A", 0, 5));
		listaProcesos.add(new Procesos("B", 2, 4));
		listaProcesos.add(new Procesos("C", 3, 3));
		listaProcesos.add(new Procesos("D", 5, 2));
		listaProcesos.add(new Procesos("E", 6, 3));
		
		System.out.println("Método FIFO:");
		new Fifo(listaProcesos).simular();
		
		listaProcesos2.add(new Procesos("A", 0, 5));
		listaProcesos2.add(new Procesos("B", 2, 4));
		listaProcesos2.add(new Procesos("C", 3, 3));
		listaProcesos2.add(new Procesos("D", 5, 2));
		listaProcesos2.add(new Procesos("E", 6, 3));
		
		System.out.println("Método SJF:");
		new Sjf(listaProcesos2).simular() ;
		
		//SEGUIR 
		listaProcesos3.add(new Procesos("A", 0, 5));
		listaProcesos3.add(new Procesos("B", 2, 4));
		listaProcesos3.add(new Procesos("C", 3, 3));
		listaProcesos3.add(new Procesos("D", 5, 2));
		listaProcesos3.add(new Procesos("E", 6, 3));
		
		System.out.println("Método SRT:");
		//new Srt(listaProcesos3).simular() ;
		
		
		listaProcesos4.add(new Procesos("A", 0, 5));
		listaProcesos4.add(new Procesos("B", 2, 4));
		listaProcesos4.add(new Procesos("C", 3, 3));
		listaProcesos4.add(new Procesos("D", 5, 2));
		listaProcesos4.add(new Procesos("E", 6, 3));
		
		System.out.println("Método Round Robin:");
		//new RoundRobin(listaProcesos4).simular() ;

		
		
		
	}

}
