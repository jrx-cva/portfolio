package com.carmen.me;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bbdd.ConexionBBDD;
import clasesHechas.Productos;

public class ObtenerProductos {
	
	public Productos obtenerProductos (Productos pro) {
		Productos producto = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		//conexion
		try {
			con = ConexionBBDD.conectar();
			String sql = "select*from productos where categoria_id= ?";
			
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, pro.getCategoriaId()); //categoria_id= ?

			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				producto = new Productos();
				
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener producto");
		}
		
		return producto;
	}
}
