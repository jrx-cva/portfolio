package jornada1;

public class VariablesJava {
	
	public static void main(String[] args) {
		
		//TIPOS PRIMITIVAS
		
			/*NUMEROS*/
		
				//NUMEROS ENTEROS
					//ordenado menor a mayor
					byte numero = 1; //(8 bits) 127 el último número que permite (2^(8-1))
					short numerob = 2; //(12 bits)
					int precioTelevision = 10;  //más recomendada  (32 bits)
					long numerolargo = 10; //(64 bits)
				
				
				//NUMEROS FLOTANTES
					float flotanteA = 1.2f; //si es flotante necesita la f del 1.2f
					double flotanteB = 1.34343444d;
				
				
			/*TEXTO*/
				char c = 'F';
				String texto = "Cadena de texto";
				
			/*BOOLEANOS*/
				boolean cursoEnEscuela = false;
				boolean esMayorDeEdad = true;
			
		
		System.out.println(precioTelevision); /*sin comillas lo que imprime es la variable no el texto "precioTelevision"*/
		
		System.out.println(esMayorDeEdad);
		
		
		
		
		
	}

}
