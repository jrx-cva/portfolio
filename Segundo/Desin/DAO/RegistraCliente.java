package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Exception.BBdd;
import Models.Clientes;
import Models.Vehiculo;

/**
 * Esta clase inserta un nuevo cliente en la BD si no existe
 */
public class RegistraCliente {
	
	public Clientes registrarCliente (String nombreCliente, String dniCliente, String emailCliente,String numCuenta) {
		
		Clientes cliente = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "insert into cliente (nombre_cliene, nif_cliente, email_cliente, num_cuenta)";
			
			
			pst = con.prepareStatement(sql);
			pst.setString(2, nombreCliente);
			pst.setString(3, dniCliente);
			pst.setString(4, emailCliente);
			pst.setString(5, numCuenta);
						
			rs = pst.executeQuery();
			
			cliente = new Clientes(nombreCliente, dniCliente, emailCliente, numCuenta);
			
		} catch (Exception e) {
			System.out.println("Error al añadir cliente");
		}
		return cliente;
	}
}
