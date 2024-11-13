import java.awt.*;

public class Layout {
	int x,y,width,height;

	/**
	 * Constructor de la clase
	 * @param xi
	 * @param yi
	 */
	public Layout(int xi,int yi) {
		x=xi;
		y=yi;
		width=30;
		height=30;
	}

	/**
	 * Metodo diseñado para
	 * @param g
	 */
	public void draw(Graphics2D g){
		g.setColor(Color.decode("#F6F7F8")); //color de fondo del TABLERO
        g.fillRect(x,y,15*width,15*height); //lo que dibuja ya que son las coordenadas del TABLERO

		//dibuja la parte cuadrada que rodea la casilla
        for(int i=0;i<6;i++) {
        	//casilla roja
        	g.setColor(Color.decode("#A2012C"));
        	g.fillRect(x+(i*width),y, width, height); //barra de arriba
        	g.fillRect(x, y+(i*height), width, height); //barra izquierda
        	g.fillRect(x+(i*width),y+(5*height), width, height); //barra de abajo
        	g.fillRect(x+(5*width), y+(i*height), width, height); //barra derecha

			//casilla verde
        	g.setColor(Color.decode("#117D60"));
        	g.fillRect(x+((i+9)*width),y, width, height); //barra de arriba
        	g.fillRect(x+(9*width), y+(i*height), width, height); //barra izquierda
        	g.fillRect(x+((i+9)*width),y+(5*height), width, height); //barra de abajo
        	g.fillRect(x+(14*width), y+(i*height), width, height); //barra derecha

        	//casilla amarilla
        	g.setColor(Color.decode("#F7A814"));
        	g.fillRect(x+((i+9)*width),y+(9*height), width, height); //barra de arriba
        	g.fillRect(x+(9*width), y+((i+9)*height), width, height); //barra izquierda
        	g.fillRect(x+((i+9)*width),y+(14*height), width, height); //barra de abajo
        	g.fillRect(x+(14*width), y+((i+9)*height), width, height); //barra derecha

        	//casilla azul
        	g.setColor(Color.decode("#163791"));
        	g.fillRect(x+(i*width),y+(9*height), width, height); //barra de arriba
        	g.fillRect(x, y+((i+9)*height), width, height); //barra izquierda
        	g.fillRect(x+(i*width),y+(14*height), width, height); //barra de abajo
        	g.fillRect(x+(5*width), y+((i+9)*height), width, height); //barra derecha
        }

        //dibuja la fila que hay para llegar al final
        for(int i=1;i<6;i++) {
        	//fila final roja
        	g.setColor(Color.decode("#A2012C"));
        	g.fillRect(x+(i*width),y+(7*height), width, height); //esto hace que se pinten esos cuadrados y no otros

        	//fila final amarilla
        	g.setColor(Color.decode("#F7A814"));
        	g.fillRect(x+((8+i)*width),y+(7*height), width, height);

        	//fila final verde
        	g.setColor(Color.decode("#117D60"));
        	g.fillRect(x+(7*width),y+(i*height), width, height);

        	//fila final azul
        	g.setColor(Color.decode("#163791"));
        	g.fillRect(x+((7)*width),y+((8+i)*height), width, height);
        }

        //casilla del principio ROJA
        g.setColor(Color.decode("#A2012C"));
    	g.fillRect(x+(1*width),y+(6*height), width, height);

    	//casilla del principio AMARILLA
    	g.setColor(Color.decode("#F7A814"));
    	g.fillRect(x+((13)*width),y+(8*height), width, height);

    	//casilla del principio VERDE
    	g.setColor(Color.decode("#117D60"));
    	g.fillRect(x+(8*width),y+(1*height), width, height);

    	//casilla del principio AZUL
    	g.setColor(Color.decode("#163791"));
    	g.fillRect(x+((6)*width),y+((13)*height), width, height);

    	int temp1=x+45,temp2=y+45; //casillas en las que se posicionan las fichas
    	for(int i=0;i<2;i++) {

    		for(int j=0;j<2;j++) {
    			//casillas de fichas ROJAS en blanco
    			g.setColor(Color.decode("#F6F7F8"));
    	    	g.fillRect(temp1+(2*i*width),temp2+(2*j*height), width, height);

    	    	//casillas de fichas AMARILLAS
    	    	g.setColor(Color.decode("#F6F7F8"));
    	    	g.fillRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+9*height, width, height);

    	    	//casillas de fichas VERDES
    	    	g.setColor(Color.decode("#F6F7F8"));
    	    	g.fillRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+0*height, width, height);

    	    	//casillas de fichas AZULES
    	    	g.setColor(Color.decode("#F6F7F8"));
    	    	g.fillRect(temp1+(2*i*width)+0*width,temp2+(2*j*height)+9*height, width, height);
    		}
    	}

    	//casilla final ROJA
    	g.setColor(Color.decode("#A2012C"));
    	int xpoints0[] = {x+(6*width),x+(6*width), x+15+(7*width)};
        int ypoints0[] = {y+(6*height),y+(9*height),y+15+(7*width)};
        int npoints = 3;
        g.fillPolygon(xpoints0, ypoints0, npoints);

        //casilla final AMARILLA
    	g.setColor(Color.decode("#F7A814"));
    	int xpoints1[] = {x+(9*width),x+(9*width), x+15+(7*width)};
        int ypoints1[] = {y+(6*height),y+(9*height),y+15+(7*width)};
        int npoints1= 3;
        g.fillPolygon(xpoints1, ypoints1, npoints1);

        //casilla final VERDE
    	g.setColor(Color.decode("#117D60"));
    	int xpoints2[] = {x+(6*width),x+(9*width), x+15+(7*width)};
        int ypoints2[] = {y+(6*height),y+(6*height),y+15+(7*width)};
        int npoints2= 3;
        g.fillPolygon(xpoints2, ypoints2, npoints2);

        //casilla final AZUL
    	g.setColor(Color.decode("#163791"));
    	int xpoints3[] = {x+(6*width),x+(9*width), x+15+(7*width)};
        int ypoints3[] = {y+(9*height),y+(9*height),y+15+(7*width)};
        int npoints3= 3;
        g.fillPolygon(xpoints3, ypoints3, npoints3);

        //toda la linea negra que pinta el tablero
    	g.setStroke(new BasicStroke(2));
    	g.setColor(Color.decode("#030308"));


    	for(int i=0;i<3;i++) {
    		//for usado para pintar las casillas
    		for(int j=0;j<6;j++) {
    	        g.drawRect(x+((i+6)*width),y+(j*height), width, height); //casillas del tablero de la parte verde
    	        g.drawRect(x+((j)*width),y+((i+6)*height), width, height); //casillas del tablero de la parte roja
    	        g.drawRect(x+((i+6)*width),y+((j+9)*height), width, height); //casillas del tablero de la parte azul
    	        g.drawRect(x+((j+9)*width),y+((i+6)*height), width, height); //casillas del tablero de la parte amarilla
    		}
    	}
    	 //recta del cuadrado interior de la "casa" de cada jugador
    	g.drawRect(x+((1)*width),y+(1*height),4*width,4*height); //rojo
    	g.drawRect(x+((10)*width),y+(1*height),4*width,4*height); //verde
    	g.drawRect(x+((1)*width),y+(10*height),4*width,4*height); //azul
    	g.drawRect(x+((10)*width),y+(10*height),4*width,4*height); //amarillo
        g.drawRect(x,y,15*width,15*height); //cuadrado exterior del tablero

        //for(int i=0;i<2;i++) {
    	//	for(int j=0;j<2;j++) {
    	//    	g.drawRect(temp1+(2*i*width),temp2+(2*j*height), width, height);
    	//    	g.drawRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+9*height, width, height);
    	//    	g.drawRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+0*height, width, height);
    	//    	g.drawRect(temp1+(2*i*width)+0*width,temp2+(2*j*height)+9*height, width, height);
    	//	}
    	//}
		//triangulo de la casilla triangular final
        g.drawPolygon(xpoints0, ypoints0, npoints);
        g.drawPolygon(xpoints1, ypoints1, npoints1);
        g.drawPolygon(xpoints2, ypoints2, npoints2);
        g.drawPolygon(xpoints3, ypoints3, npoints3);

        //dibuja el circulo en el cual otras fichas no te pueden comer
        g.drawOval(x+5+(6*width),y+5+(2*height),width-10,height-10); //parte verde
        g.drawOval(x+5+(12*width),y+5+(6*height),width-10,height-10); //parte amarilla
        g.drawOval(x+5+(8*width),y+5+(12*height),width-10,height-10); //parte azul
        g.drawOval(x+5+(2*width),y+5+(8*height),width-10,height-10); //parte roja

		//fuente y tamaño de la letra
        g.setFont(new Font("sanserif", Font.PLAIN, 20));
        g.drawString("Jugador Rojo", 110, 35);
        g.drawString("Jugador Verde", 380, 35);
        g.drawString("Jugador Azul", 110, 540);
        g.drawString("Jugador Amarillo", 370, 540);
        //g.drawString("Instruction:", 550,300);
    }
}
