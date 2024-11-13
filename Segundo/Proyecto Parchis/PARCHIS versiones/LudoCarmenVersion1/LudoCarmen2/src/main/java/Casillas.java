import java.awt.*;

/**
 * Clase encargada de dibujar las casillas y marcar su alto y ancho.
 */
public class Casillas {
	int x,y;
	int current;
	int height,width;


	/**
	 * Constructor de la clase
	 * @param h
	 * @param w
	 */
	public Casillas(int h, int w){
		//current es el lugar en el que empieza. No es ni la casilla 1; sino que es "casa" (-1)
		current=-1;
		x=-1;
		y=-1;
		height=h;
		width=w;
	}

	/**
	 * Método para dibujar las fichas dentro y fuera de "Casa"
	 * @param g =  fundamental para renderizar formas, texto e imágenes bidimensionales
	 * @param i
	 * @param j
	 * @param play
	 */
	public void draw(Graphics2D g, int i, int j,int play) {

		//if que afecta a las casillas que esten en "casa"
		if(current==-1) {
			int temp1=80+(height/2),temp2=50+(width/2);
			x=i;
			y=j;

			//"Colorea" las fichas con el color de su jugador; es decir las fichas del jugador rojo serán rojas y así.
			// 0=rojo; 1=verde; 2=amarillo; 3=blue
			//(Recordemos que el 0 es el 1)
			if(play==0) {
				g.setColor(Color.decode("#A2012C")); //jugador rojo
			}
			else if(play==1) {
				g.setColor(Color.decode("#00A341")); //jugador verde
			}
			else if(play==2) {
				g.setColor(Color.decode("#F0D400")); //jugador amarillo
			}
			else if(play==3) {
				g.setColor(Color.decode("#1D1BFF")); //jugador azul
			}

			//funciones graficas (no olvidemos que todo esto sigue definiendose si esta dentro de "casa")
			//Pd: he elegido un circulo ya que esto es lo que mas se asemeja a las fichas del parchis
			g.fillOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); //rellena el circulo
			g.setStroke(new BasicStroke(2)); //el grueso de las lineas que rodean el círculo
			g.setColor(Color.black); //color que rodea el círculo
	    	g.drawOval(temp1+5+(i*width),temp2+5+(j*height),width-10,height-10); //dibuja el circulo
		}


		// Al contrario del if; esto afecta a las fichas que esten fuera de "casa",
		//vaya basicamente es lo mismo de antes pero afectando a las fichas que salgan de ella
		else{
			int temp1=80,temp2=50;
			x=Path.ax[play][current]; //no olvidemos que "current" era la posicion inicial
			y=Path.ay[play][current];

			//If/else que colorea las fichas
			if(play==0) {
				g.setColor(Color.decode("#A2012C")); //jugador rojo
			}
			else if(play==1) {
				g.setColor(Color.decode("#00A341")); //jugador verde
			}
			else if(play==2) {
				g.setColor(Color.decode("#F0D400")); //jugador amarillo
			}
			else if(play==3) {
				g.setColor(Color.decode("#1D1BFF")); //jugador azul
			}

			//funciones gráficas otra vez
			g.fillOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); //rellenaba circulo
			g.setStroke(new BasicStroke(2)); //grueso de las lineas del circulo
			g.setColor(Color.BLACK); //color lineas del circulo
	    	g.drawOval(temp1+5+(x*width),temp2+5+(y*height),width-10,height-10); //dibuja circulo
		}
	}
}
