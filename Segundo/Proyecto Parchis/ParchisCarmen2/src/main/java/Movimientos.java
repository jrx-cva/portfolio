import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase dedicada a los movimientos de las fichas de los jugadores
 */
public class Movimientos extends JPanel implements KeyListener, ActionListener, MouseListener {
    private static final long serialVersionUID = 1L;
    Layout layout;
    ConstruirJugadores construirJugadores;
    int jugadorActual, dado, tirada;
    int parar = 0, kill = 0;

    /**
     * Constructor de la clase
     */
    public Movimientos() {
        setFocusTraversalKeysEnabled(false);
        requestFocus();
        jugadorActual = 0;
        layout = new Layout(80, 50);
        construirJugadores = new ConstruirJugadores(layout.altura, layout.anchura);
        dado = 0;
        parar = 0;
        tirada = 0;
        kill = 0;
    }

    /**
     * Metodo
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        layout.draw((Graphics2D) g); //layout
        construirJugadores.draw((Graphics2D) g); //Build_player

        //Si se han metido las 4 fichas en el final
        if (construirJugadores.jugador[jugadorActual].fichas == 4) {
            g.setColor(Color.decode("#F6F7F8")); //color del cuadrante de la derecha
            g.fillRect(590, 100, 380, 130);

            //texto rojo
            if (jugadorActual == 0) {
                g.setColor(Color.decode("#A2012C"));
            }

            //texto verde
            else if (jugadorActual == 1) {
                g.setColor(Color.decode("#117D60"));
            }

            //texto amarillo
            else if (jugadorActual == 2) {
                g.setColor(Color.decode("#F7A814"));
            }

            //texto azul
            else if (jugadorActual == 3) {
                g.setColor(Color.decode("#163791"));
            }

            //mensaje que imprime por pantalla cuando gana un jugador
            g.setFont(new Font("sanserif", Font.PLAIN, 40));
            g.drawString("Jugador " + (jugadorActual + 1) + " ha ganado.", 600, 150);
            g.drawString("Felicidadees <3.", 600, 200);

            //"reseteamos" valores
            jugadorActual = 0;
            layout = new Layout(80, 50);
            construirJugadores = new ConstruirJugadores(layout.altura, layout.anchura);
            dado = 0;
            parar = 0;
            tirada = 0;
            kill = 0;
        }

        //si el dado es distinto de 0
        else if (dado != 0) {
            g.setColor(Color.decode("#F6F7F8")); //color del fondo del cuadrante derecho del dado
            g.fillRect(590, 100, 380, 130);

            //texto rojo
            if (jugadorActual == 0) {
                g.setColor(Color.decode("#A2012C"));
            }

            //texto verde
            else if (jugadorActual == 1) {
                g.setColor(Color.decode("#117D60"));
            }

            //texto amarillo
            else if (jugadorActual == 2) {
                g.setColor(Color.decode("#F7A814"));
            }

            //texto azul
            else if (jugadorActual == 3) {
                g.setColor(Color.decode("#163791"));
            }

            //fuente y demás
            g.setFont(new Font("sanserif", Font.PLAIN, 30));
            g.drawString("Jugador " + (jugadorActual + 1), 600, 150);
            g.drawString("El dado dice: " + dado, 600, 200);
        }

        //este if hace que cuando se saque un 6 se repita el tiro.
        if (parar == 0 && dado != 0 && dado != 6 && kill == 0) {
            jugadorActual = (jugadorActual + 1) % 4;
        }
        kill = 0;
    }

    /**
     * Método que sirve para toda la logica para cuando se pulse la tecla "ENTER"
     * cuya tecla sirve para tirar dado
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

        //if que dicta que la tecla "Enter" sea la que tire el dado
        if (e.getKeyCode() == KeyEvent.VK_ENTER && parar == 0) {
            tirada = 0; //el dado empieza siendo 0
            dado = 1 + (int) (Math.random() * 6); //numero del dado del 1 al 6
            repaint(); //avisa a la máquina virtual java que se necesita repintado

            for (int i = 0; i < 4; i++) {
                //hace que cuando saques un numero con el que puedes mover una ficha se detenga y te obligue a mover ficha
                if (construirJugadores.jugador[jugadorActual].casillas[i].casillaActual != -1 && construirJugadores.jugador[jugadorActual].casillas[i].casillaActual != 56 && (construirJugadores.jugador[jugadorActual].casillas[i].casillaActual + dado) <= 56) {
                    parar = 1;
                    break;
                }

            }

            //if cual proposito es definir que solo puede salir de la casilla si el dado es 5
            if (parar == 0 && dado == 5) {

                for (int i = 0; i < 4; i++) {

                    if (construirJugadores.jugador[jugadorActual].casillas[i].casillaActual == -1) {
                        parar = 1;
                        break;
                    }

                }

            }


        }
    }

    public void mouseClicked(MouseEvent e) {

        if (parar == 1) {
            int x = e.getX();
            int y = e.getY();
            x = x - 80;
            y = y - 50;
            x = x / 30;
            y = y / 30;
            int valor = -1;

            //este if sirve para cuando el dado es "5" y hace que se mueva a la casilla principal para empezar a jugar
            if (dado == 5) {
                for (int i = 0; i < 4; i++) {
                    if (construirJugadores.jugador[jugadorActual].casillas[i].x == x && construirJugadores.jugador[jugadorActual].casillas[i].y == y && (construirJugadores.jugador[jugadorActual].casillas[i].casillaActual + dado) <= 56) {
                        valor = i;
                        parar = 0;
                        break;
                    }
                }

                //si el valor anterior es distinto a "-1"
                if (valor != -1) {
                    construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual += dado;
                    int nuevoValor = 0;
                    int hou = construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual;
                    if (construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual == 56) {
                        construirJugadores.jugador[jugadorActual].fichas++;
                    }

                    if ((hou % 13) != 0 && (hou % 13) != 8 && hou < 51) {

                        for (int i = 0; i < 4; i++) {
                            //si la i no es el mismo numero que el del jugador actual
                            if (i != jugadorActual) {
                                for (int j = 0; j < 4; j++) {
                                    int tem1 = Path.ax[jugadorActual][construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual];
                                    int tem2 = Path.ay[jugadorActual][construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual];

                                    if (construirJugadores.jugador[i].casillas[j].x == tem1 && construirJugadores.jugador[i].casillas[j].y == tem2) {
                                        construirJugadores.jugador[i].casillas[j].casillaActual = -1;
                                        kill = 1;
                                        nuevoValor = 1;
                                        break;
                                    }
                                }
                            }
                            //si el valor es 1
                            if (nuevoValor == 1) {
                                break;
                            }
                        }
                    }
                }

                //si el valor es "-1"
                else {
                    for (int i = 0; i < 4; i++) {
                        if (construirJugadores.jugador[jugadorActual].casillas[i].casillaActual == -1) {
                            construirJugadores.jugador[jugadorActual].casillas[i].casillaActual = 0; //esto hace que la ficha salga a la casilla 0
                            parar = 0; //que cuando se saque un 5 se pare el turno del jugador actual
                            break;
                        }
                    }
                }
            }

            //si el valor del dado es diferente a "5"
            else {
                for (int i = 0; i < 4; i++) {
                    if (construirJugadores.jugador[jugadorActual].casillas[i].x == x && construirJugadores.jugador[jugadorActual].casillas[i].y == y && (construirJugadores.jugador[jugadorActual].casillas[i].casillaActual + dado) <= 56) {
                        valor = i;
                        parar = 0;
                        break;
                    }
                }

                //si el valor anterior ha dado "-1"
                if (valor != -1) {
                    construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual += dado;
                    if (construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual == 56) {
                        construirJugadores.jugador[jugadorActual].fichas++;
                    }
                    int nuevoValor = 0;
                    int hou = construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual;
                    if ((hou % 13) != 0 && (hou % 13) != 8 && hou < 51) {
                        for (int i = 0; i < 4; i++) {
                            if (i != jugadorActual) {
                                for (int j = 0; j < 4; j++) {
                                    int tem1 = Path.ax[jugadorActual][construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual], tem2 = Path.ay[jugadorActual][construirJugadores.jugador[jugadorActual].casillas[valor].casillaActual];
                                    if (construirJugadores.jugador[i].casillas[j].x == tem1 && construirJugadores.jugador[i].casillas[j].y == tem2) {
                                        construirJugadores.jugador[i].casillas[j].casillaActual = -1;
                                        kill = 1;
                                        nuevoValor = 1;
                                        break;
                                    }
                                }
                            }
                            if (nuevoValor == 1)
                                break;
                        }
                    }
                }
            }
            repaint();
        }
    }

    /***
     * Método para detectar y manejar eventos de acción (ActionEvent):
     * que tienen lugar cuando se produce una acción sobre un elemento del
     * programa.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }

    /**
     * Método que se ejecuta cada vez que sueltas una tecla.
     *
     * @param arg0
     */
    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
    }

    /***
     * Método que se ejecuta cada vez que se presiona y se suelta una tecla.
     * @param arg0
     */
    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
    }


    /**
     * Método para indicar que el puntero del mouse entro al area del objeto.
     *
     * @param arg0
     */
    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * Método para indicar que el puntero del mouse salio del area del objeto.
     *
     * @param arg0
     */
    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }

    /**
     * Método para indicar que se presiono el objeto, se activa cuando se presiona el click del raton (no cuando se presiona y se suelta)
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    /***
     * Método para indicar que el mouse soltó el objeto.
     * @param arg0
     */
    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
    }


}
