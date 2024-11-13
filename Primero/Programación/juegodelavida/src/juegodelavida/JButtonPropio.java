package juegodelavida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JButtonPropio extends JButton {
	
	public static final byte TIPO_PAUSE = 0;
	public static final byte TIPO_START = 1;
	
	private byte tipo;
	
	
	
	public JButtonPropio(byte tipo) {
		if(tipo == 0)  {
			this.tipo = TIPO_PAUSE;

		} else if (tipo == 1) {
			this.tipo = TIPO_START;

		}
	}

	public byte getTipo() {
		return tipo;
	}

}
