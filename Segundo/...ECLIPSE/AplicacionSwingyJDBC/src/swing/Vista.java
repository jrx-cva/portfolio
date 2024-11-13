package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import bbdd.Conexion;

public class Vista {

	private JFrame frame;
	private JTextField tfEspecialidad;
	private JTextField tfTelefono;
	private JTextField tfNif;
	private JTextField tfNombre;
	private JButton btnPrimero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
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
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Id Profesor:");
		lbl1.setBounds(26, 36, 64, 20);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Nombre:");
		lbl2.setBounds(26, 67, 46, 14);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("Especialidad:");
		lbl3.setBounds(26, 93, 75, 14);
		frame.getContentPane().add(lbl3);
		
		JLabel lbl4 = new JLabel("Telefono:");
		lbl4.setBounds(26, 118, 64, 14);
		frame.getContentPane().add(lbl4);
		
		JLabel lbl5 = new JLabel("NIF:");
		lbl5.setBounds(26, 143, 46, 14);
		frame.getContentPane().add(lbl5);
		
		btnPrimero = new JButton("Primero");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				
			}
		});
		btnPrimero.setBackground(Color.WHITE);
		btnPrimero.setBounds(10, 193, 80, 57);
		frame.getContentPane().add(btnPrimero);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBackground(Color.WHITE);
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnterior.setBounds(92, 193, 75, 57);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setBounds(169, 193, 80, 57);
		frame.getContentPane().add(btnSiguiente);
		
		JButton btnUltimo = new JButton("\u00DAltimo");
		btnUltimo.setBackground(Color.WHITE);
		btnUltimo.setBounds(252, 193, 75, 57);
		frame.getContentPane().add(btnUltimo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(Color.WHITE);
		btnGuardar.setBounds(335, 193, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBackground(Color.WHITE);
		btnNuevo.setBounds(335, 167, 89, 23);
		frame.getContentPane().add(btnNuevo);
		
		tfEspecialidad = new JTextField();
		tfEspecialidad.setBounds(102, 90, 225, 20);
		frame.getContentPane().add(tfEspecialidad);
		tfEspecialidad.setColumns(10);
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(102, 115, 225, 20);
		frame.getContentPane().add(tfTelefono);
		tfTelefono.setColumns(10);
		
		tfNif = new JTextField();
		tfNif.setBounds(102, 140, 225, 20);
		frame.getContentPane().add(tfNif);
		tfNif.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(102, 64, 225, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblIdProfesor = new JLabel("");
		lblIdProfesor.setBounds(92, 36, 235, 17);
		frame.getContentPane().add(lblIdProfesor);
	}
}
