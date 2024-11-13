package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * En esta vista se muestra la ventana principal de ventas
 */
public class Ventas extends JFrame {

	private JPanel contentPane;
	private JButton btnVerVehiculo;
	private JButton btnRegistrarVehiculo;
	private JButton btnRegistrarClientes;
	private JButton btnBuscarClientes;
	private JButton btnRealizarPropuesta;
	private JButton btnComprobarPropuesta;
	private JButton btnVolverVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas frame = new Ventas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233,196,106));
		panel.setBounds(10, 55, 117, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVehiculos = new JLabel("VEH\u00CDCULOS");
		lblVehiculos.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblVehiculos.setBounds(20, 11, 74, 14);
		panel.add(lblVehiculos);
		
		/**
		 * Botón ver vehículo
		 */
		btnVerVehiculo = new JButton("Ver");
		btnVerVehiculo.setBackground(Color.WHITE);
		btnVerVehiculo.setToolTipText("");
		btnVerVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //para que envíe al layout de verVehiculo
				VerVehiculo vervehiculo = new VerVehiculo();
				vervehiculo.setVisible(true);
			}

			
		});
		btnVerVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnVerVehiculo.setBounds(10, 54, 97, 37);
		panel.add(btnVerVehiculo);
		
		/***
		 * Botón registrar vehículo
		 */
		btnRegistrarVehiculo = new JButton("Registrar");
		btnRegistrarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarVehiculo registrarvehiculo = new RegistrarVehiculo();
				registrarvehiculo.setVisible(true);
			}
		});
		btnRegistrarVehiculo.setToolTipText("");
		btnRegistrarVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnRegistrarVehiculo.setBackground(Color.WHITE);
		btnRegistrarVehiculo.setBounds(10, 109, 97, 37);
		panel.add(btnRegistrarVehiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(156, 55, 117, 195);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(244,162,97));
		
		JLabel lblClientes = new JLabel("CLIENTES");
		lblClientes.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblClientes.setBounds(24, 11, 71, 14);
		panel_1.add(lblClientes);
		
		/**
		 * Botón registrar clientes
		 */
		btnRegistrarClientes = new JButton("Registrar");
		btnRegistrarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteNuevo clientenuevo = new ClienteNuevo();
				clientenuevo.setVisible(true);
			}
		});
		btnRegistrarClientes.setBackground(Color.WHITE);
		btnRegistrarClientes.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnRegistrarClientes.setBounds(10, 56, 97, 31);
		panel_1.add(btnRegistrarClientes);
		
		/**
		 * Botón buscar clientes
		 */
		btnBuscarClientes = new JButton("Buscar");
		btnBuscarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteBuscar clientebuscar = new ClienteBuscar();
				clientebuscar.setVisible(true);
			}
		});
		btnBuscarClientes.setBackground(Color.WHITE);
		btnBuscarClientes.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnBuscarClientes.setBounds(10, 114, 97, 31);
		panel_1.add(btnBuscarClientes);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(307, 55, 117, 195);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(231,111,81));
		
		JLabel lblVentas = new JLabel("VENTAS");
		lblVentas.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblVentas.setBounds(29, 11, 59, 14);
		panel_2.add(lblVentas);
		
		/**
		 * Botón realizar propuesta
		 */
		btnRealizarPropuesta = new JButton("Realizar propuesta");
		btnRealizarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RealizarPropuestaNueva realizarpropuesta = new RealizarPropuestaNueva();
				realizarpropuesta.setVisible(true);
			}
		});
		btnRealizarPropuesta.setBackground(Color.WHITE);
		btnRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnRealizarPropuesta.setBounds(10, 49, 97, 48);
		panel_2.add(btnRealizarPropuesta);
		
		/**
		 * Botón comprobar propuesta
		 */
		btnComprobarPropuesta = new JButton("Comprobar propuesta");
		btnComprobarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComprobarPropuesta comprobarpropuesta = new ComprobarPropuesta();
				comprobarpropuesta.setVisible(true);
			}
		});
		btnComprobarPropuesta.setBackground(Color.WHITE);
		btnComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnComprobarPropuesta.setBounds(10, 108, 97, 48);
		panel_2.add(btnComprobarPropuesta);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 434, 44);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(231,111,81));
		
		JLabel lblVentas2 = new JLabel("VENTAS");
		lblVentas2.setBounds(185, 11, 64, 23);
		lblVentas2.setForeground(Color.BLACK);
		lblVentas2.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel_3.add(lblVentas2);
		
		btnVolverVentas = new JButton("\uD83E\uDC60");
		btnVolverVentas.setForeground(Color.BLACK);
		btnVolverVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		btnVolverVentas.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverVentas.setBounds(10, 227, 50, 23);
		btnVolverVentas.setBackground(new Color(231,111,81));
		contentPane.add(btnVolverVentas);
	}
}
