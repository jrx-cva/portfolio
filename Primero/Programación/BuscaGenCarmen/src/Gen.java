import java.util.Queue;

public class Gen {
	//Estado
	String datos; //cadena que introducimos
	byte mutaciones; //número de cambios permitidos
	
	
	//Comportamiento
        
        //Constructor
    public Gen(String datos, byte mutaciones) {
		this.datos = datos;
		this.mutaciones = mutaciones;
	}

        //Getter
    public String getDatos() {
    	return datos;
	}


    //Comportamiento clave. Se llamará cada vez que el fichero cambie la cola. Nos dan una cola y la comparamos con nuestro
    //String caracter a caracter contando los fallos/errores. Se debe devolver una cadena "cola;erroresencontrados"
    public String compara(String comparacion) { //comparacion sale del fichero
    	int error = 0;
    	String resultado = "";

		for (int i = 0; i < datos.length(); i++) {
			if (comparacion.charAt(i) != datos.charAt(i)) {
				error++;
			}
		}

		if (error <= mutaciones ) {
			resultado = comparacion+";"+error+"\n";

		}

		return resultado;
    }
	
	
        //Getter
	public byte getMutaciones() {
    	return mutaciones;
	}

}
