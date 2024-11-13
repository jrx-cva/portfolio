package jornada3;

public class Enumeracion {
	
	public static void main(String[] args) {
		
		int numero = 22; 
		Estaciones[] estacion = Estaciones.values();
		
		//System.out.println(estacion);
		
		for (Estaciones est : estacion) {
			
			System.out.println(est);
			
		}
		
	}

}
