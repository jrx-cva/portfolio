package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	
	public static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/bd_parte2";
	public static final String USUARIO = "root";
	public static final String CLAVE = "1234";
	
	public static Connection conectar() {
		Connection conexion = null;
		
		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conexión OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	public static void main(String[] args) {
		
		
	}

	

}
