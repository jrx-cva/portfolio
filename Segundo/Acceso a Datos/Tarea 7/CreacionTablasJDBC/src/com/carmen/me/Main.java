package com.carmen.me;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import bbdd.Bbdd;
import bbdd.ProfesorDao;

public class Main {
	static Bbdd bbdd = new Bbdd();
	static ProfesorDao profesorDao = new ProfesorDao();
	
	private static final String FICHERO = "bbdd.txt";
	
	public static void main(String[] args) throws IOException {
		bbdd.conectar();
		bbdd.inicializar();
		lector();
		
	}

	
	public static void lector() throws IOException {
		
        BufferedReader lector = new BufferedReader(new FileReader(FICHERO));
        lector.readLine();

        String linea;

        while ((linea = lector.readLine()) != null) {
            String[] Trozo;
            Trozo = linea.split(";");
            if (Trozo[0].equals("Profesor")) {
            	profesorDao.añadirProfesor(Trozo[1], Trozo[2], Trozo[3], Trozo[4]);
            } else {
            	while(Trozo[0].equals("Asignatura")) {
            		profesorDao.añadirAsignatura(Trozo[1], Trozo[2], ProfesorDao.nuevaId);
            	}
            	bbdd.com();
            	

            	}
            }
            
    } 
}
