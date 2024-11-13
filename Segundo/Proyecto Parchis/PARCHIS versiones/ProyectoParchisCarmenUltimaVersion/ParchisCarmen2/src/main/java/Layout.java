import java.awt.*;

/**
 * Clase encargada de dibujar todo el tablero y su gran mayoria de cosas
 */
public class Layout {
    int x, y;
    int anchura, altura;

    /**
     * Constructor de la clase
     *
     * @param xi
     * @param yi
     */
    public Layout(int xi, int yi) {
        x = xi;
        y = yi;
        anchura = 30;
        altura = 30;
    }

    /**
     * Metodo diseñado para dibujarlo todo
     *
     * @param g
     */
    public void draw(Graphics2D g) {
        g.setColor(Color.decode("#F6F7F8")); //color de fondo del TABLERO
        g.fillRect(x, y, 15 * anchura, 15 * altura); //lo que dibuja ya que son las coordenadas del TABLERO

        //dibuja la parte cuadrada que rodea la casilla
        for (int i = 0; i < 6; i++) {
            //casilla roja
            g.setColor(Color.decode("#A2012C"));
            g.fillRect(x + (i * anchura), y, anchura, altura); //barra de arriba
            g.fillRect(x, y + (i * altura), anchura, altura); //barra izquierda
            g.fillRect(x + (i * anchura), y + (5 * altura), anchura, altura); //barra de abajo
            g.fillRect(x + (5 * anchura), y + (i * altura), anchura, altura); //barra derecha

            //casilla verde
            g.setColor(Color.decode("#117D60"));
            g.fillRect(x + ((i + 9) * anchura), y, anchura, altura); //barra de arriba
            g.fillRect(x + (9 * anchura), y + (i * altura), anchura, altura); //barra izquierda
            g.fillRect(x + ((i + 9) * anchura), y + (5 * altura), anchura, altura); //barra de abajo
            g.fillRect(x + (14 * anchura), y + (i * altura), anchura, altura); //barra derecha

            //casilla amarilla
            g.setColor(Color.decode("#F7A814"));
            g.fillRect(x + ((i + 9) * anchura), y + (9 * altura), anchura, altura); //barra de arriba
            g.fillRect(x + (9 * anchura), y + ((i + 9) * altura), anchura, altura); //barra izquierda
            g.fillRect(x + ((i + 9) * anchura), y + (14 * altura), anchura, altura); //barra de abajo
            g.fillRect(x + (14 * anchura), y + ((i + 9) * altura), anchura, altura); //barra derecha

            //casilla azul
            g.setColor(Color.decode("#163791"));
            g.fillRect(x + (i * anchura), y + (9 * altura), anchura, altura); //barra de arriba
            g.fillRect(x, y + ((i + 9) * altura), anchura, altura); //barra izquierda
            g.fillRect(x + (i * anchura), y + (14 * altura), anchura, altura); //barra de abajo
            g.fillRect(x + (5 * anchura), y + ((i + 9) * altura), anchura, altura); //barra derecha
        }

        //dibuja la fila que hay para llegar al final
        for (int i = 1; i < 6; i++) {
            //fila final roja
            g.setColor(Color.decode("#A2012C"));
            g.fillRect(x + (i * anchura), y + (7 * altura), anchura, altura); //esto hace que se pinten esos cuadrados y no otros

            //fila final amarilla
            g.setColor(Color.decode("#F7A814"));
            g.fillRect(x + ((8 + i) * anchura), y + (7 * altura), anchura, altura);

            //fila final verde
            g.setColor(Color.decode("#117D60"));
            g.fillRect(x + (7 * anchura), y + (i * altura), anchura, altura);

            //fila final azul
            g.setColor(Color.decode("#163791"));
            g.fillRect(x + ((7) * anchura), y + ((8 + i) * altura), anchura, altura);
        }

        //casilla del principio ROJA
        g.setColor(Color.decode("#A2012C"));
        g.fillRect(x + (1 * anchura), y + (6 * altura), anchura, altura);

        //casilla del principio AMARILLA
        g.setColor(Color.decode("#F7A814"));
        g.fillRect(x + ((13) * anchura), y + (8 * altura), anchura, altura);

        //casilla del principio VERDE
        g.setColor(Color.decode("#117D60"));
        g.fillRect(x + (8 * anchura), y + (1 * altura), anchura, altura);

        //casilla del principio AZUL
        g.setColor(Color.decode("#163791"));
        g.fillRect(x + ((6) * anchura), y + ((13) * altura), anchura, altura);

        int temp1 = x + 45, temp2 = y + 45; //casillas en las que se posicionan las fichas
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                //casillas donde se colocan las fichas ROJAS en blanco
                g.setColor(Color.decode("#F6F7F8"));
                g.fillRect(temp1 + (2 * i * anchura), temp2 + (2 * j * altura), anchura, altura);

                //casillas donde se colocan las fichas AMARILLAS en blanco
                g.setColor(Color.decode("#F6F7F8"));
                g.fillRect(temp1 + (2 * i * anchura) + 9 * anchura, temp2 + (2 * j * altura) + 9 * altura, anchura, altura);

                //casillas donde se colocan las fichas VERDES en blanco
                g.setColor(Color.decode("#F6F7F8"));
                g.fillRect(temp1 + (2 * i * anchura) + 9 * anchura, temp2 + (2 * j * altura) + 0 * altura, anchura, altura);

                //casillas donde se colocan las fichas AZULES en blanco
                g.setColor(Color.decode("#F6F7F8"));
                g.fillRect(temp1 + (2 * i * anchura) + 0 * anchura, temp2 + (2 * j * altura) + 9 * altura, anchura, altura);
            }
        }

        //casilla final ROJA
        g.setColor(Color.decode("#A2012C"));
        int xpoints0[] = {x + (6 * anchura), x + (6 * anchura), x + 15 + (7 * anchura)};
        int ypoints0[] = {y + (6 * altura), y + (9 * altura), y + 15 + (7 * anchura)};
        int npoints = 3;
        g.fillPolygon(xpoints0, ypoints0, npoints);

        //casilla final AMARILLA
        g.setColor(Color.decode("#F7A814"));
        int xpoints1[] = {x + (9 * anchura), x + (9 * anchura), x + 15 + (7 * anchura)};
        int ypoints1[] = {y + (6 * altura), y + (9 * altura), y + 15 + (7 * anchura)};
        int npoints1 = 3;
        g.fillPolygon(xpoints1, ypoints1, npoints1);

        //casilla final VERDE
        g.setColor(Color.decode("#117D60"));
        int xpoints2[] = {x + (6 * anchura), x + (9 * anchura), x + 15 + (7 * anchura)};
        int ypoints2[] = {y + (6 * altura), y + (6 * altura), y + 15 + (7 * anchura)};
        int npoints2 = 3;
        g.fillPolygon(xpoints2, ypoints2, npoints2);

        //casilla final AZUL
        g.setColor(Color.decode("#163791"));
        int xpoints3[] = {x + (6 * anchura), x + (9 * anchura), x + 15 + (7 * anchura)};
        int ypoints3[] = {y + (9 * altura), y + (9 * altura), y + 15 + (7 * anchura)};
        int npoints3 = 3;
        g.fillPolygon(xpoints3, ypoints3, npoints3);

        //toda la linea negra que pinta el tablero
        g.setStroke(new BasicStroke(2));
        g.setColor(Color.decode("#030308"));


        for (int i = 0; i < 3; i++) {
            //for usado para pintar las lineas de cada casilla del tablero
            for (int j = 0; j < 6; j++) {
                g.drawRect(x + ((i + 6) * anchura), y + (j * altura), anchura, altura); //casillas del tablero de la parte verde
                g.drawRect(x + ((j) * anchura), y + ((i + 6) * altura), anchura, altura); //casillas del tablero de la parte roja
                g.drawRect(x + ((i + 6) * anchura), y + ((j + 9) * altura), anchura, altura); //casillas del tablero de la parte azul
                g.drawRect(x + ((j + 9) * anchura), y + ((i + 6) * altura), anchura, altura); //casillas del tablero de la parte amarilla
            }
        }
        //recta del cuadrado interior de la "casa" de cada jugador
        g.drawRect(x + ((1) * anchura), y + (1 * altura), 4 * anchura, 4 * altura); //rojo
        g.drawRect(x + ((10) * anchura), y + (1 * altura), 4 * anchura, 4 * altura); //verde
        g.drawRect(x + ((1) * anchura), y + (10 * altura), 4 * anchura, 4 * altura); //azul
        g.drawRect(x + ((10) * anchura), y + (10 * altura), 4 * anchura, 4 * altura); //amarillo
        g.drawRect(x, y, 15 * anchura, 15 * altura); //cuadrado exterior del tablero

        //for(int i=0;i<2;i++) {
        //	for(int j=0;j<2;j++) {
        //    	g.drawRect(temp1+(2*i*width),temp2+(2*j*height), width, height);
        //    	g.drawRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+9*height, width, height);
        //    	g.drawRect(temp1+(2*i*width)+9*width,temp2+(2*j*height)+0*height, width, height);
        //    	g.drawRect(temp1+(2*i*width)+0*width,temp2+(2*j*height)+9*height, width, height);
        //	}
        //}
        //TRIANGULO de la casilla final
        g.drawPolygon(xpoints0, ypoints0, npoints);
        g.drawPolygon(xpoints1, ypoints1, npoints1);
        g.drawPolygon(xpoints2, ypoints2, npoints2);
        g.drawPolygon(xpoints3, ypoints3, npoints3);

        //dibuja el circulo en el cual las otras fichas no te pueden comer
        g.drawOval(x + 5 + (6 * anchura), y + 5 + (2 * altura), anchura - 10, altura - 10); //parte verde
        g.drawOval(x + 5 + (12 * anchura), y + 5 + (6 * altura), anchura - 10, altura - 10); //parte amarilla
        g.drawOval(x + 5 + (8 * anchura), y + 5 + (12 * altura), anchura - 10, altura - 10); //parte azul
        g.drawOval(x + 5 + (2 * anchura), y + 5 + (8 * altura), anchura - 10, altura - 10); //parte roja

        //fuente y tamaño de la letra
        g.setFont(new Font("sanserif", Font.PLAIN, 20));
        g.drawString("Jugador 1", 130, 35);
        g.drawString("Jugador 2", 400, 35);
        g.drawString("Jugador 4", 130, 530);
        g.drawString("Jugador 3", 400, 530);
    }
}
