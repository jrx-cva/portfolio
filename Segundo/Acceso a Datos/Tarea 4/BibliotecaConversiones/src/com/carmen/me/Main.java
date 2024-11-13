package com.carmen.me;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	private static File file = new File("C:\\Users\\cva\\Desktop\\eclipseWorkspace\\BibliotecaConversiones.csv");
	private static File file2 = new File("C:\\Users\\cva\\Desktop\\eclipseWorkspace\\BibliotecaConversiones.dat");
	private static File fileOrdenado = new File("C:\\Users\\cva\\Desktop\\eclipseWorkspace\\BibliotecaConversionesOrdenado.csv");
	private static File fileOrdenado2 = new File("C:\\Users\\cva\\Desktop\\eclipseWorkspace\\BibliotecaConversionesOrdenado.dat");
	private static File fileOrdenado3 = new File("C:\\Users\\cva\\Desktop\\eclipseWorkspace\\BibliotecaConversionesOrdenadoCSV.csv");
	
	
	public static void main(String[] args) {
		//Fichero_CSV_To_Binario(file);
		//Fichero_Binario_To_CSV(file2);
		//Ordenar_Archivo_CSV(file);
		Ordenar_Archivo_Binario(file2);
	}
	
	
	public static void Fichero_CSV_To_Binario(File file) {
		FileOutputStream archivo;
		try {
			archivo = new FileOutputStream(fileOrdenado2);
			ObjectOutputStream os;
			try {
				os = new ObjectOutputStream(archivo);
				os.writeObject(file);  
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Fichero_Binario_To_CSV(File file) {

		try {
			FileInputStream archivo = new FileInputStream(file);
			ObjectInputStream entrada = new ObjectInputStream(archivo);
			File f = (File) entrada.readObject();
			entrada.close();
			archivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void Ordenar_Archivo_CSV(File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String linea;
			ArrayList<String> archivo = new ArrayList<>();
			while ((linea = br.readLine()) != null) {
				//mientras haya siguiente linea

				archivo.add(linea);
				
			}
			Collections.sort(archivo, String.CASE_INSENSITIVE_ORDER);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOrdenado, true));
			for(String s:archivo) {
				bw.write(s);
				bw.newLine();
			}
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Ordenar_Archivo_Binario(File file) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(file2));
			String linea;
			ArrayList<String> archivo = new ArrayList<>();
			while ((linea = br.readLine()) != null) {
				//mientras haya siguiente linea
				archivo.add(linea);
				
			}
			Collections.sort(archivo, String.CASE_INSENSITIVE_ORDER);
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOrdenado2, true));
			for(String s:archivo) {
				bw.write(s);
				bw.newLine();
			}
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Fichero_Binario_To_CSV_Ordenado() {

		try {		
			FileInputStream archivo = new FileInputStream(file);
		    ObjectInputStream entrada = new ObjectInputStream(archivo);
			File f = (File) entrada.readObject();
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String linea;
			ArrayList<String> listaLineas = new ArrayList<>();
			while((linea = br.readLine()) != null) {
				//crear lista, meter las lineas y despues ordenarlo
				listaLineas.add(linea);
			}
			
			Collections.sort(listaLineas);
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileOrdenado3, true));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
