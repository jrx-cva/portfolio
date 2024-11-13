package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JSpinner;

import DAO.BusquedaCliente;
import DAO.MostrarVentas;
import Models.Clientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class VerVentas extends JFrame{

	private static JFrame frame;
	private JButton btnVolverVentas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerVentas window = new VerVentas();
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
	public VerVentas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		getContentPane().setBackground(new Color(231,111,81));
		setBounds(100, 50, 800, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 44);
		getContentPane().add(panel);
		
		JLabel lblVerVentas = new JLabel("Ver ventas");
		lblVerVentas.setForeground(Color.BLACK);
		lblVerVentas.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblVerVentas.setBounds(358, 11, 82, 22);
		panel.add(lblVerVentas);
		
		btnVolverVentas = new JButton("\uD83E\uDC60");
		btnVolverVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		btnVolverVentas.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverVentas.setBackground(Color.WHITE);
		btnVolverVentas.setBounds(29, 503, 122, 79);
		getContentPane().add(btnVolverVentas);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(165, 173, 488, 226);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVentasTotales = new JLabel("");
		lblVentasTotales.setBounds(260, 49, 77, 20);
		panel_1.add(lblVentasTotales);
		lblVentasTotales.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		JLabel lbl1 = new JLabel("Ventas totales:");
		lbl1.setBounds(118, 49, 115, 20);
		panel_1.add(lbl1);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(72, 101, 367, 44);
		panel_1.add(spinner);
		
		JButton btnRefrescar = new JButton("Refrescar");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refrescar();
			}
			
			private void refrescar() {
				MostrarVentas ventas = new MostrarVentas();
				try {
					lblVentasTotales.setText(String.valueOf(ventas.obtenerTotal()));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
			}
		});
		btnRefrescar.setBounds(347, 173, 131, 44);
		panel_1.add(btnRefrescar);
		btnRefrescar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnRefrescar.setBackground(Color.WHITE);
		
		
	}
}
