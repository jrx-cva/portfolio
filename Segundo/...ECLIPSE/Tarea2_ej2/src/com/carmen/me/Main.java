package com.carmen.me;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	private static final String FICHERO = "listado centros.txt";
	static ArrayList<Centros> arrayCentros = new ArrayList<Centros>();
	public static void main(String [] args) {
		crearArrayList();
		toArrayCentros();
		
	}
	
	private static void crearArrayList() {
		BufferedReader lector;
		String linea;
		try {
			lector = new BufferedReader(new FileReader(FICHERO));
			while((linea = lector.readLine()) != null) {
				Centros nuevoCentro = new Centros(linea);
				arrayCentros.add(nuevoCentro);
			}
			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void toArrayCentros() {
		BufferedWriter escritor;
		try {
			escritor = new BufferedWriter(new FileWriter(FICHERO));
			for(int i=0; i<arrayCentros.size(); i++) {
				escritor.write(arrayCentros.get(i).toString());
				escritor.newLine();
			}
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
