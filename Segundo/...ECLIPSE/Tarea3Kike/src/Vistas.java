import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Vistas {

	private JFrame frame;
	private JTextField tfIdProfesor;
	private JTextField tfNIF;
	private JTextField tfNombre;
	private JTextField tfEspecialidad;
	private JTextField tfTelefono;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Vistas window = new Vistas();
					window.frame.setVisible(true);
					TestConexion.conectar();
					TestConexion.inicializar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vistas() {
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
		
		JLabel IdProfesor = new JLabel("IdProfesor");
		IdProfesor.setHorizontalAlignment(SwingConstants.RIGHT);
		IdProfesor.setBounds(51, 64, 58, 14);
		frame.getContentPane().add(IdProfesor);
		
		JLabel Nif = new JLabel("NIF");
		Nif.setHorizontalAlignment(SwingConstants.RIGHT);
		Nif.setBounds(51, 89, 58, 14);
		frame.getContentPane().add(Nif);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setHorizontalAlignment(SwingConstants.RIGHT);
		Nombre.setBounds(51, 114, 58, 14);
		frame.getContentPane().add(Nombre);
		
		JLabel Especialidad = new JLabel("Especialidad");
		Especialidad.setHorizontalAlignment(SwingConstants.RIGHT);
		Especialidad.setBounds(51, 139, 58, 14);
		frame.getContentPane().add(Especialidad);
		
		tfIdProfesor = new JTextField();
		tfIdProfesor.setEditable(false);
		tfIdProfesor.setBounds(119, 61, 86, 20);
		frame.getContentPane().add(tfIdProfesor);
		tfIdProfesor.setColumns(10);
		
		tfNIF = new JTextField();
		tfNIF.setBounds(119, 86, 86, 20);
		frame.getContentPane().add(tfNIF);
		tfNIF.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(119, 111, 86, 20);
		frame.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfEspecialidad = new JTextField();
		tfEspecialidad.setBounds(119, 136, 86, 20);
		frame.getContentPane().add(tfEspecialidad);
		tfEspecialidad.setColumns(10);
		
		JButton botonPrimero = new JButton("Primero");
		botonPrimero.addActionListener(new ActionListener() {
			/*
			 * Carga el primer Resulset y establece los textField con los datos recibidos
			 */
			public void actionPerformed(ActionEvent arg0) {
				TestConexion.cargarPrimero();
				tfIdProfesor.setText(Integer.toString(TestConexion.idProfesor));
				tfNIF.setText(TestConexion.nif);
				tfNombre.setText(TestConexion.nombre);
				tfEspecialidad.setText(TestConexion.especialidad);
				tfTelefono.setText(TestConexion.telefono);
				tfIdProfesor.setEditable(false);
			}
		});
		botonPrimero.setBounds(37, 199, 89, 23);
		frame.getContentPane().add(botonPrimero);
		
		JButton botonAnterior = new JButton("Anterior");
		botonAnterior.addActionListener(new ActionListener() {
			/*
			 * Carga el anterior Resulset y establece los textField con los datos recibidos
			 * comprobando antes si es el primero, en cuyo caso no hará nada
			 */
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (!TestConexion.esPrimero()) {
					TestConexion.cargarAnterior();
					tfIdProfesor.setText(Integer.toString(TestConexion.idProfesor));
					tfNIF.setText(TestConexion.nif);
					tfNombre.setText(TestConexion.nombre);
					tfEspecialidad.setText(TestConexion.especialidad);
					tfTelefono.setText(TestConexion.telefono);
					tfIdProfesor.setEditable(false);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		botonAnterior.setBounds(136, 199, 89, 23);
		frame.getContentPane().add(botonAnterior);
		
		JButton botonSiguiente = new JButton("Siguiente");
		botonSiguiente.addActionListener(new ActionListener() {
			/*
			 * Carga el siguiente Resulset y establece los textField con los datos recibidos
			 * comprobando antes si es el último, en cuyo caso no hará nada
			 */
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (!TestConexion.esFinal()) {
						TestConexion.cargarSiguiente();
						tfIdProfesor.setText(Integer.toString(TestConexion.idProfesor));
						tfNIF.setText(TestConexion.nif);
						tfNombre.setText(TestConexion.nombre);
						tfEspecialidad.setText(TestConexion.especialidad);
						tfTelefono.setText(TestConexion.telefono);
						tfIdProfesor.setEditable(false);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		botonSiguiente.setBounds(235, 199, 89, 23);
		frame.getContentPane().add(botonSiguiente);
		
		JButton botonUltimo = new JButton("\u00DAltimo");
		botonUltimo.addActionListener(new ActionListener() {
			/*
			 * Carga el último Resulset y establece los textField con los datos recibidos
			 */
			public void actionPerformed(ActionEvent arg0) {
				TestConexion.cargarUltimo();
				tfIdProfesor.setText(Integer.toString(TestConexion.idProfesor));
				tfNIF.setText(TestConexion.nif);
				tfNombre.setText(TestConexion.nombre);
				tfEspecialidad.setText(TestConexion.especialidad);
				tfTelefono.setText(TestConexion.telefono);
				tfIdProfesor.setEditable(false);
			}
		});
		botonUltimo.setBounds(334, 199, 89, 23);
		frame.getContentPane().add(botonUltimo);
		
		JButton botonNuevoRegistro = new JButton("NuevoRegistro");
		botonNuevoRegistro.addActionListener(new ActionListener() {
			/*
			 * Reestablece los textField y activa la función nuevo(boolean usado en guardar)
			 * además permite editar el campo IdProfesor
			 */
			public void actionPerformed(ActionEvent arg0) {
				tfIdProfesor.setText("");
				tfNIF.setText("");
				tfNombre.setText("");
				tfEspecialidad.setText("");
				tfTelefono.setText("");
				TestConexion.nuevo();
				tfIdProfesor.setEditable(true);
							
			}
		});
		botonNuevoRegistro.setBounds(283, 60, 117, 23);
		frame.getContentPane().add(botonNuevoRegistro);
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			/*
			 * Primero pide la comprobación de si existe o no ese IdProfesor (por si quiere hacer un insert)
			 * Si no hay ningún campo vacío, ejecuta Guardar y posteriormente cambia el primero
			 * y establece los textFields con los valores adecuados (al primer resulset)
			 */
			public void actionPerformed(ActionEvent arg0) {
				TestConexion.comprobarId(tfIdProfesor.getText());
				if (tfIdProfesor.getText() != "" & tfNIF.getText() != "" & tfNombre.getText() != ""
						& tfEspecialidad.getText() != "" & tfTelefono.getText() != "" ) {
					TestConexion.guardar(tfIdProfesor.getText(), tfNIF.getText(),
							tfNombre.getText(), tfEspecialidad.getText(), tfTelefono.getText());
				}
				TestConexion.cargarPrimero();
				tfIdProfesor.setText(Integer.toString(TestConexion.idProfesor));
				tfNIF.setText(TestConexion.nif);
				tfNombre.setText(TestConexion.nombre);
				tfEspecialidad.setText(TestConexion.especialidad);
				tfTelefono.setText(TestConexion.telefono);
				tfIdProfesor.setEditable(false);
			}
		});
		botonGuardar.setBounds(283, 105, 117, 23);
		frame.getContentPane().add(botonGuardar);
		
		JLabel Telefono = new JLabel("Telefono");
		Telefono.setBounds(51, 164, 58, 14);
		frame.getContentPane().add(Telefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(119, 161, 86, 20);
		frame.getContentPane().add(tfTelefono);
		tfTelefono.setColumns(10);
	}
}
