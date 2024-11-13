package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.BusquedaVehiculo;
import Models.Vehiculo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/*
 * En esta vista tenemos la ficha del vehículo y a través del número de bastidor mostramos el vehículo.
 */
public class VerVehiculo extends JFrame {

	private JPanel contentPane;
	private JButton btnOkVerVehiculos;
	private JTextField tfNumBastidorVerVehiculo;
	private JButton btnVolverVerVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerVehiculo frame = new VerVehiculo();
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
	public VerVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblVerVehiculo = new JLabel("Ver veh\u00EDculo");
		lblVerVehiculo.setBounds(171, 11, 98, 23);
		lblVerVehiculo.setForeground(Color.BLACK);
		lblVerVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel.add(lblVerVehiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(21, 55, 390, 166);
		contentPane.setBackground(new Color(233,196,106));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("N\u00FAmero de bastidor:");
		lbl1.setBounds(10, 11, 113, 16);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel_1.add(lbl1);
		
		JLabel lbl2 = new JLabel("Matr\u00EDcula:");
		lbl2.setBounds(10, 38, 113, 16);
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel_1.add(lbl2);
		
		JLabel lbl3 = new JLabel("Marca:");
		lbl3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl3.setBounds(10, 65, 113, 14);
		panel_1.add(lbl3);
		
		JLabel lbl4 = new JLabel("Modelo:");
		lbl4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl4.setBounds(10, 90, 113, 14);
		panel_1.add(lbl4);
		
		JLabel lbl5 = new JLabel("Tipo de vehiculo:");
		lbl5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl5.setBounds(10, 115, 113, 14);
		panel_1.add(lbl5);
		
		JLabel lblMatricula = new JLabel("");
		lblMatricula.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblMatricula.setBounds(148, 40, 53, 14);
		lblMatricula.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblMatricula);
		
		JLabel lblMarca = new JLabel("");
		lblMarca.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblMarca.setBounds(148, 65, 53, 14);
		lblMarca.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblMarca);
		
		JLabel lblModelo = new JLabel("");
		lblModelo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblModelo.setBounds(148, 90, 53, 14);
		lblModelo.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblModelo);
		
		JLabel lblTipo_vehiculo = new JLabel("");
		lblTipo_vehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblTipo_vehiculo.setBounds(148, 115, 53, 14);
		lblTipo_vehiculo.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblTipo_vehiculo);
		
		JLabel lbl6 = new JLabel("Color:");
		lbl6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl6.setBounds(211, 13, 113, 14);
		panel_1.add(lbl6);
		
		JLabel lbl7 = new JLabel("Potencia:");
		lbl7.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl7.setBounds(211, 40, 113, 14);
		panel_1.add(lbl7);
		
		JLabel lbl8 = new JLabel("A\u00F1o:");
		lbl8.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl8.setBounds(211, 66, 113, 14);
		panel_1.add(lbl8);
		
		JLabel lbl9 = new JLabel("Combustible:");
		lbl9.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl9.setBounds(211, 91, 113, 14);
		panel_1.add(lbl9);
		
		JLabel lbl10 = new JLabel("Precio:");
		lbl10.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl10.setBounds(211, 116, 113, 14);
		panel_1.add(lbl10);
		
		JLabel lblColor = new JLabel("");
		lblColor.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblColor.setBackground(Color.WHITE);
		lblColor.setBounds(334, 11, 46, 14);
		lblColor.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblColor);
		
		JLabel lblPotencia = new JLabel("");
		lblPotencia.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblPotencia.setBackground(Color.WHITE);
		lblPotencia.setBounds(334, 40, 46, 14);
		lblPotencia.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblPotencia);
		
		JLabel lblAnio = new JLabel("");
		lblAnio.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblAnio.setBackground(Color.WHITE);
		lblAnio.setBounds(334, 65, 46, 14);
		lblAnio.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblAnio);
		
		JLabel lblCombustible = new JLabel("");
		lblCombustible.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblCombustible.setBackground(Color.WHITE);
		lblCombustible.setBounds(334, 90, 46, 14);
		lblCombustible.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblCombustible);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblPrecio.setBackground(Color.WHITE);
		lblPrecio.setBounds(334, 115, 46, 14);
		lblPrecio.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblPrecio);
		
		JLabel lbl11 = new JLabel("Descripci\u00F3n:");
		lbl11.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl11.setBounds(10, 140, 69, 14);
		panel_1.add(lbl11);
		
		JLabel lblDescripcion_vehiculo = new JLabel("");
		lblDescripcion_vehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblDescripcion_vehiculo.setBounds(91, 140, 289, 15);
		lblDescripcion_vehiculo.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblDescripcion_vehiculo);
		
		tfNumBastidorVerVehiculo = new JTextField();
		tfNumBastidorVerVehiculo.setBackground(Color.WHITE);
		tfNumBastidorVerVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfNumBastidorVerVehiculo.setBounds(148, 9, 53, 20);
		panel_1.add(tfNumBastidorVerVehiculo);
		tfNumBastidorVerVehiculo.setColumns(10);
		
		/**
		 * Botón que pulsa para buscar vehículos
		 */
		btnOkVerVehiculos = new JButton("Buscar");
		btnOkVerVehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}

			private void buscar() {
				String numero_bastidor = tfNumBastidorVerVehiculo.getText();
				
				//instancia clase BusquedaVehiculo
				BusquedaVehiculo busquedavehiculo = new BusquedaVehiculo();
				
				Vehiculo vehiculo2 = new Vehiculo();
				vehiculo2.setNumBastidor(numero_bastidor);
								
				Vehiculo vehi = busquedavehiculo.obtenerVehiculo(vehiculo2);
				
				if (vehi != null) {
					JOptionPane.showMessageDialog(contentPane, "Okay");
					lblMatricula.setText(vehi.getMatricula());
				} else
					JOptionPane.showMessageDialog(contentPane, "No hay ningún coche");
				
				
			}
		});
		btnOkVerVehiculos.setBackground(Color.WHITE);
		btnOkVerVehiculos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnOkVerVehiculos.setBounds(325, 227, 86, 23);
		contentPane.add(btnOkVerVehiculos);
		
		btnVolverVerVehiculo = new JButton("\uD83E\uDC60");
		btnVolverVerVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		btnVolverVerVehiculo.setBackground(Color.WHITE);
		btnVolverVerVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverVerVehiculo.setBounds(20, 227, 51, 23);
		contentPane.add(btnVolverVerVehiculo);
		
		
	}
}
