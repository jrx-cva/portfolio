package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Exception.BBdd;
import Models.Propuesta;

/**
 * En esta clase evaluamos si la propuesa esta en la BD si es asi se muestra sino da un error.
 */
public class CompruebaPropuesta {

	/**
	 * Esta funcion nos muestra una propuesta de la base de datos dado su nidCliente y la fecha de la propuesta
	 * @param propuestas
	 * @return
	 */
	public Propuesta obtenerPropuesta (Propuesta propuestas) {
		Propuesta propuesta = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			/**
			 * Conectamos la bbdd pasandole un select y nos devuelve un valor.
			 */
			con = BBdd.conectar();
			String sql = "select * from propuesta where nombre_usuario = ?"; //and fecha_propuesta= ?
			
			
			pst = con.prepareStatement(sql);
			pst.setString(1, propuestas.getNombreUsuario()); 
			//pst.setString(2, propuestas.getFechaPropuesta());
			
			rs = pst.executeQuery();
			
			//obtener registros creando un Objeto propuest
			while (rs.next()) {
				propuesta = new Propuesta(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getFloat(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener propuesta");
		}
		
		return propuesta;
	}
}
