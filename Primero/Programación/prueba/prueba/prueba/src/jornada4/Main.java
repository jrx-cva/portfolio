package jornada4;

import java.util.Scanner;

public class Main { //clase operativa
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Pais miPais = new Pais() ; //Pais (clase) miPais (objeto);
		
		String mensaje = miPais.getInfoCovid();
		
		
		
		
		
		System.out.println("Ingresar nombre:");
		//miPais.nombre = sc.nextLine();
		miPais.setNombre(sc.nextLine());
		
		System.out.println("Ingresar bandera:");
		//miPais.bandera = sc.nextLine();
		miPais.setBandera(sc.nextLine());
		
		System.out.println("Ingresar idioma:");
		//miPais.idioma = sc.nextLine();
		miPais.setIdioma(sc.nextLine());
		
		System.out.println("Ingresar poblacion:");
		//miPais.poblacion = sc.nextInt();
		miPais.setPoblacion(sc.nextInt());
		
		//miPais.continente = Continente.EUROPA; //aquí uso el enumerador que he creado
		miPais.setContinente(Continente.EUROPA); 
		
		
		
		
		/*ARRAY CIUDADES IMPORTANTES*/
		//asignar valores al objeto capital
		Ciudad capital1 = new Ciudad(); 
		capital1.setNombre("Madrid");
		capital1.setPatrono("San Isidro");
		capital1.setPresupuesto(1000000000);
		
		Ciudad capital2 = new Ciudad(); 
		capital2.setNombre("Barcelona");
		capital2.setPatrono("San Jordi");
		capital2.setPresupuesto(2000000000);
		
		Ciudad capital3 = new Ciudad(); 
		capital3.setNombre("Valencia");
		capital3.setPatrono("Virgen de los desamparados");
		capital3.setPresupuesto(50000000);
		
		
		//crear array de ciudades
		Ciudad[] ciudades = new Ciudad[3];
		ciudades[0] = capital1;
		ciudades[1] = capital2;
		ciudades[2] = capital3;
		
		miPais.setCiudadesImportantes(ciudades);
		
		
		
		
		//guardar capital en pais
		miPais.setCapital(capital1);
		
		
		
		
		/*IMPRIMIR EN PANTALLA*/
		//System.out.println("En " + miPais.nombre + " se habla " + miPais.idioma);
		
		/***
		 * Otra forma:
		 * String pais = miPais.getNombre();
		 * System.out.println("Pais: " + pais);
		 * 
		 */
		System.out.println("Pais: " + miPais.getNombre());
		
		//control + shift + 2 + l
		Ciudad[] ciudadesImportantes = miPais.getCiudadesImportantes();
		
		for (Ciudad ciudad : ciudadesImportantes) {
			System.out.println(ciudad.getNombre());
			
		}
		
		
		
		
		sc.close();
		
		
	}

}
