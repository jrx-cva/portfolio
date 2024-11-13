import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Fasta {
	
	//Estado
	Gen gen;
	String ficheroSeleccionado;
	String resultado = "";

		
	//Comportamiento
    //Constructor
    public Fasta(Gen migen, String fichero) {
 	gen = migen;
 	ficheroSeleccionado = fichero;
    }
    
    //Comportamiento principal de búsqueda. Abrirá el fichero, creará la cola, la alimentará y le dará
    // la cola a gen para comparar el contenido y así obtener el resultado.
    public String buscaGen() {
    	//Abrir el fichero
    	try {
			FileReader ficheroEncontrado = new FileReader(ficheroSeleccionado);
			BufferedReader leerCaracter = new BufferedReader(ficheroEncontrado);
			String primeralinea = leerCaracter.readLine();
			int letra = leerCaracter.read();

			//Creamos cola
			Queue<String> cola = new LinkedList<>();

			//no llegamos nunca que gen sea mayor que cola
			while (letra != -1){

				char caracter = (char) letra;
				String micaracter = Character.toString(caracter);

				if (letra == 13) {
					letra = leerCaracter.read();
					if (letra == 10) {
						cola.poll();
					}
				}

				if (letra != 10 && cola.size() != gen.getDatos().length()){
					cola.add(micaracter);
				}

				if (cola.size() == gen.getDatos().length()){
					String comparacion = "";

					for (String character : cola) {
						comparacion += character; // Creamos la secuencia que vamos a comparar
					}
					//cadena valida o no
					resultado += gen.compara(comparacion);
					cola.poll(); //elimina primera posicion cola
				}

				letra = leerCaracter.read();
			}




		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		return resultado;
    }


	
}
