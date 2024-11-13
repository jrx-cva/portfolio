package jornada3;

import java.util.Scanner;

public class ArrayBidimensional {
	
	public static void main(String[] args) {
		
		
		boolean[][] filas = new boolean[4][6]; //array de booleanos
		
		Scanner sc = new Scanner (System.in);
		
		
		/*RESERVAR SITIO*/
		System.out.println("Ingresar fila: ");
		int fila = sc.nextInt(); //busca numero hasta que encuentre el siguiente int.
		
		System.out.println("Ingresar butaca: ");
		int butaca = sc.nextInt();
		
		
		filas[fila][butaca] = true;
		
		
		
		for (int i = 0; i < filas.length; i++) {
			System.out.println("________________________");
			
			for (int j = 0; j < filas[i].length; j++) {

				String reservada = filas[i][j] ? "X" : "_"; //si es true= "x", si es false= ""
				
				System.out.print("["+reservada+"]");
				System.out.print("|");
			}
			
			System.out.println();
		}
		
	}

}
