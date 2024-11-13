package com.carmen.me;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String args[]) {
		realizarConexion();
		
	}
	
	private static void realizarConexion() {
		
        ResultSet rs = null;
        Connection cn = null;
        Statement stm = null;
        Conexion conexion = new Conexion();
        
        try {
            cn = conexion.conectar();
            stm = cn.createStatement();
            rs = stm.executeQuery("SELECT * FROM usuario");
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Carmen\\Desktop\\datosConexion.txt", true));
            while (rs.next()) {
                int idUsuario = rs.getInt(1);
                String usuario = rs.getString(2);
                int clave = rs.getInt(3);
    			bw.write(idUsuario + " - " + usuario + " - " + clave);
    			bw.newLine();
	            System.out.println(idUsuario + " - " + usuario + " - " + clave);
            }
			bw.close();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }  catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            try {
                if (rs!= null) {
                    rs.close();
                }
                
                if (stm != null) {
                    stm.close();
                }
                
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
