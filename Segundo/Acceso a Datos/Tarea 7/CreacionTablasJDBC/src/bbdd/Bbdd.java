package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Bbdd {
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/prueba2";
	private static final String USUARIO = "root";
	private static final String CLAVE = "1234";
	protected static Connection conexion;
	
	public static void main(String[] args) {
		
	}
	
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
	
	public static void inicializar() {
		try {
	    	conexion.setAutoCommit(false);
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	    
	}

	public static void finalizar() {
	    try {
			conexion.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void com() {
        try {
			conexion.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conexion.rollback();
				System.out.println("El commit ha fallado");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
    }
	 

	
	
}