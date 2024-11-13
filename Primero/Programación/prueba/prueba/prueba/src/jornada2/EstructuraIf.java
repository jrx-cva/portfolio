package jornada2;

import java.util.Scanner;

public class EstructuraIf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //entrada al sistema
		
		/*pide edad*/
		System.out.println("¿Cuál es tu edad?");
		int edadCliente = sc.nextInt();
		
		if (edadCliente > 17) { 
			System.out.println("Bienvenido a la discoteca");
			
		}else if (edadCliente >= 15) { //else anidado.
			System.out.println("A beber fanta");
			
		}else if (edadCliente >= 12) { //otro else anidado.
			System.out.println("A beber agua");
			
		}else {
			System.out.println("Vete alv");	
		}
		
		sc.close();
	}

}
