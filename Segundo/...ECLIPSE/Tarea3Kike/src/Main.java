import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	
	static ConexionDAO con = new ConexionDAO();
	

	public static void main(String[] args) throws IOException {
		con.conectar();
		con.inicializar();
		lector();
		con.finalizar();
	}
	
	public static void lector() throws IOException {
		
        BufferedReader lector = new BufferedReader(new FileReader("D:\\bbdd.txt"));
        lector.readLine();

        String linea;

        while ((linea = lector.readLine()) != null) {
            String[] Trozo;
            Trozo = linea.split(";");
            if (Trozo[0].equals("Profesor")) {
            	con.añadirProfesor(Trozo[1], Trozo[2], Trozo[3], Trozo[4]);
            } else {
            	while(Trozo[0].equals("Asignatura")) {
            		con.añadirAsignatura(Trozo[1], Trozo[2], ConexionDAO.auto_id);
            	}
            	con.commitear();

            	}
            }
            
        }
	
}
