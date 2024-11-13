import java.awt.*;

/**
 * Clase encargada de "preparar" los Jugadores en el trablero
 */
public class ConstruirJugadores {

	Jugador[] jugador = new Jugador[4]; //llama a la clase jugador , arraylist [4] jugadores

	//Marca la posición del EJE X de las fichas
	int[][] initialx= {
			{1,1,3,3}, //fichas rojas
			{10,10,12,12}, //fichas verdes
			{10,10,12,12}, //fichas amarillas
			{1,1,3,3} //fichas azules
	};

	//Marca la posición de las fichas en el EJE Y
	int[][] initialy= {
			{1,3,1,3}, //fichas rojas
			{1,3,1,3}, //fichas verdes
			{10,12,10,12}, //fichas amarillas
			{10,12,10,12} //fichas azules
	};


	/**
	 * Constructor de la clase
	 * @param height
	 * @param width
	 */
	public ConstruirJugadores(int height, int width) {
		//Crea los jugadores desde el 0 (rojo) al 4 (azul)
		for(int i=0; i<4; i++) {
			jugador[i]=new Jugador(height,width);
		}
	}


	/**
	 * Metodo para dibujarlos
	 * @param g
	 */
	public void draw(Graphics2D g) {
		//Los dibuja con la misma logica que el anterior metodo
		for(int i=0; i<4; i++) {
			for(int j=0;j<4;j++) {
				jugador[i].casillas[j].draw(g,initialx[i][j],initialy[i][j],i); //initialx= es la posición de la primera ficha de cada jugador en la linea vertical; initialy= es la posicion de la primera ficha en la linea horizontal;
																			   //la "i" del final lo unico que hace es hacer que se pinte con su color correspondiente
			}

		}
	}
	
}
