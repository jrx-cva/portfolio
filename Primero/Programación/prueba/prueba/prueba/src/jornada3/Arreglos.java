package jornada3;

public class Arreglos {
	public static void main(String[] args) {
		
		//int[] edades; //crear variable entera con array 
		
		int[] edades = new int[8]; //crear array con tamaño 8.
		
		
		//carga de datos
		edades[0] = 18;
		edades[1] = 19;
		edades[2] = 20;
		edades[3] = 21;
		edades[4] = 22;
		edades[5] = 23;
		edades[6] = 24;
		edades[7] = 25;
		
		
		/**
		 * //ejemplo que redimensiona un array
		 * ArrayList<Integer> numeros = new ArrayList<Integer>();
		 * numeros.add(2);
		 * numeros.add(345);
		 */
		
		
		
		
		System.out.println("dimensión del array: " + edades.length);
		
		
		
		int menor = 1000; //edad menor
		int mayor = -1000;
		float promedio = 0;
		
	
		for (int i = 0; i < edades.length; i++) { //fori
			
			if (edades[i] < menor) { //encontrar cual es la salida más pequeña.
				
				menor = edades[i];
				
			}	
				
			if (edades[i] > mayor) { //encontrar cual es la salida más grande.
				
				mayor = edades[i];
			}
			
			System.out.println(edades[i]); //imprime en pantalla la dimensión del array
			
			promedio += edades[i]; // promedio = promedio + edades[i].
			
		}
		
		System.out.println("El más joven tiene: " + menor +" años.");
		System.out.println("El más mayor tiene: " + mayor +" años.");
		
		//obtener promedio
		promedio = promedio / edades.length; 		
		System.out.println("El promedio es: " + promedio +" años.");
		
		
		int laCuartaEdad = edades[3]; //pide una edad determinada.
		System.out.println("La cuarta edad es: "+ laCuartaEdad+ " años.");
		
		
		
		
		/*FOR EACH (es como el for) */
		for (int edad : edades) {
			
			System.out.println(edad);
			
		}
	}

}
