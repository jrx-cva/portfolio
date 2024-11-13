package jornada3;

import java.util.Arrays;

public class ArreglosOrdenamientos {
	
	public static void main(String[] args) {
		
		int[] edades = new int[8]; //crear array con tamaño 8.
		
		//carga de datos
		edades[0] = 10;
		edades[1] = 19;
		edades[2] = 20;
		edades[3] = 15;
		edades[4] = 22;
		edades[5] = 45;
		edades[6] = 24;
		edades[7] = 67;
		
		for (int i = 0; i < edades.length; i++) { 
			for (int j = 0; j < edades.length; j++) { 
				
				if (edades[i] > edades[j]) {
					//Intercambio 
					int auxiliar = edades[i];
					edades[i] = edades[j];
					edades[j] = auxiliar;
					
					
				}
				
			}
		
			
		}
		//Arrays.sort(edades); //ordenar arrays descendentemente
			
			for (int edad: edades) {
				System.out.println("edad: " + edad);
			}
	}
	
	

}
