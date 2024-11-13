package gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bbdd.BBdd;
import clases.Usuario;

public class GestionUsuario {
	
	public Usuario obtenerUsuario (Usuario usu) {
		Usuario usuario = null;
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		//conexion
		try {
			con = BBdd.conectar();
			String sql = "select*from usuario where nombre_usuario= ? and clave= ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, usu.getNombre_usuario());
			pst.setString(1, usu.getContrasenia());
			
			rs = pst.executeQuery();
			
			//obtener registros
			while (rs.next()) {
				usuario = new Usuario(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
				
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener usuario");
		}
		
		return usuario;
	}

}
