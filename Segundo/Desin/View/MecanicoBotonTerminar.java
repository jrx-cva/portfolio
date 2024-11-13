package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MecanicoBotonTerminar extends JFrame{

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfEmail;
	private JTextField tfDireccion;
	private JTextField tfTelefono;
	private JTextField tfDatosInteres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MecanicoBotonTerminar frame = new MecanicoBotonTerminar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MecanicoBotonTerminar() {
		getContentPane().setBackground(Color.WHITE);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 50, 800, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(233, 196, 106));
		panel.setBounds(0, 0, 784, 45);
		getContentPane().add(panel);
		
		JLabel lbl1 = new JLabel("Mec\u00E1nico");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lbl1.setBounds(325, 11, 77, 22);
		panel.add(lbl1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(233, 196, 106));
		panel_1.setBounds(10, 56, 314, 544);
		getContentPane().add(panel_1);
		
		JLabel lbl2 = new JLabel("Trabajo asignado:");
		lbl2.setForeground(Color.BLACK);
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lbl2.setBounds(10, 11, 133, 26);
		panel_1.add(lbl2);
		
		JTextArea taTrabajoAsignado = new JTextArea();
		taTrabajoAsignado.setBounds(10, 36, 294, 373);
		panel_1.add(taTrabajoAsignado);
		
		JButton btnIniciarReparacion = new JButton("Iniciar");
		btnIniciarReparacion.setForeground(Color.WHITE);
		btnIniciarReparacion.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnIniciarReparacion.setBackground(new Color(38, 70, 83));
		btnIniciarReparacion.setBounds(20, 420, 265, 53);
		panel_1.add(btnIniciarReparacion);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(contentPane, "Has acabado la tarea", "Cliente avisado!!", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnTerminar.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnTerminar.setBackground(Color.WHITE);
		btnTerminar.setBounds(20, 480, 265, 53);
		panel_1.add(btnTerminar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(38, 70, 83));
		panel_2.setBounds(334, 56, 440, 544);
		getContentPane().add(panel_2);
		
		JButton btnAvisar = new JButton("Avisar");
		btnAvisar.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnAvisar.setBackground(Color.WHITE);
		btnAvisar.setBounds(298, 489, 132, 30);
		panel_2.add(btnAvisar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 25, 420, 453);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblFoto = new JLabel("           (foto)");
		lblFoto.setForeground(Color.BLACK);
		lblFoto.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblFoto.setBorder(BorderFactory.createTitledBorder(""));
		lblFoto.setBackground(Color.WHITE);
		lblFoto.setBounds(10, 11, 113, 113);
		panel_3.add(lblFoto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNombre.setBounds(133, 91, 71, 16);
		panel_3.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(195, 87, 202, 27);
		panel_3.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblEmail.setBounds(10, 149, 71, 16);
		panel_3.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(75, 145, 323, 27);
		panel_3.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblDireccion.setBounds(10, 206, 71, 16);
		panel_3.add(lblDireccion);
		
		tfDireccion = new JTextField();
		tfDireccion.setBounds(74, 198, 323, 27);
		panel_3.add(tfDireccion);
		tfDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblTelefono.setBounds(10, 264, 71, 16);
		panel_3.add(lblTelefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setColumns(10);
		tfTelefono.setBounds(75, 253, 323, 27);
		panel_3.add(tfTelefono);
		
		JLabel lblDatosDeInteres = new JLabel("Datos de inter\u00E9s:");
		lblDatosDeInteres.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblDatosDeInteres.setBounds(10, 317, 150, 16);
		panel_3.add(lblDatosDeInteres);
		
		tfDatosInteres = new JTextField();
		tfDatosInteres.setColumns(10);
		tfDatosInteres.setBounds(10, 344, 400, 98);
		panel_3.add(tfDatosInteres);
	}

}
