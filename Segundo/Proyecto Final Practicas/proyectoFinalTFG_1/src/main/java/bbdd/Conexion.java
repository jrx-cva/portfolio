package bbdd;
import java.sql.*;

public class Conexion {

    //credenciales
    private static final String USER = "root";
    private static final String PASS = "1234";
    private static final String BD = "bbdd_proyecto_chat"; //base de datos

    private Connection conexion;
    private boolean error;

    /**
     * Método para conectarse a la base de datos
     */
    public Conexion() {
        String URL = "jdbc:mysql://127.0.0.1:3306/" + BD + "?serverTimezone=UTC";
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}