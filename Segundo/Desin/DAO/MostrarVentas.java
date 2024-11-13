package DAO;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Exception.BBdd;
import Models.Propuesta;
public class MostrarVentas {

	public ArrayList<Propuesta> obtenerReparacion () {
		Propuesta propuesta = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs, rsContra;
		ArrayList<Propuesta> listaPropuesta = new ArrayList<>();
		
		//conexion
		try {
			
			con = BBdd.conectar();
			String sqlContra = "select count(*) from propuesta where estado_propuesta = ?";
			
			pst = con.prepareStatement(sqlContra);
			pst.setString(1, "Finalizado");
			
			rs = pst.executeQuery();
				
			//obtener registros
			while (rs.next()) {
				
				propuesta = new Propuesta(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getFloat(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9), rs.getString(10));
				listaPropuesta.add(propuesta);
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener la propuesta");
		}
		
		return listaPropuesta;
	}
	
}
