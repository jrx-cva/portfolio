import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_ejemplo?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USUARIO = "root";
    private static final String CLAVE = "1234";
	protected static Connection conexion;
	private static ResultSet rs = null;
	static int idProfesor = 0;
	static String nif = "";
	static String especialidad = "";
	static String nombre = "";
	static String telefono = "";	
	static boolean nuevo = false;
	static boolean permiso;
	static PreparedStatement st;
	
	/*
	 * Preparamos la conexión a la base de datos, dados una url, usuario y nombre
	 */
	public static void conectar() {
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
	
	/*
	 * inicializamos el statement y generamos el result set
	 */
	public static void inicializar() {
        try {
        Statement stm = conexion.createStatement();
        rs = stm.executeQuery("SELECT * FROM profesor");
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
	}
	
	/*
	 * Generamos un comportamiento que coge el primer resultset
	 */
    public static void cargarPrimero() {
    	try {
                        
            rs.first();
            idProfesor 		= rs.getInt(1);
            nif 			= rs.getString(2);
            nombre 			= rs.getString(3);
            especialidad 	= rs.getString(4);
            telefono 		= rs.getString(5);
                
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
    }
    
    /*
	 * Generamos un comportamiento que coge el siguiente resultset
	 */
    public static void cargarSiguiente() {

        try {
            
            rs.next();
	            idProfesor 		= rs.getInt(1);
	            nif 			= rs.getString(2);
	            nombre 			= rs.getString(3);
	            especialidad 	= rs.getString(4);
	            telefono 		= rs.getString(5);
                
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
    }
    
    /*
	 * Generamos un comportamiento que coge el anterior resultset
	 */
    public static void cargarAnterior() {
        
        try {

            rs.previous();
	            idProfesor 		= rs.getInt(1);
	            nif 			= rs.getString(2);
	            nombre 			= rs.getString(3);
	            especialidad 	= rs.getString(4);
	            telefono 		= rs.getString(5);	
                
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
    }
    
    /*
	 * Generamos un comportamiento que coge el último resultset
	 */
    public static void cargarUltimo() {

        try {
        	
            rs.last();
	            idProfesor 		= rs.getInt(1);
	            nif 			= rs.getString(2);
	            nombre 			= rs.getString(3);
	            especialidad 	= rs.getString(4);
	            telefono 		= rs.getString(5);
                
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
    }
    
    /*
	 * Una comprobación que nos deuvelve un boolean que nos dice si es el último resulset(true) o no(false)
	 */
    public static boolean esFinal() throws SQLException {
		boolean esFinal = false;
		
		if (rs.isLast()){
			esFinal = true;
		}
    	
    	return esFinal;
    	
    }
    
    /*
	 * Una comprobación que nos deuvelve un boolean que nos dice si es el primer resulset(true) o no(false)
	 */
    public static boolean esPrimero() throws SQLException {
		boolean esPrimero = false;
		
		if (rs.isFirst()){
			esPrimero = true;
		}
    	
    	return esPrimero;
    	
    }
    /*
	 * Si se usa, cambia el valor del boolean "nuevo" a true
	 */
    public static void nuevo() {
    	nuevo = true;
    }
    
    public static void comprobarId(String s) {
    	ResultSet rs2 = null;
    	
    	try {
    	Statement stm2 = conexion.createStatement();
        rs2 = stm2.executeQuery("SELECT * FROM profesor where idProfesor = " + s);
        rs2.first();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
        
		if (rs2 == null) {
    		 permiso = true;
    	} else {
    		permiso = false;
    	}    	
    }
    
    /*
	 * Si nuevo=true, inserta una nueva entrada en la base de datos, con los argumentos dados.
	 * Si nuevo=false, updatea la entrada en la base de datos con los argument
	 */
    public static void guardar(String IdProfesor, String nif, String nombre,String Especialidad, String telefono) {        
    	if (nuevo & permiso){
    		try {
    			String query = "Insert into profesor (IdProfesor,NIF_P,Nombre,Especialidad,Telefono) value (?,?,?,?,?)";
            	st = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            	st.setString(1, IdProfesor);
            	st.setString(2, nif);
            	st.setString(3, nombre);
            	st.setString(4, Especialidad);
            	st.setString(5, telefono);
            	st.executeUpdate();
            	inicializar();
            	nuevo = false;
            } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }
    	} else if (!nuevo) {
    		try {
    		String query = "Update profesor set NIF_P = ?, Nombre = ?, Especialidad = ?, Telefono = ? where idProfesor = ?";
        	st = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        	st.setString(1, nif);
        	st.setString(2, nombre);
        	st.setString(3, Especialidad);
        	st.setString(4, telefono);
        	st.setInt(5, Integer.parseInt(IdProfesor));
        	st.executeUpdate();
        	inicializar();
        }
    		catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
    		} 
    		nuevo = false;
    	}
    }
}