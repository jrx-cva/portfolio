package jornada2;

import java.util.Scanner;

public class InputUsuario { 
	
	//Clase que pide por pantalla nombre y edad y mira a ver si es mayor de edad o no.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //entrada al sistema
		
		/*pide nombre*/
		System.out.println("¿Cuál es tu nombre?");
		//sc.nextLine(); //sirve para escribir strings en pantalla
		String datoUsuario = sc.nextLine();
	
		/*pide edad*/
		System.out.println("Ingrese su edad:");
		int edadUsuario = sc.nextInt(); 
		
		/*mira a ver si es mayor de edad*/
		boolean esMayorEdad = edadUsuario > 17;
		
		
		sc.close();
		System.out.println("Hola " + datoUsuario + ". Usted tiene " + edadUsuario + " años."); //te devuelve el dato escrito en pantalla
		System.out.println("¿Puedes comprar alcohol legalmente?: " + esMayorEdad);
	}

}
