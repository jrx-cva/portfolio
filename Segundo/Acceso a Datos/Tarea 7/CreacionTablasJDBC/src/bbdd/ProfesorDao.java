package bbdd;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.carmen.me.Profesor;

public class ProfesorDao {
	protected static Connection conexion;
	protected static ResultSet rs;
	protected PreparedStatement st;
	public static int nuevaId;
	
	
	public Profesor obtenerProfesor (Profesor pro) {
		Profesor profesor = null;
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		
		//conexion
				try {
					con = Bbdd.conectar();
					String sql = "select*from profesor";
					
					
					pst = con.prepareStatement(sql);
					
					pst.setInt(1, pro.getIdProfesor());
					pst.setString(2, pro.getNif());
					pst.setString(3, pro.getNombre());
					pst.setString(4, pro.getTelefono());
					
					rs = pst.executeQuery();
					
					//obtener registros
					while (rs.next()) {
						profesor = new Profesor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), sql);
						
					}
					
				} catch (Exception e) {
					System.out.println("Error en obtener profesor");
				}
		
		
		return profesor;
	}
	
	public void añadirProfesor (String nif, String especialidad, String nombre, String telefono) {
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
        	nuevaId = rs.getInt(1);
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
    
    public static void inicializar() {
        try {
        Statement stm = conexion.createStatement();
        rs = stm.executeQuery("SELECT * FROM profesor");
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }
	}
    
    
    
    



	
	
	
	 
}
