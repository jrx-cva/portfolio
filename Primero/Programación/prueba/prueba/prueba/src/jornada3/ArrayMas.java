package jornada3;

import java.util.Scanner;

public class ArrayMas {
	public static void main(String[] args) {
		
		String[] personas = new String[] {"Carmen","Ying","Carlos","Miguel","Kike","Adrian","Asier"};

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre de personas");
		
		
		
		for (String nombreGrupo : personas) {
			System.out.println(nombreGrupo);
			
		}
		
		System.out.println("Busque un nombre: ");
		
		String search = sc.nextLine();
		search = search.toLowerCase();		
		
		for (String nombreGrupo : personas) {
			if (nombreGrupo.toLowerCase().contains(search)) {
				System.out.println("Persona encontrada: " + nombreGrupo);
			}
			
			
			
		}
		
		sc.close();
	}

}
