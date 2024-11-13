package com.carmen.me;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	//estado del fichero
	private static final String FICHERO = "data.txt";
	private static final String FICHERO2 = "data2.txt";
	private static final String FICHERO3 = "data3.dat";
	static ArrayList<Empleado> arrayEmpleado = new ArrayList<Empleado>();
	
	public static void main(String args []) {
		crearArrayList();
		toArrayEmpleados();
		toArrayEmpleadosInverso();
		leer_Empleados(FICHERO);
		leer_Empleados_b(FICHERO3);
		
	}
	
	private static void crearArrayList() {
		//leer fichero
		BufferedReader lector;
		String linea;
		try {
			lector = new BufferedReader(new FileReader(FICHERO));
			lector.readLine();
			while((linea = lector.readLine()) != null) { //mientras no sea nulo sigue
				Empleado nuevoEmpleado = new Empleado(linea);
				//crear array (control espacio)
				
				arrayEmpleado.add(nuevoEmpleado); //añadir información nuevoEmpleado al array
			}
			lector.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void toArrayEmpleados() {
		BufferedWriter escritor;
		try {
			escritor = new BufferedWriter(new FileWriter(FICHERO2));
			for(int i=0; i<arrayEmpleado.size(); i++) {
				escritor.write(arrayEmpleado.get(i).toString());
				escritor.newLine();
			}
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private static void toArrayEmpleadosInverso() {
		ObjectOutputStream escritor;
		Collections.reverse(arrayEmpleado); //leer del ultimo al primero
		try {
			escritor = new ObjectOutputStream(new FileOutputStream(FICHERO3));
			escritor.writeObject(arrayEmpleado);
			escritor.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void  leer_Empleados(String archivo) {
		BufferedReader lector;
		String linea;
		try {
			lector = new BufferedReader(new FileReader(archivo));
			lector.readLine();
			while((linea = lector.readLine()) != null) {
				Empleado nuevoEmpleado = new Empleado(linea);
				System.out.println(nuevoEmpleado.toString());
			}
			lector.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void leer_Empleados_b(String archivo) {
		ObjectInputStream lector;
		try {
			lector = new ObjectInputStream(new FileInputStream(archivo));
			ArrayList<Empleado> nuevoArrayEmpleado=(ArrayList<Empleado>) lector.readObject();
			for (Empleado empleado : nuevoArrayEmpleado) {
                System.out.println(empleado);
            }
			lector.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

} 
		
