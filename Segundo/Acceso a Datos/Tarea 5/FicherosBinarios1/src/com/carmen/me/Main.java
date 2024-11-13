package com.carmen.me;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	private static String ruta = "C:\\Users\\cva\\Desktop\\eclipseWorkspace\\empleados.dat";
	
	
	public static void main(String [] args) {
		File file = new File(ruta);
		guardarEmpleados(file);
		imprimirFicheroEmpleados(file);
		
	}
	
    public static void guardarEmpleados(File binario) {
    	ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(binario, true)); //true te deja incluir
		
    	if(!(binario.exists())) {
    		try {
				binario.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
        	Empleado empleado1 = new Empleado("Carmen", "Velasco Acosta");
        	Empleado empleado2 = new Empleado("Carlos","Larriba Criado", 20);
        	Empleado empleado3 = new Empleado("Ying", "Lin",20,1100);
        	

        	listaEmpleados.add(empleado1);
        	listaEmpleados.add(empleado2);
        	listaEmpleados.add(empleado3);
        	
        	for (Empleado e:listaEmpleados) {
        		try {
    				bw.write(e.getNombre() + ";" + e.getApellido() + ";" + e.getEdad() + ";" + e.getSalario());
    				bw.newLine();
    				
        		} catch (IOException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
        		}
        	}
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
    }
    
    
    private static void imprimirFicheroEmpleados(File binario) {
    	String linea;
    	
    	try {
			BufferedReader br = new BufferedReader(new FileReader(binario));
			
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    }
}
