package jornada2;

public class Bucle {
	public static void main(String[] args) {
		
		/*WHILE*/
		int contador = 0;//declaraci�n variable
		
		while (contador < 10) { //mientras sea menor que 10 continua.
			
			System.out.println("Iteraci�n " + contador);
			
			contador++; //incremento
			
		}
		
		
		/*DO WHILE*/
		do { //recorre al menos una vez el bucle
			System.out.println("Iteraci�n " + contador);
			
			contador++;
			
		} while (contador < 0);
		
		
		
		/*FOR*/
	/**
	 	* for (int contador = 0; contador<10; contador++) { //igual que el while
		*	System.out.println("Iteraci�n " + contador);
	*/	
	}

}
