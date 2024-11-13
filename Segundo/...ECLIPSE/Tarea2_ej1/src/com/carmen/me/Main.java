package com.carmen.me;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	private static final String FICHERO1 = "fichero1.txt";
	private static final String FICHERO2 = "fichero2.txt";
	public static void main (String [] args) {
		leerFichero(FICHERO1, FICHERO2);
	}
	
	private static void leerFichero(String fichero1, String fichero2) {
		//fichero1
		BufferedReader lector1;
		String linea1;
		ArrayList<String> arrayFichero1 = new ArrayList<String>();
		try {
			lector1 = new BufferedReader(new FileReader(fichero1));
			while((linea1 = lector1.readLine()) != null) {
				
				arrayFichero1.add(linea1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//fichero2
		BufferedReader lector2;
		String linea2;
		ArrayList<String> arrayFichero2 = new ArrayList<String>();
		try {
			lector2 = new BufferedReader(new FileReader(fichero2));
			while(( linea2 = lector2.readLine()) != null) {
				
				arrayFichero2.add(linea2);
			}
			Collections.reverse(arrayFichero2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//recorrer la lista fichero1
		if(arrayFichero1.size() > arrayFichero2.size()) {
			for(int i=0; i<arrayFichero1.size(); i++) {
				//numeros pares= fichero1     numeros impares= fichero2
				if(i%2==0 & i<arrayFichero1.size()) {
					System.out.print(arrayFichero1.get(i)+ " ");
				}else if(i%2!=0 & i<arrayFichero2.size()){
					System.out.print(arrayFichero2.get(i)+ " ");
				}
			}
		}else {
			for(int i=0; i<arrayFichero2.size(); i++) {
				//numeros pares= fichero1     numeros impares= fichero2
				if(i%2==0 & i<arrayFichero1.size()) {
					System.out.print(arrayFichero1.get(i)+ " ");
				}else if(i%2!=0 & i<arrayFichero2.size()){
					System.out.print(arrayFichero2.get(i)+ " ");
				}
			}
		}
		System.out.print(":)");
	}
	
	

}
