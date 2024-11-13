package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MecanicoDAO1 extends JFrame{

	private JFrame frame;
	private JButton btnIniciarReparación;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MecanicoDAO1 window = new MecanicoDAO1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MecanicoDAO1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 50, 800, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(233,196,106));
		panel.setBounds(0, 0, 784, 45);
		frame.getContentPane().add(panel);
		
		JLabel lbl1 = new JLabel("Mec\u00E1nico");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lbl1.setBounds(325, 11, 77, 22);
		panel.add(lbl1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(233,196,106));
		panel_1.setBounds(10, 56, 314, 544);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl2 = new JLabel("Trabajo asignado:");
		lbl2.setForeground(Color.BLACK);
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl2.setBounds(10, 11, 117, 14);
		panel_1.add(lbl2);
		
		JTextArea taTrabajoAsignado = new JTextArea();
		taTrabajoAsignado.setBounds(10, 36, 294, 373);
		panel_1.add(taTrabajoAsignado);
		
		btnIniciarReparación = new JButton("Iniciar");
		btnIniciarReparación.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MecanicoBotonIniciar mecanicoBotonIniciar = new MecanicoBotonIniciar();
				mecanicoBotonIniciar.setVisible(true);
			}
		});
		btnIniciarReparación.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnIniciarReparación.setBounds(20, 420, 265, 53);
		panel_1.add(btnIniciarReparación);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(38,70,83));
		panel_2.setBounds(334, 56, 440, 544);
		frame.getContentPane().add(panel_2);
	}
}
