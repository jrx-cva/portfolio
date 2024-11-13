import javax.swing.*;

/**
 * Clase cuyo proposito es encargarse de la pantalla de juego
 */
public class PantallaJuego {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setBounds(10, 10, 1200, 600); //x e y= el lugar en el que se abre la ventana; y "width" y "height" es el tamaño de dicha ventana
        jframe.setTitle("PARCHÍS"); //nombre de la ventana
        jframe.setResizable(false); //desactiva que se pueda maximizar la ventana
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando se presiona el botón de cerrado de la ventana finaliza por completo la aplicación

        Movimientos gm = new Movimientos(); //llama a clase movimientos
        gm.setFocusable(true); //sirve para poder usar el teclado
        gm.addKeyListener(gm); //gm "escucha" la tecla que ha pulsado el usuario
        gm.addMouseListener(gm); //gm "escucha" la orden que le manda el raton
        jframe.add(gm); //añade todo esto al jframe
        jframe.setVisible(true); //hace que sea visible (obviamente) (sin esto no seria posible ni jugar)
    }

}
