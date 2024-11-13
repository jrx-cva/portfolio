package DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Exception.BBdd;
import Models.Clientes;

/**
 * Esta clase buscamos el cliente en la Bd y lo mostramos o por lo contrario
 * si no se encuentra da un error.
 */
public class BusquedaCliente {
	
	public Clientes obtenerCliente (Clientes clientes) {
		Clientes cliente = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "select * from cliente where nif_cliente= ?";
			
			
			pst = con.prepareStatement(sql);
			pst.setString(1, clientes.getDniCliente()); //nombre_usuario= ?
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				cliente = new Clientes(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener cliente");
		}
		
		return cliente;
	}

}