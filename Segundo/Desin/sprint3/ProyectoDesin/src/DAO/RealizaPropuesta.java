package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Exception.BBdd;
import Models.Propuesta;

/*
 * Esta clase crea una nueva propuesta y si no estan correcto los datos muestra un error.
 */
public class RealizaPropuesta {

	/**
	 * Esta funcion inserta en la base de datos una nueva propuesta dato sus datos.
	 * @param idVentas
	 * @param idCliente
	 * @param idVehiculo
	 * @param precioPropuesta
	 * @param fechaPropuesta
	 * @param fechaValidez
	 * @param descrpcionPropuesta
	 */
	public Propuesta registrarPropuesta (float precioPropuesta, 
			String fechaPropuesta, String descrpcionPropuesta, String nombreUsuario) {
		
		Propuesta propu = null;
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			
			/**
			 * Conectamos con la bbdd e introducimos el objeto mediante un insert a la tabla correspondiente.
			 */
			con = BBdd.conectar();
			String sql = "insert into propuesta (precio_propuesta, fecha_propuesta, descripcion_propuesta, nombre_usuario) "
					+ "values(?, ?, ?, ?)";
			
			
			pst = con.prepareStatement(sql);
			pst.setFloat(1, precioPropuesta);
			pst.setString(2, fechaPropuesta);
			pst.setString(3, descrpcionPropuesta);
			pst.setString(4, nombreUsuario);
			
			rs = pst.executeQuery();
			
			propu = new Propuesta(precioPropuesta, nombreUsuario, fechaPropuesta, descrpcionPropuesta);
		} catch (Exception e) {
			System.out.println("Error al introsucir propuesta");
		}
		return propu;
		
	}

}
