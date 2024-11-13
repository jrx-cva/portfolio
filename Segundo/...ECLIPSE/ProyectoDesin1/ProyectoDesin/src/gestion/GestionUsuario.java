package gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import clases.Usuario;

public class GestionUsuario {
	
	public Usuario obtenerUsuario (Usuario usu) {
		Usuario usuario = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		//conexion
		try {
			con = bbdd.getConexion();
		} catch (Exception e) {
			
		}
		
		return usuario;
	}

}
