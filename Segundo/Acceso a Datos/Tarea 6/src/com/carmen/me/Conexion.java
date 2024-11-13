package com.carmen.me;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
    private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/accesodatoscarmen?useSSL=false";
    private static final String USUARIO = "root";
    private static final String CLAVE = "123abc";
	
	public Connection conectar() {
        Connection conexion = null;
        
        try {
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Conexi�n OK");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error en la conexi�n");
            e.printStackTrace();
        }
        
        return conexion;
    }

}