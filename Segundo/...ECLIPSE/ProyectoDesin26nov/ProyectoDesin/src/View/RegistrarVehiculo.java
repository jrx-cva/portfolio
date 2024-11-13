package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Carmen
 *
 */
public class RegistrarVehiculo extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumeroBastidor;
	private JTextField tfMatricula;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JTextField tfTipoVehiculo;
	private JTextField tfColor;
	private JTextField tfPotencia;
	private JTextField tfAnio;
	private JTextField tfCombustible;
	private JTextField tfDescripcion;
	private JButton btnRegistrarVehiculo;
	private JButton btnVolverRegistrarVehiculo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarVehiculo frame = new RegistrarVehiculo();
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
	public RegistrarVehiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 44);
		contentPane.add(panel);
		contentPane.setBackground(new Color(233,196,106));
		
		JLabel lblRegistrarVehiculo = new JLabel("Registrar veh\u00EDculo");
		lblRegistrarVehiculo.setForeground(Color.BLACK);
		lblRegistrarVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblRegistrarVehiculo.setBounds(327, 11, 131, 23);
		panel.add(lblRegistrarVehiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(24, 71, 750, 431);
		contentPane.add(panel_1);
		
		JLabel lbl1 = new JLabel("N\u00FAmero de bastidor:");
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl1.setBounds(10, 37, 113, 16);
		panel_1.add(lbl1);
		
		JLabel lbl2 = new JLabel("Matr\u00EDcula:");
		lbl2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl2.setBounds(10, 211, 113, 16);
		panel_1.add(lbl2);
		
		JLabel lbl3 = new JLabel("Marca:");
		lbl3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl3.setBounds(10, 84, 113, 14);
		panel_1.add(lbl3);
		
		JLabel lbl4 = new JLabel("Modelo:");
		lbl4.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl4.setBounds(10, 147, 113, 14);
		panel_1.add(lbl4);
		
		JLabel lbl5 = new JLabel("Tipo de vehiculo:");
		lbl5.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl5.setBounds(10, 257, 113, 14);
		panel_1.add(lbl5);
		
		JLabel lbl6 = new JLabel("Color:");
		lbl6.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl6.setBounds(366, 38, 127, 14);
		panel_1.add(lbl6);
		
		JLabel lbl7 = new JLabel("Potencia:");
		lbl7.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl7.setBounds(366, 147, 62, 14);
		panel_1.add(lbl7);
		
		JLabel lbl8 = new JLabel("A\u00F1o:");
		lbl8.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl8.setBounds(366, 88, 69, 14);
		panel_1.add(lbl8);
		
		JLabel lbl9 = new JLabel("Combustible:");
		lbl9.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl9.setBounds(366, 212, 89, 14);
		panel_1.add(lbl9);
		
		JLabel lbl11 = new JLabel("Descripci\u00F3n:");
		lbl11.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl11.setBounds(317, 257, 69, 14);
		panel_1.add(lbl11);
		
		tfNumeroBastidor = new JTextField();
		tfNumeroBastidor.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfNumeroBastidor.setBounds(133, 31, 218, 28);
		panel_1.add(tfNumeroBastidor);
		tfNumeroBastidor.setColumns(10);
		
		tfMatricula = new JTextField();
		tfMatricula.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfMatricula.setColumns(10);
		tfMatricula.setBounds(133, 205, 218, 28);
		panel_1.add(tfMatricula);
		
		tfMarca = new JTextField();
		tfMarca.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfMarca.setColumns(10);
		tfMarca.setBounds(133, 81, 218, 28);
		panel_1.add(tfMarca);
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfModelo.setColumns(10);
		tfModelo.setBounds(133, 141, 218, 30);
		panel_1.add(tfModelo);
		
		tfTipoVehiculo = new JTextField();
		tfTipoVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfTipoVehiculo.setColumns(10);
		tfTipoVehiculo.setBounds(10, 282, 297, 30);
		panel_1.add(tfTipoVehiculo);
		
		tfColor = new JTextField();
		tfColor.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfColor.setColumns(10);
		tfColor.setBounds(448, 31, 279, 28);
		panel_1.add(tfColor);
		
		tfPotencia = new JTextField();
		tfPotencia.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfPotencia.setColumns(10);
		tfPotencia.setBounds(448, 141, 279, 30);
		panel_1.add(tfPotencia);
		
		tfAnio = new JTextField();
		tfAnio.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfAnio.setColumns(10);
		tfAnio.setBounds(448, 81, 279, 28);
		panel_1.add(tfAnio);
		
		tfCombustible = new JTextField();
		tfCombustible.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfCombustible.setColumns(10);
		tfCombustible.setBounds(448, 209, 279, 30);
		panel_1.add(tfCombustible);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfDescripcion.setColumns(10);
		tfDescripcion.setBounds(317, 282, 410, 135);
		panel_1.add(tfDescripcion);
		
		btnRegistrarVehiculo = new JButton("Ok");
		btnRegistrarVehiculo.addActionListener(new ActionListener() { //botón que permite el registro de un vehículo
			public void actionPerformed(ActionEvent e) {
				ok();
			}

			private void ok() {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(contentPane, "Vehículo registrado");
			}
		});
		btnRegistrarVehiculo.setBackground(Color.WHITE);
		btnRegistrarVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnRegistrarVehiculo.setBounds(669, 525, 105, 57);
		contentPane.add(btnRegistrarVehiculo);
		
		btnVolverRegistrarVehiculo = new JButton("\uD83E\uDC60");
		btnVolverRegistrarVehiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		btnVolverRegistrarVehiculo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverRegistrarVehiculo.setBackground(Color.WHITE);
		btnVolverRegistrarVehiculo.setBounds(24, 525, 105, 57);
		contentPane.add(btnVolverRegistrarVehiculo);
	}

}
