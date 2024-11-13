package jornada2;

import java.util.Scanner;

public class EstructuraSwitch {
	
	public static void main(String[] args) {
		
		Scanner sc; //entrada al sistema
		sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		
		
		while (opcion != 4) {
			
			System.out.println("Bienvenidos al sistema");
			System.out.println("-1. Denunciar");
			System.out.println("1. ABM Usuarios");
			System.out.println("2. ABM Clientes");
			System.out.println("3. ABM Operaciones");
			System.out.println("4. Salir");
			System.out.println("________________");
			System.out.println("Ingrese una opción: ");
			
			
			/*SWITCH INTEGER*/
			switch (opcion) {

			case -1:
				System.out.println("Denunciando");
				break;

			case 1:
				System.out.println("Bienvenidos al ABM usuario");
				break;

			case 2:
				System.out.println("Bienvenidos al ABM clientes");
				break;

			case 3:
				System.out.println("Bienvenidos al ABM operaciones");
				break;

			case 4:
				System.out.println("Saliendo del sistema");
				break;

			default:
				System.out.println("ERROR");
				break; //este no hace alta ya que es el último caso.

			}
			
			
			/** asi se haria con un if pero es peor opción
			if (opcion == 1) {
				System.out.println("Bienvenidos al ABM de Usuario");
			}
			*/
			
			
			opcion++;
		}
		
		/**SWITCH STRING
		 * System.out.println("¿Qué es lo que quiere?: ");
		 * String tipoEntrada = sc.nextLine();
		 * switch (tipoEntrada) {
		 * case "CON_CERVEZA": System.out.println("Puede pedir una cerveza");
			break;
		 * case "CON_VINO": System.out.println("Puede pedir un vino");
			break;
			
		case "CON_TRAGO": System.out.println("Puede pedir un trago");
			break;
			
		default: System.out.println("ERROR");	
			break;
		 * 
		 * 
		 */

		sc.close(); //cerrar el sistema.
	}
		
		
}


