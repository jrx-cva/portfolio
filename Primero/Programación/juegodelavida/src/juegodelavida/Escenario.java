package juegodelavida;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Escenario {
	
	//ESTADO
	
	private static final int ANCHO = 100;
	private static final int ALTO = 100;
	
	//Utilizaremos un array de booleanos para simular las celulas. True - VIVA.
	private boolean[][] tabla;
	
	
	
	
	//COMPORTAMIENTO
	public Escenario() { //se crea la tabla
		tabla = new boolean[ANCHO][ALTO];

	}

	
	public void reset(float semilla) { //crear celulas del tablero. Y decir si estan vivas o muertas
		for (int i = 0; i < ANCHO; i++) {
			for (int j = 0; j < ALTO; j++) {

				double dados = Math.random(); //numero 0 al 1

				if (dados < semilla ) {
					tabla[i][j] = true;
				} else {
					tabla[i][j] = false;
				}
			}
		}
	}


	public void simulaTurno() { //llama a simulaCelda y lo recorremos
		for (int i = 0; i < ANCHO ; i++) {
			for (int j = 0; j < ALTO; j++) {
				simulaCelda(i, j);
			}
		}

	}

	public void pintate(Graphics2D g2d, int w, int h) {
		for (int i = 0; i < ANCHO ; i++) {
			for (int j = 0; j < ALTO; j++) {
				pintaCelda(i, j, g2d, w, h);
			}
		}
	}
	
    private void simulaCelda(int i, int j) { //comprueba si muere una célula o vive

	  int celulasAlrededor = 0;

	  if (i != 0 ) {  //comprueba casilla izquierda
	  	if (tabla[i-1][j] ) {
			celulasAlrededor++;
		}
	  }

	  if (j != 0 ) {  //comprueba casilla arriba
	  	if (tabla[i][j-1] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (i != ANCHO-1 ) {  //comprueba casilla derecha
	  	if (tabla[i+1][j] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (j != ALTO-1 ) {  //comprueba casilla abajo
	  	if (tabla[i][j+1] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (i != 0 && j != 0) {  //comprueba casilla arriba izquierda
	  	if (tabla[i-1][j-1] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (i != 0 && j != ALTO-1) {  //comprueba casilla abajo izquierda
	  	if (tabla[i-1][j+1] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (i != ANCHO-1 && j != 0) {  //comprueba casilla arriba derecha
	  	if (tabla[i+1][j-1] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (i != ANCHO-1 && j != ALTO-1) {  //comprueba casilla abajo derecha
	  	if (tabla[i+1][j+1] ) {
			celulasAlrededor++;
	  	}
	  }

	  if (celulasAlrededor == 3) {
	  	if (tabla[i][j] == false) {
			tabla[i][j] = true;
		}
	  }

	  if (!(celulasAlrededor == 3 || celulasAlrededor == 2))  {
		  if (tabla[i][j] == true) {
			  tabla[i][j] = false;
		  }
	  }


	}
    
    
    private void pintaCelda(int i, int j, Graphics2D g2d, int w, int h) {
    	int celdaAncho;
    	int celdaAlto;

    	celdaAlto = h/ALTO;
    	celdaAncho = w/ANCHO;

    	if (tabla[i][j] == true ) {
    		g2d.setColor(Color.blue);
		}else {
    		g2d.setColor(Color.white);
		}
    	g2d.fillRect(i*celdaAncho,j*celdaAlto, celdaAncho, celdaAlto);

    }
}
