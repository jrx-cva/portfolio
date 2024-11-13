package DAO;


import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Exception.BBdd;
import Models.Vehiculo;

/**
 * Esta clase se comprueba que el vehículo no este ya en la BD y si es así lo crea.
 */
public class RegistraVehiculo {
	
	public Vehiculo registrarVehiculo (int idConcesionario, int idCliente, int idVentas, String numBastidor, String matricula, String marca, 
			String modelo, String tipoVehiculo, String color, String potencia, String anio, String combustible, float precio,
			String descripcionVeehiculo) {
		
		Vehiculo vehi = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "insert into vehiculo (id_concesionario, id_cliente, id_ventas, num_bastidor, matricula, marca, \r\n" + 
					"modelo, tipo_vehiculo, color, potencia, anio, combustible, precio, descripcion_vehiculo) "
					+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			
			pst = con.prepareStatement(sql);
			pst.setInt(2, idConcesionario); // id_concesionario
			pst.setInt(3, idCliente);
			pst.setInt(4, idVentas);
			pst.setString(5, numBastidor);
			pst.setString(6, matricula);
			pst.setString(7, modelo);
			pst.setString(8, tipoVehiculo);
			pst.setString(9, color);
			pst.setString(10, potencia);
			pst.setString(11, anio);
			pst.setString(12, combustible);
			pst.setFloat(13, precio);
			pst.setString(14, descripcionVeehiculo);
			
			rs = pst.executeQuery();
			
			vehi = new Vehiculo(idConcesionario, idCliente, idVentas, numBastidor, matricula, marca, modelo, tipoVehiculo, color, potencia, anio, combustible, precio, descripcionVeehiculo);
		} catch (Exception e) {
			System.out.println("Error al introducir cliente");
		}
		return vehi;
		
	}

}
