package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exception.BBdd;
import Models.Repara;
import Models.Vehiculo;

/**
 * Esta clase crea una nueva tarea en la BD.
 */
public class CreaNuevaTarea {
	
	public Repara newTarea(int idVehiculo, int idMecanico, String iniRepara, String tipoRepara, String desRepara) {
		
		Repara tareaNew = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		con = BBdd.conectar();
		
		//conexion
		try {
			String sql = "insert into repara(id_vehiculo, id_mecanico, inicio_reparacion,"
					+ " fin_reparacion, horas_reparacion, tipo_reparacion, descripcion_reparacion) values(?,?,?,?,?,?,?)";
			
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, idVehiculo); 
			pst.setInt(2, idMecanico); 
			pst.setString(3, iniRepara); 
			pst.setString(4, ""); 
			pst.setFloat(5, 0); 
			pst.setString(6, tipoRepara); 
			pst.setString(7, desRepara); 
			
			rs = pst.executeQuery();
			
			tareaNew = new Repara(idVehiculo, idMecanico, 0.0, iniRepara, "" , tipoRepara, desRepara);
			
		} catch (Exception e) {
			System.out.println("Error en obtener vehículo");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return tareaNew;
	}

}
