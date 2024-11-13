import java.io.*;

public class Controlador {
	
	private static final byte FASTA_HEAD_LINES = 10;  //Líneas a leer desde el fichero para mostrar en la GUI
	
	private static Controlador singleton = new Controlador();
	
        //Constructor privado. No hay que meterle código ninguno...
	private Controlador() {
		
	}

        //Obtención del singleton	
	public static Controlador getSingleton() {
		return singleton;
	}


	

        //Comportamiento principal de la aplicación	
	public void realizaBusqueda(String gen, String mutaciones,String fichero) {
		Gen genes = new Gen(gen,Byte.parseByte(mutaciones));
		Fasta fasta = new Fasta(genes,fichero);
		String resultado = fasta.buscaGen();
		escribeFichero(resultado);
	}
	
        //Método auxiliar para escribir el String resultado de la búsqueda. Es llamado desde realizaBusqueda
	private void escribeFichero(String resultado) {

		File fichero = new File("resultado.txt");
		try {
			FileWriter escritor = new FileWriter(fichero,true);
			escritor.write(resultado);
			escritor.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

         //Comportamiento que proporciona las primeras FASTA_HEAD_LINES para meter en el JTextArea
	public String cargaHeadFasta(String fichero) throws IOException {
		int contador=0;
		String resultado = "";
		String lines;
		FileReader leerFichero = new FileReader(fichero);
		BufferedReader leerLines = new BufferedReader(leerFichero);
		do {
			lines=leerLines.readLine();
			resultado+=lines+"\n";
			contador++;
		}while(contador<=FASTA_HEAD_LINES &&  lines != null);


		return resultado;
	}
	
	
}
