package DAO;

import java.security.MessageDigest;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.xml.bind.DatatypeConverter;

import Exception.BBdd;
import Models.Repara;
import Models.RolUsuario;
import Models.Usuario;
import View.Login;

/**
 * Esta clase consulta la BD y mirara si el usuario tiene tareas y las muestra para que seleccione cual comienza.   
 */
public class MiTrabajoDia {

	public ArrayList<Repara> obtenerReparacion (int id_mecanico) {
		Repara repar = null;
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs, rsContra;
		ArrayList<Repara> listaRepara = new ArrayList<>();
		
		//conexion
		try {
			
			con = BBdd.conectar();
			String sqlContra = "select * from repara where id_mecanico= ?";
			
			pst = con.prepareStatement(sqlContra);
			pst.setInt(1, id_mecanico); 
			
			rs = pst.executeQuery();
				
			//obtener registros
			while (rs.next()) {
				
				repar = new Repara(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getFloat(6),rs.getString(5),rs.getString(4),rs.getString(7),rs.getString(8));
				listaRepara.add(repar);
			}
			
		} catch (Exception e) {
			System.out.println("Error en obtener la reparación");
		}
		
		return listaRepara;
	}
}
