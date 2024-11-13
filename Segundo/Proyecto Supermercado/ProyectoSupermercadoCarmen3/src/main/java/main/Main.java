package main;

import bbdd.Conexion;
import bbdd.ProfesorDao;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //implementamos clases Conexion y ProfesorDao
    static Conexion conexion = new Conexion();
    static ProfesorDao profesorDao = new ProfesorDao();

    //fichero de base de datos
    private static final String FICHERO = "bbdd.txt";

    public static void main(String[] args) throws IOException {

        //conectamos
        conexion.conectar();
        //inicializamos
        conexion.inicializar();
        //leemos
        lector();

    }


    public static void lector() throws IOException {

        //lector bufferedReader del fichero
        BufferedReader lector = new BufferedReader(new FileReader(FICHERO));
        //siguiente linea
        lector.readLine();
        //creamos linea
        String linea;

        //cuando haya lineas que leer seguimos
        while ((linea = lector.readLine()) != null) {
            //
            String[] Trozo;
            //spliteamos la variable trozo
            Trozo = linea.split(";");

            //si la primera linea es profesor
            if (Trozo[0].equalsIgnoreCase("Profesor")) {
                profesorDao.anadirProfesor(Trozo[1], Trozo[2], Trozo[3], Trozo[4]);
            } else {
                while (Trozo[0].equals("Asignatura")) {
                    profesorDao.anadirAsignatura(Trozo[1], Trozo[2], ProfesorDao.nuevaId);
                }
                conexion.commit();


            }
        }

    }
}
