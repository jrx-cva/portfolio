import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDAO {

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bd_ejemplo?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String USUARIO = "root";
    private static final String CLAVE = "1234";
	protected static Connection conexion;
	protected static ResultSet rs;
	protected PreparedStatement st;
	static int auto_id;

    
    public void conectar() {
    	try {
            Class.forName(CONTROLADOR);
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Exito");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Error en la conexión");
            e.printStackTrace();
        }

    }
    public void inicializar() {
        try {
        	conexion.setAutoCommit(false);
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
	}
    
    public void añadirProfesor(String nif, String nombre, String especialidad, String telefono) {
    	try {

    	String queryProf = "Insert into profesor (IdProfesor,NIF_P,Nombre,Especialidad,Telefono) value (?,?,?,?,?)";
    	st = conexion.prepareStatement(queryProf, Statement.RETURN_GENERATED_KEYS);
    	st.setString(1, "Default");
    	st.setString(2, nif);
    	st.setString(3, nombre);
    	st.setString(4, especialidad);
    	st.setString(5, telefono);
    	st.executeUpdate();
    	ResultSet rs = st.getGeneratedKeys();
        rs.next();
        auto_id = rs.getInt(1);
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }
    }
    
    public void añadirAsignatura(String codasignatura, String nombre, int idprofesor) {
    	try {
    	String queryAsignatura = "Insert into asignatura (CodAsignatura,Nombre,IdProfesor) value (?,?,?)";
    	st = conexion.prepareStatement(queryAsignatura);
    	st.setString(1, codasignatura);
    	st.setString(2, nombre);
    	st.setInt(3, idprofesor);
    	st.executeUpdate();
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }
    }
    
    public void commitear() {
        try {
			conexion.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conexion.rollback();
				System.out.println("Algo ha salido mal en el commit");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
    }
    
    public void finalizar() {
        try {
			conexion.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
}

