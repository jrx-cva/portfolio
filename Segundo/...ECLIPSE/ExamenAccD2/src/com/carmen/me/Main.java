package com.carmen.me;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import clasesHechas.Productos;

import com.carmen.me.ObtenerProductos;


public class Main {
	private static final String FICHERO = "lista.txt";
	static ArrayList<Productos> arrayProductos = new ArrayList<Productos>();
	
	public static void main (String[] args) {
		almacenarProductosEnFichero();
		
	}
	
	public static void almacenarProductosEnFichero() {
		//public void actionPerformed(ActionEvent e) {
		obtener();
		crearFichero();
		pasar_a_fichero();
	}


	private static void obtener() {
		
		System.out.println("Digame el identificador de categoría: ");
		String entradaTeclado = "";
		Scanner entradaScanner = new Scanner(System.in);
		entradaTeclado = entradaScanner.nextLine (); //Invocamos un método sobre un objeto Scanner
		//convertir la entrada del teclado en int
		int codINT = Integer.parseInt(entradaTeclado);
				
		//instanciar clase gestionUsuario
		ObtenerProductos productos = new ObtenerProductos();
		
		Productos pro2 = new Productos();
		pro2.setCategoriaId(codINT);
		
		Productos pro = productos.obtenerProductos(pro2);
		
	}
	
	private static void crearFichero() {
		// TODO Auto-generated method stub
		File fichero = new File(FICHERO); //declarar archivo
		
		try {
			if(!fichero.exists()) {
				fichero.createNewFile(); //crear archivo si no existe (try catch)
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private static void pasar_a_fichero() {
		/*BufferedWriter escritor;
		try {
			escritor = new BufferedWriter(new FileWriter(FICHERO));
			for(int i=0; i<arrayProductos.size(); i++) {
				escritor.write(arrayProductos.get(i).toString());
				escritor.newLine();
			}
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	
}
