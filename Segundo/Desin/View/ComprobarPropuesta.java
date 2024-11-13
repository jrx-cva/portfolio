package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CompruebaPropuesta;
import DAO.GestionUsuario;
import Models.Clientes;
import Models.Propuesta;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * En esta vista se busca las propuestas ya almacenadas en la BD.
 */
public class ComprobarPropuesta extends JFrame {

	private JPanel contentPane;
	private JButton btnComprobarPropuesta;
	private JTextField tfClienteComprobarPropuesta;
	private JButton btnVolverComprobarPropuesta;
	private JTextField tfEmpleadoComprobarPropuesta;
	private JTextField tfCocheComprobarPropuesta;
	private JTextField tfTipoCocheComprobarPropuesta;
	private JTextField tfPrecioComprobarPropuesta;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(231,111,81));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 44);
		contentPane.add(panel);
		
		JLabel lblComprobarPropuesta = new JLabel("Comprobar propuesta");
		lblComprobarPropuesta.setForeground(Color.BLACK);
		lblComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblComprobarPropuesta.setBounds(140, 11, 165, 22);
		panel.add(lblComprobarPropuesta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(25, 58, 379, 192);
		contentPane.add(panel_1);
		
		JLabel lbl21 = new JLabel("Cliente:");
		lbl21.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl21.setBounds(22, 13, 71, 16);
		panel_1.add(lbl21);
		
		JLabel lbl22 = new JLabel("Empleado:");
		lbl22.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl22.setBounds(22, 40, 71, 16);
		panel_1.add(lbl22);
		
		JLabel lbl25 = new JLabel("Precio total:");
		lbl25.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl25.setBounds(22, 121, 84, 16);
		panel_1.add(lbl25);
		
		JLabel lbl23 = new JLabel("Coche:");
		lbl23.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl23.setBounds(22, 67, 55, 16);
		panel_1.add(lbl23);
		
		JLabel lbl24 = new JLabel("Tipo de coche:");
		lbl24.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl24.setBounds(22, 94, 89, 16);
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
				propuesta2.setNombreUsuario(nombre_usuario);
				
				Propuesta pro = comprobarpropuesta.obtenerPropuesta(propuesta2);
				
				if (pro != null) {
					JOptionPane.showMessageDialog(contentPane, "ok");
				} else {
					JOptionPane.showMessageDialog(contentPane, "No existe tal propuesta", "Error", JOptionPane.ERROR_MESSAGE);

				}
						
						
						
					
			}

			
		});
		btnComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//btnComprobarPropuesta.setBackground(Color.WHITE);
		btnComprobarPropuesta.setBounds(292, 158, 77, 23);
		panel_1.add(btnComprobarPropuesta);
		
		tfClienteComprobarPropuesta = new JTextField();
		tfClienteComprobarPropuesta.setBackground(Color.WHITE);
		tfClienteComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfClienteComprobarPropuesta.setBounds(103, 12, 266, 20);
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
		btnVolverComprobarPropuesta.setBounds(22, 158, 48, 23);
		panel_1.add(btnVolverComprobarPropuesta);
		
		tfEmpleadoComprobarPropuesta = new JTextField();
		tfEmpleadoComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfEmpleadoComprobarPropuesta.setBackground(Color.WHITE);
		tfEmpleadoComprobarPropuesta.setBounds(103, 39, 266, 20);
		panel_1.add(tfEmpleadoComprobarPropuesta);
		tfEmpleadoComprobarPropuesta.setColumns(10);
		
		tfCocheComprobarPropuesta = new JTextField();
		tfCocheComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfCocheComprobarPropuesta.setBounds(103, 66, 266, 20);
		panel_1.add(tfCocheComprobarPropuesta);
		tfCocheComprobarPropuesta.setColumns(10);
		
		tfTipoCocheComprobarPropuesta = new JTextField();
		tfTipoCocheComprobarPropuesta.setBackground(Color.WHITE);
		tfTipoCocheComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfTipoCocheComprobarPropuesta.setBounds(103, 93, 266, 20);
		panel_1.add(tfTipoCocheComprobarPropuesta);
		tfTipoCocheComprobarPropuesta.setColumns(10);
		
		tfPrecioComprobarPropuesta = new JTextField();
		tfPrecioComprobarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfPrecioComprobarPropuesta.setBackground(Color.WHITE);
		tfPrecioComprobarPropuesta.setBounds(103, 121, 185, 36);
		panel_1.add(tfPrecioComprobarPropuesta);
		tfPrecioComprobarPropuesta.setColumns(10);
	}

}
