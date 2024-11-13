package com.carmen.me;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;

public class Main {
	
	private static final String CSV = "peliculas.csv";
	private static final String CARPETA = "mispeliculas";
	private static final String RUTA = "C:\\Users\\Usuario\\Desktop\\instituto\\2DAM\\...ECLIPSE\\";
	

	public static void main(String[] args) {
		crearFichero();
		leerCarpeta();
		
		
	}


	private static void crearFichero() {
		File fichero = new File(RUTA + CSV); //declarar archivo
		
		try {
			if(!fichero.exists()) {
				fichero.createNewFile(); //crear archivo si no existe (try catch)
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	
	private static void leerCarpeta() {
		File carpeta = new File(RUTA + CARPETA); //declarar carpeta
		
		if (!carpeta.exists()) { //si la carpeta no existe entonces crear carpeta
			carpeta.mkdir();
		} else { //si la carpeta existe entonces:
			File[] listaCarpetas = carpeta.listFiles(); //listar carpetas dentro de "mispeliculas"
			
			for(int i = 0; i < listaCarpetas.length;i++) { //bucle for para poder imprimir por pantalla todas las carpetas
				System.out.println(listaCarpetas[i].getName()); //imprimir por pantalla el nombre de las carpetas
				File[] listaArchivos = listaCarpetas[i].listFiles(); //listar archivos dentro de las carpetas 
				
				for(int j = 0; j < listaArchivos.length;j++) {
					//los archivos hay que separarlos
					
					/*
					 * String nombrePelicula = listaArchivos[j].getName();
					 * String[] nombreSeparado = nombrePelicula.split("\\(");
					 * String[] nombreSeparado2 = nombrePelicula.split("\\)");
					 * String[] nombreSeparado3 = nombrePelicula.split("\\.");
					 * System.out.println();
					 */
					
					Pelicula pelicula = new Pelicula(); 
					
		            try {
						String[] peliculaCortada = listaArchivos[j].getName().split("\\(");
						pelicula.setTitulo(peliculaCortada[0]);
						peliculaCortada = peliculaCortada[1].split("\\)");
						pelicula.setAnio(peliculaCortada[0]);
						peliculaCortada = peliculaCortada[1].split("\\.");
						pelicula.setCalidad(peliculaCortada[0]);
						pelicula.setFormato(peliculaCortada[1]);
						
						BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA + CSV, true));
						System.out.println(pelicula.toString());
						bw.write(pelicula.toString());
						bw.newLine();
						bw.close();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println();
			}

		}
		
	}

}