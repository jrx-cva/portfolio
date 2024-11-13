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

/**
 * 
 * @author Carmen
 *
 */
public class VerVehiculo extends JFrame {

	private JPanel contentPane;
	private JButton btnOkVerVehiculos;
	private JTextField tfNumBastidorVerVehiculo;
	private JButton btnVolverVerVehiculo;
	private JTextField tfMatricula;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JTextField tfTipoVehiculo;
	private JTextField tfColor;
	private JTextField tfPotencia;
	private JTextField tfAño;
	private JTextField tfCombustible;
	private JTextField tfPrecio;
	private JTextField tfDescripcion;

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
		setBounds(100, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 44);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblVerVehiculo = new JLabel("Ver veh\u00EDculo");
		lblVerVehiculo.setBounds(338, 11, 98, 23);
		lblVerVehiculo.setForeground(Color.BLACK);
		lblVerVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel.add(lblVerVehiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(21, 55, 742, 427);
		contentPane.setBackground(new Color(233,196,106));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("N\u00FAmero de bastidor:");
		lbl1.setBounds(10, 26, 113, 16);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel_1.add(lbl1);
		
		JLabel lbl2 = new JLabel("Matr\u00EDcula:");
		lbl2.setBounds(10, 90, 113, 16);
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel_1.add(lbl2);
		
		JLabel lbl3 = new JLabel("Marca:");
		lbl3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl3.setBounds(10, 155, 113, 14);
		panel_1.add(lbl3);
		
		JLabel lbl4 = new JLabel("Modelo:");
		lbl4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl4.setBounds(10, 229, 113, 14);
		panel_1.add(lbl4);
		
		JLabel lbl5 = new JLabel("Tipo de vehiculo:");
		lbl5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl5.setBounds(10, 302, 113, 14);
		panel_1.add(lbl5);
		
		JLabel lbl6 = new JLabel("Color:");
		lbl6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl6.setBounds(384, 27, 113, 14);
		panel_1.add(lbl6);
		
		JLabel lbl7 = new JLabel("Potencia:");
		lbl7.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl7.setBounds(384, 86, 113, 14);
		panel_1.add(lbl7);
		
		JLabel lbl8 = new JLabel("A\u00F1o:");
		lbl8.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl8.setBounds(384, 155, 113, 14);
		panel_1.add(lbl8);
		
		JLabel lbl9 = new JLabel("Combustible:");
		lbl9.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl9.setBounds(384, 229, 113, 14);
		panel_1.add(lbl9);
		
		JLabel lbl10 = new JLabel("Precio:");
		lbl10.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl10.setBounds(384, 302, 113, 14);
		panel_1.add(lbl10);
		
		JLabel lbl11 = new JLabel("Descripci\u00F3n:");
		lbl11.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl11.setBounds(26, 378, 69, 14);
		panel_1.add(lbl11);
		
		tfNumBastidorVerVehiculo = new JTextField();
		tfNumBastidorVerVehiculo.setBackground(Color.WHITE);
		tfNumBastidorVerVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfNumBastidorVerVehiculo.setBounds(148, 20, 226, 29);
		panel_1.add(tfNumBastidorVerVehiculo);
		tfNumBastidorVerVehiculo.setColumns(10);
		
		tfMatricula = new JTextField();
		tfMatricula.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfMatricula.setColumns(10);
		tfMatricula.setBackground(Color.WHITE);
		tfMatricula.setBounds(148, 79, 226, 29);
		panel_1.add(tfMatricula);
		
		tfMarca = new JTextField();
		tfMarca.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfMarca.setColumns(10);
		tfMarca.setBackground(Color.WHITE);
		tfMarca.setBounds(148, 148, 226, 29);
		panel_1.add(tfMarca);
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfModelo.setColumns(10);
		tfModelo.setBackground(Color.WHITE);
		tfModelo.setBounds(148, 217, 226, 29);
		panel_1.add(tfModelo);
		
		tfTipoVehiculo = new JTextField();
		tfTipoVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfTipoVehiculo.setColumns(10);
		tfTipoVehiculo.setBackground(Color.WHITE);
		tfTipoVehiculo.setBounds(148, 290, 226, 29);
		panel_1.add(tfTipoVehiculo);
		
		tfColor = new JTextField();
		tfColor.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfColor.setColumns(10);
		tfColor.setBackground(Color.WHITE);
		tfColor.setBounds(469, 20, 263, 29);
		panel_1.add(tfColor);
		
		tfPotencia = new JTextField();
		tfPotencia.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfPotencia.setColumns(10);
		tfPotencia.setBackground(Color.WHITE);
		tfPotencia.setBounds(469, 79, 263, 29);
		panel_1.add(tfPotencia);
		
		tfAño = new JTextField();
		tfAño.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfAño.setColumns(10);
		tfAño.setBackground(Color.WHITE);
		tfAño.setBounds(469, 148, 263, 29);
		panel_1.add(tfAño);
		
		tfCombustible = new JTextField();
		tfCombustible.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfCombustible.setColumns(10);
		tfCombustible.setBackground(Color.WHITE);
		tfCombustible.setBounds(469, 217, 263, 29);
		panel_1.add(tfCombustible);
		
		tfPrecio = new JTextField();
		tfPrecio.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfPrecio.setColumns(10);
		tfPrecio.setBackground(Color.WHITE);
		tfPrecio.setBounds(469, 290, 263, 29);
		panel_1.add(tfPrecio);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfDescripcion.setColumns(10);
		tfDescripcion.setBackground(Color.WHITE);
		tfDescripcion.setBounds(148, 354, 584, 62);
		panel_1.add(tfDescripcion);
		
		/**
		 * Botón que pulsa para buscar vehículos
		 */
		btnOkVerVehiculos = new JButton("Buscar");
		btnOkVerVehiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscar();
			}

			private void buscar() {
				// TODO Auto-generated method stub
				String numero_bastidor = tfNumBastidorVerVehiculo.getText();
				
				//instancia clase BusquedaVehiculo
				BusquedaVehiculo busquedavehiculo = new BusquedaVehiculo();
				
				Vehiculo vehiculo2 = new Vehiculo();
				vehiculo2.setNumBastidor(numero_bastidor);
								
				Vehiculo vehi = busquedavehiculo.obtenerVehiculo(vehiculo2);
				
				if (vehi != null) {
					JOptionPane.showMessageDialog(contentPane, "Okay");
					tfMatricula.setText(vehi.getMatricula());
					tfMarca.setText(vehi.getMarca());
					tfModelo.setText(vehi.getModelo());
					tfTipoVehiculo.setText(vehi.getTipoVehiculo());
					tfColor.setText(vehi.getColor());
					tfPotencia.setText(vehi.getPotencia());
					tfAño.setText(vehi.getAnio());
					tfCombustible.setText(vehi.getCombustible());
					tfPrecio.setText(vehi.getPrecio().toString());
					tfDescripcion.setText(vehi.getDescripcionVeehiculo());
					
				} else
					JOptionPane.showMessageDialog(contentPane, "No hay ningún coche");
				
				
			}
		});
		btnOkVerVehiculos.setBackground(Color.WHITE);
		btnOkVerVehiculos.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnOkVerVehiculos.setBounds(662, 511, 101, 51);
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
		btnVolverVerVehiculo.setBounds(21, 511, 101, 61);
		contentPane.add(btnVolverVerVehiculo);
		
		
	}
}
