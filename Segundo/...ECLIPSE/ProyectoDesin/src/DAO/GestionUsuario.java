package DAO;

import java.security.MessageDigest;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import Exception.BBdd;
import Models.RolUsuario;
import Models.Usuario;
import View.Login;

/**
 * Esta clase consulta la BD y mirara si el usuario esta en ella si se evalua
 * si la contraseña incriptada en md5 es igual a la de la BD y si es asi accede en funcion
 * de su rol sino dara un error.  
 */
public class GestionUsuario {
	 
	 public Usuario obtenerUsuario (Usuario usu) {
	  Usuario usuario = null;
	  
	  Connection con;
	  PreparedStatement pst;
	  ResultSet rs;
	  
	  //conexion
	  try {
	   con = BBdd.conectar();
	   String sql = "select nombre_usuario, contrasenia from usuario where nombre_usuario= ? and contrasenia= ?";
	   
	   
	   pst = con.prepareStatement(sql);
	   pst.setString(1, usu.getNombre_usuario()); //nombre_usuario= ?
	   pst.setString(2, usu.getContrasenia()); //contrasenia= ?
	   
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