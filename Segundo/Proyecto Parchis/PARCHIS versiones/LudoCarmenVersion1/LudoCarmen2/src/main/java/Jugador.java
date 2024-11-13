import java.awt.*;

/**
 * Clase encargada de diseñar las casillas de los jugadores
 */
public class Jugador {
	int height,width,coin;
	Casillas[] casillas = new Casillas[4]; //llama a la clase Casillas con el arraylist

	/**
	 * Constructor de la clase
	 * @param height
	 * @param width
	 */
	public Jugador(int height, int width) {
		coin=0;
		//el array de casillas es 4, por lo cual la i no puede sobrepasar ese numero
		for(int i=0;i<4;i++) {
			casillas[i]=new Casillas(height,width);
		}
	}

}
