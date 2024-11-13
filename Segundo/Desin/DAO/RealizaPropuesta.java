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
	public Propuesta registrarPropuesta (int idVentas,int idCliente,int idVehiculo,float precioPropuesta, 
			String fechaPropuesta, String fechaValidez, String descrpcionPropuesta, String nombreUsuario) {
		
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
			String sql = "insert into propuesta (id_ventas, id_cliente, id_vehiculo, precio_propuesta,"
					+ " fecha_propuesta, fecha_validez, descripcion_propuesta, nombre_usuario) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, idVentas);
			pst.setInt(2, idCliente);
			pst.setInt(3, idVehiculo);
			pst.setFloat(4, precioPropuesta);
			pst.setString(5, fechaPropuesta);
			pst.setString(6, fechaValidez);
			pst.setString(7, descrpcionPropuesta);
			pst.setString(8, nombreUsuario);
			
			rs = pst.executeQuery();
			
			propu = new Propuesta(idVentas, idCliente, idVehiculo, precioPropuesta, nombreUsuario, fechaPropuesta, fechaValidez, descrpcionPropuesta);
		} catch (Exception e) {
			System.out.println("Error al introsucir propuesta");
		}
		return propu;
		
	}

}
