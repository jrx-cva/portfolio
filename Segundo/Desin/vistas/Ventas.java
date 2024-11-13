package vistas;

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

/**
 * 
 * @author Carmen
 *
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
		setBounds(100, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233,196,106));
		panel.setBounds(10, 55, 222, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblVehiculos = new JLabel("VEH\u00CDCULOS");
		lblVehiculos.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblVehiculos.setBounds(60, 34, 98, 27);
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
		btnVerVehiculo.setBounds(10, 154, 202, 88);
		panel.add(btnVerVehiculo);
		btnRegistrarVehiculo = new JButton("Registrar");
		btnRegistrarVehiculo.setBounds(10, 253, 202, 88);
		panel.add(btnRegistrarVehiculo);
		btnRegistrarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarVehiculo registrarvehiculo = new RegistrarVehiculo();
				registrarvehiculo.setVisible(true);
			}
		});
		btnRegistrarVehiculo.setToolTipText("");
		btnRegistrarVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnRegistrarVehiculo.setBackground(Color.WHITE);
		
		/***
		 * Botón registrar vehículo
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(271, 55, 222, 484);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(244,162,97));
		
		JLabel lblClientes = new JLabel("CLIENTES");
		lblClientes.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblClientes.setBounds(65, 37, 85, 29);
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
		btnRegistrarClientes.setBounds(10, 156, 202, 88);
		panel_1.add(btnRegistrarClientes);
		btnBuscarClientes = new JButton("Buscar");
		btnBuscarClientes.setBounds(10, 253, 202, 88);
		panel_1.add(btnBuscarClientes);
		btnBuscarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteBuscar clientebuscar = new ClienteBuscar();
				clientebuscar.setVisible(true);
			}
		});
		btnBuscarClientes.setBackground(Color.WHITE);
		btnBuscarClientes.setFont(new Font("SansSerif", Font.PLAIN, 13));
		
		/**
		 * Botón buscar clientes
		 */
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(530, 55, 222, 484);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(231,111,81));
		
		JLabel lblVentas = new JLabel("VENTAS");
		lblVentas.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblVentas.setBounds(81, 36, 85, 33);
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
		btnRealizarPropuesta.setBounds(10, 155, 202, 88);
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
		btnComprobarPropuesta.setBounds(10, 254, 202, 88);
		panel_2.add(btnComprobarPropuesta);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 784, 44);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(231,111,81));
		
		JLabel lblVentas2 = new JLabel("VENTAS");
		lblVentas2.setBounds(359, 11, 64, 23);
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
		btnVolverVentas.setBounds(10, 549, 78, 51);
		btnVolverVentas.setBackground(new Color(231,111,81));
		contentPane.add(btnVolverVentas);
	}
}
