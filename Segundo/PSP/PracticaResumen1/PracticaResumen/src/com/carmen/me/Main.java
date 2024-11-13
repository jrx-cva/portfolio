package com.carmen.me;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();
	}

	private static void menu() {
		//MENU DE CONSOLA
		Integer numero; //para pedirlo por pantalla
		//distintas funcionalidades que elegira el usuario:
		System.out.println("1. Crear una carpeta dada una ruta y el nombre");
		System.out.println("2. Crear un fichero dada la ruta y el nombre");
		System.out.println("3. Listar todas las interfaces de red de nuestro ordenador");
		System.out.println("4. Mostrar la IP del ordenador dado el nombre de la interfaz de red");
		System.out.println("5. Mostrar la direcci�n MAC dado el nombre de la interfaz de red");
		System.out.println("6. Comprobar conectividad con internet");
		System.out.println("7. Salir");
		
		numero = Integer.parseInt(sc.nextLine()); //pide por pantalla numero
		
		//para hacer las funcionalidades:
		switch(numero) {
			case 1:
				creaCarpeta();
				break;
			case 2:
				creaFichero();
				break;
			case 3:
				listarInterfaces();
				break;
			case 4:
				//verIP();
				break;
			case 5:
				//verMAC();
				break;
			case 6:
				comprobarConectividad();
				break;
			case 7:
				System.out.println("SALIR");
				System.exit(-1);
				break;
		}
	}
	
	
	/**
	* CASE 1
	*/
	private static void creaCarpeta() {
		try {
			ProcessBuilder pb = new ProcessBuilder();
			
			String direccion,directorio;
			
			//NOMBRE DE LA RUTA DONDE VA A CREARSE LA CARPETA
			System.out.println("Nombre de la ruta donde vas a crear la carpeta: ");
			direccion = sc.nextLine();
			
			if(!direccion.endsWith("\\")) {
				direccion.concat("\\");
			}
			
			//NOMBRE DEL DIRECTORIO
			System.out.println("Nombre de la carpeta que vas a crear: ");
			directorio = sc.nextLine();
			
			File dir = new File(direccion + "\\" + directorio);
			
			if(!dir.exists()) { 	//comprueba que el directorio no exista para poder crearlo
				pb.command("cmd.exe","/c","mkdir " + direccion + "\\" + directorio); //comando para crearlo
				pb.start();															 //empieza a crearlo
				System.out.println("El directorio se ha creado con éxito");
			} else {				//si el directorio exite muestra un error
			System.out.println("ERROR: El directorio ya existe");
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("La ruta que se ha introducido no existe");
		} catch (IOException a) {
			a.printStackTrace();
		}
	}
	
	
	/**
	 * CASE 2
	*/
	private static void creaFichero() {
		try {
			ProcessBuilder pb = new ProcessBuilder();
			String direccion,archivo;
			
			//NOMBRE DE LA DIRECCION DONDE SE VA A CREAR EL FICHERO
			System.out.println("Nombre de la carpeta donde vas a crear el fichero: ");
			direccion = sc.nextLine();
			
			if(!direccion.endsWith("\\")) {
				direccion.concat("\\");
			}
			
			//	
			System.out.println("Nombre del archivo que vas a crear: ");
			archivo = sc.nextLine();
			
			File arc = new File(direccion + "\\" + archivo);
			
			if(!arc.exists()) {
				pb.command("cmd.exe","/c","type nul > " + direccion + "\\" + archivo);
				pb.start();
				System.out.println("El directorio se ha creado con exito");
			} else {
				System.out.println("ERROR: El directorio ya existe");
			}
			
		} catch (NoSuchElementException e) {
			System.out.println("La ruta que se ha introducido no existe");
		} catch (IOException a) {
			a.printStackTrace();
		}
	}
	
	
	/**
	 * CASE 3
	*/
	private static void listarInterfaces() {
			try {
				ProcessBuilder pb = new ProcessBuilder();
				
				pb.command("cmd.exe", "/c", "wmic nic get NetConnectionID");  //comando para listar las interfaces de red

				Process process = pb.start();  //comienza el proceso
				
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				String interfaz;
				
				while((interfaz = bufferedReader.readLine()) != null) { //bucle para leer la salida del comando linea a linea
						System.out.println(interfaz);
				}
				bufferedReader.close(); //cierra el buffer
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	/**
	* CASE 6
	*/		
	private static void comprobarConectividad() {
		try {
			ProcessBuilder pb = new ProcessBuilder();
			pb.command("cmd.exe", "/c", "ping 8.8.8.8"); //comando para ccomprobar conectividad con internet
			ArrayList<String> listaLineas = new ArrayList<>(); //se crea una arraylist para almacenar la listaLineas
			
			Process process;
			String linea;
			process = pb.start(); //comienza proceso
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			while((linea = bufferedReader.readLine()) != null) { //cuando la linea no este vacia entonces añadir esa linea al arraylist
				listaLineas.add(linea);
			}
			bufferedReader.close(); //cierra el buffer
			
			for(String lineaN : listaLineas) { //este for se ejecutará tantas veces como lineas haya en el array listaLineas
				
				if(lineaN.contains("Haciendo")) {
					System.out.println("El internet funciona");
				}
				else if(lineaN.contains("No pudo")) {
				System.out.println("El internet no funciona");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}