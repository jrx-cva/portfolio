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
import javax.swing.Timer;

public class MecanicoBotonIniciar extends javax.swing.JFrame{

	private JFrame frame;
	private JButton btnTerminar;
	JButton btnPausar = new JButton("Pausar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MecanicoBotonIniciar window = new MecanicoBotonIniciar();
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
	public MecanicoBotonIniciar() {
		initialize();
		setLocationRelativeTo(null);
		t= new Timer(10, acciones);
	}
	
	@SuppressWarnings("unchecked")
	
	private Timer t;
	private int h, m, s, cs;
	private ActionListener acciones = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			++cs;
			if (cs==100) {
				cs = 0;
				++s;
			}
			
			if (s==60) {
				s=0;
				++m;
			}
			
			if (m==60) {
				m=0;
				++h;
			}
			actualizarLabel();
		}
	};
	private JButton btnIniciarReparacion;
	JLabel etiquetaTiempo = new JLabel("");
	
	private void actualizarLabel() {
		String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
		etiquetaTiempo.setText(tiempo);
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
		panel.setBackground(new Color(233, 196, 106));
		panel.setBounds(0, 0, 784, 45);
		frame.getContentPane().add(panel);
		
		JLabel lbl1 = new JLabel("Mec\u00E1nico");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lbl1.setBounds(325, 11, 77, 22);
		panel.add(lbl1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(233, 196, 106));
		panel_1.setBounds(10, 56, 314, 544);
		frame.getContentPane().add(panel_1);
		
		JLabel lbl2 = new JLabel("Trabajo asignado:");
		lbl2.setForeground(Color.BLACK);
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lbl2.setBounds(10, 11, 133, 26);
		panel_1.add(lbl2);
		
		JTextArea taTrabajoAsignado = new JTextArea();
		taTrabajoAsignado.setBounds(10, 36, 294, 373);
		panel_1.add(taTrabajoAsignado);
		
		btnIniciarReparacion = new JButton("Iniciar");
		btnIniciarReparacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.start();
				btnIniciarReparacion.setEnabled(false);
				btnIniciarReparacion.setText("Reanudar");
				btnPausar.setEnabled(true);
				btnTerminar.setEnabled(true);
				
			}
		});
		btnIniciarReparacion.setForeground(Color.WHITE);
		btnIniciarReparacion.setBackground(new Color(38, 70, 83));
		btnIniciarReparacion.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnIniciarReparacion.setBounds(20, 420, 265, 53);
		panel_1.add(btnIniciarReparacion);
		
		btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(t.isRunning()) {
					t.stop();
					btnIniciarReparacion.setEnabled(true);
				}
				btnIniciarReparacion.setText("Iniciar");
				btnPausar.setEnabled(false);
				btnTerminar.setEnabled(false);
				h=0; m=0; s=0; cs=0;
				actualizarLabel();
				
				
				MecanicoBotonTerminar mecanicoBotonTerminar = new MecanicoBotonTerminar();
				mecanicoBotonTerminar.setVisible(true);
					
			}
			
			
		});
		btnTerminar.setBackground(Color.WHITE);
		btnTerminar.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnTerminar.setBounds(20, 480, 265, 53);
		panel_1.add(btnTerminar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(38, 70, 83));
		panel_2.setBounds(334, 56, 440, 544);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea taObservacionesMecanico = new JTextArea();
		taObservacionesMecanico.setBounds(10, 207, 420, 326);
		panel_2.add(taObservacionesMecanico);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setForeground(Color.WHITE);
		lblObservaciones.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblObservaciones.setBounds(10, 175, 132, 21);
		panel_2.add(lblObservaciones);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 24, 420, 116);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		etiquetaTiempo.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N 
		etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		etiquetaTiempo.setText("00:00:00:00");
		
		etiquetaTiempo.setBounds(50, 33, 330, 59);
		panel_3.add(etiquetaTiempo);
		btnPausar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.stop();
				btnIniciarReparacion.setEnabled(true);
				btnPausar.setEnabled(false);
				
			}
		});
		
		
		btnPausar.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnPausar.setBackground(Color.WHITE);
		btnPausar.setBounds(298, 151, 132, 30);
		panel_2.add(btnPausar);
	}
}
