package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Clientes;
import clases.Propuesta;
import dao.CompruebaPropuesta;
import dao.GestionUsuario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Carmen
 *
 */
public class ComprobarPropuesta extends JFrame {

	private JPanel contentPane;
	private JButton btnComprobarPropuesta;
	private JTextField tfClienteComprobarPropuesta;
	private JButton btnVolverComprobarPropuesta;
	private JTextField tfEmpleadoComprobarPropuesta;
	private JTextField tfCocheComprobarPropuesta;
	private JTextField tfFechaValidezComprobarPropuesta;
	private JTextField tfPrecioComprobarPropuesta;
	private JTextField tfFechaPropuestaComprobarPropuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComprobarPropuesta frame = new ComprobarPropuesta();
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
	public ComprobarPropuesta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(231,111,81));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 44);
		contentPane.add(panel);
		
		JLabel lblComprobarPropuesta = new JLabel("Comprobar propuesta");
		lblComprobarPropuesta.setForeground(Color.BLACK);
		lblComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblComprobarPropuesta.setBounds(308, 11, 165, 22);
		panel.add(lblComprobarPropuesta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(25, 103, 735, 483);
		contentPane.add(panel_1);
		
		JLabel lbl21 = new JLabel("Cliente:");
		lbl21.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl21.setBounds(32, 61, 71, 16);
		panel_1.add(lbl21);
		
		JLabel lbl22 = new JLabel("Empleado:");
		lbl22.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl22.setBounds(32, 117, 71, 16);
		panel_1.add(lbl22);
		
		JLabel lbl25 = new JLabel("Precio total:");
		lbl25.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl25.setBounds(32, 352, 84, 16);
		panel_1.add(lbl25);
		
		JLabel lbl23 = new JLabel("Coche:");
		lbl23.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl23.setBounds(32, 194, 55, 16);
		panel_1.add(lbl23);
		
		JLabel lbl24 = new JLabel("Fech validez:");
		lbl24.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl24.setBounds(32, 281, 89, 16);
		panel_1.add(lbl24);
		
		btnComprobarPropuesta = new JButton("Ok");
		btnComprobarPropuesta.setForeground(Color.WHITE);
		btnComprobarPropuesta.setBackground(new Color(231,111,81));
		btnComprobarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprobar();
				
				
				
				 
			}

			private void comprobar() {
				// TODO Auto-generated method stub
				String nombre_usuario = tfClienteComprobarPropuesta.getText();
				
				//instanciar clase gestionUsuario
				CompruebaPropuesta comprobarpropuesta = new CompruebaPropuesta();
				
				Propuesta propuesta2 = new Propuesta();
				propuesta2.setNombre_usuario(nombre_usuario);
				
				Propuesta pro = comprobarpropuesta.obtenerPropuesta(propuesta2);
				
				if (pro != null) {
					JOptionPane.showMessageDialog(contentPane, "ok");
					tfClienteComprobarPropuesta.setText(pro.getIdCliente().toString());
					tfEmpleadoComprobarPropuesta.setText(pro.getNombre_usuario());
					tfCocheComprobarPropuesta.setText(pro.getIdVehiculo().toString());
					tfPrecioComprobarPropuesta.setText(pro.getPrecioPropuesta().toString());
					tfFechaValidezComprobarPropuesta.setText(pro.getFechaValidez());
					tfFechaPropuestaComprobarPropuesta.setText(pro.getFechaPropuesta());
					
					
				} else {
					JOptionPane.showMessageDialog(contentPane, "No existe tal propuesta", "Error", JOptionPane.ERROR_MESSAGE);

				}
						
						
						
					
			}

			
		});
		btnComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//btnComprobarPropuesta.setBackground(Color.WHITE);
		btnComprobarPropuesta.setBounds(620, 411, 105, 54);
		panel_1.add(btnComprobarPropuesta);
		
		tfClienteComprobarPropuesta = new JTextField();
		tfClienteComprobarPropuesta.setBackground(Color.WHITE);
		tfClienteComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfClienteComprobarPropuesta.setBounds(113, 55, 612, 28);
		panel_1.add(tfClienteComprobarPropuesta);
		tfClienteComprobarPropuesta.setColumns(10);
		
		btnVolverComprobarPropuesta = new JButton("\uD83E\uDC60");
		btnVolverComprobarPropuesta.setForeground(Color.WHITE);
		btnVolverComprobarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		//btnVolverComprobarPropuesta.setBackground(Color.WHITE);
		btnVolverComprobarPropuesta.setBackground(new Color(231,111,81));
		btnVolverComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverComprobarPropuesta.setBounds(32, 411, 105, 54);
		panel_1.add(btnVolverComprobarPropuesta);
		
		tfEmpleadoComprobarPropuesta = new JTextField();
		tfEmpleadoComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfEmpleadoComprobarPropuesta.setBackground(Color.WHITE);
		tfEmpleadoComprobarPropuesta.setBounds(113, 111, 612, 28);
		panel_1.add(tfEmpleadoComprobarPropuesta);
		tfEmpleadoComprobarPropuesta.setColumns(10);
		
		tfCocheComprobarPropuesta = new JTextField();
		tfCocheComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfCocheComprobarPropuesta.setBounds(113, 173, 612, 59);
		panel_1.add(tfCocheComprobarPropuesta);
		tfCocheComprobarPropuesta.setColumns(10);
		
		tfFechaValidezComprobarPropuesta = new JTextField();
		tfFechaValidezComprobarPropuesta.setBackground(Color.WHITE);
		tfFechaValidezComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfFechaValidezComprobarPropuesta.setBounds(113, 275, 206, 28);
		panel_1.add(tfFechaValidezComprobarPropuesta);
		tfFechaValidezComprobarPropuesta.setColumns(10);
		
		tfPrecioComprobarPropuesta = new JTextField();
		tfPrecioComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfPrecioComprobarPropuesta.setBackground(Color.WHITE);
		tfPrecioComprobarPropuesta.setBounds(113, 347, 502, 53);
		panel_1.add(tfPrecioComprobarPropuesta);
		tfPrecioComprobarPropuesta.setColumns(10);
		
		JLabel lbl245 = new JLabel("Fecha propuesta:");
		lbl245.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl245.setBounds(349, 281, 105, 16);
		panel_1.add(lbl245);
		
		tfFechaPropuestaComprobarPropuesta = new JTextField();
		tfFechaPropuestaComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfFechaPropuestaComprobarPropuesta.setColumns(10);
		tfFechaPropuestaComprobarPropuesta.setBackground(Color.WHITE);
		tfFechaPropuestaComprobarPropuesta.setBounds(454, 275, 271, 28);
		panel_1.add(tfFechaPropuestaComprobarPropuesta);
	}
}
