package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.BusquedaCliente;
import Models.Clientes;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * En esta vista pondremos ver como se busca y se muestra una ficha de un cliente
 */
public class ClienteBuscar extends JFrame {

	private JPanel contentPane;
	private JTextField tfClienteBuscar;
	private JButton btnBuscarCliente;
	private JButton btnVolverClienteBusqueda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteBuscar frame = new ClienteBuscar();
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
	public ClienteBuscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 44);
		contentPane.add(panel);
		contentPane.setBackground(new Color(244,162,97));
		
		JLabel lblClienteBuscar = new JLabel("Cliente B\u00FAsqueda");
		lblClienteBuscar.setForeground(Color.BLACK);
		lblClienteBuscar.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblClienteBuscar.setBounds(155, 11, 135, 22);
		panel.add(lblClienteBuscar);
		
		JLabel lblTexto1 = new JLabel("Cliente a buscar:");
		lblTexto1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblTexto1.setBounds(32, 55, 106, 22);
		contentPane.add(lblTexto1);
		
		tfClienteBuscar = new JTextField();
		tfClienteBuscar.setForeground(Color.LIGHT_GRAY);
		tfClienteBuscar.setText("insertar dni cliente");
		tfClienteBuscar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfClienteBuscar.setBackground(Color.WHITE);
		tfClienteBuscar.setBounds(32, 77, 375, 20);
		contentPane.add(tfClienteBuscar);
		tfClienteBuscar.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(32, 101, 375, 120);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFoto = new JLabel("    (foto)");
		lblFoto.setForeground(Color.BLACK);
		lblFoto.setBackground(Color.WHITE);
		lblFoto.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblFoto.setBounds(10, 11, 55, 53);
		lblFoto.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblFoto);
		
		JLabel lbl12 = new JLabel("Nombre:");
		lbl12.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl12.setBounds(90, 11, 55, 16);
		panel_1.add(lbl12);
		
		JLabel lbl13 = new JLabel("Apellidos:");
		lbl13.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl13.setBounds(90, 38, 55, 16);
		panel_1.add(lbl13);
		
		JLabel lbl14 = new JLabel("Datos del cliente:");
		lbl14.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl14.setBounds(10, 70, 113, 16);
		panel_1.add(lbl14);
		
		JLabel lblNombreClienteBusqueda = new JLabel("");
		lblNombreClienteBusqueda.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNombreClienteBusqueda.setBackground(Color.WHITE);
		lblNombreClienteBusqueda.setBounds(157, 13, 194, 14);
		lblNombreClienteBusqueda.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblNombreClienteBusqueda);
		
		JLabel lblApellidosClienteBusqueda = new JLabel("");
		lblApellidosClienteBusqueda.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblApellidosClienteBusqueda.setBackground(Color.WHITE);
		lblApellidosClienteBusqueda.setBounds(155, 38, 196, 14);
		lblApellidosClienteBusqueda.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblApellidosClienteBusqueda);
		
		JLabel lblDatosClienteBusqueda = new JLabel("");
		lblDatosClienteBusqueda.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblDatosClienteBusqueda.setBackground(Color.WHITE);
		lblDatosClienteBusqueda.setBounds(117, 63, 234, 46);
		lblDatosClienteBusqueda.setBorder(BorderFactory.createTitledBorder(""));
		panel_1.add(lblDatosClienteBusqueda);
		
		btnBuscarCliente = new JButton("Buscar");
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCliente();
			}

			private void buscarCliente() {
				// TODO Auto-generated method stub
				String dniCliente = tfClienteBuscar.getText();
				
				//instancia clase BusquedaCliente
				BusquedaCliente busquedacliente = new BusquedaCliente();
				
				Clientes cliente2 = new Clientes();
				cliente2.setDniCliente(dniCliente);
				
				Clientes cli = busquedacliente.obtenerCliente(cliente2);
				
				if (cli != null) {
					JOptionPane.showMessageDialog(contentPane, "ok", "Error", JOptionPane.ERROR_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(contentPane, "No existe tal cliente", "Error", JOptionPane.ERROR_MESSAGE);

				}
				
				
				
			}
		});
		btnBuscarCliente.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnBuscarCliente.setBackground(Color.WHITE);
		btnBuscarCliente.setBounds(320, 227, 89, 23);
		contentPane.add(btnBuscarCliente);
		
		btnVolverClienteBusqueda = new JButton("\uD83E\uDC60");
		btnVolverClienteBusqueda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		btnVolverClienteBusqueda.setBackground(Color.WHITE);
		btnVolverClienteBusqueda.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverClienteBusqueda.setBounds(32, 228, 55, 23);
		contentPane.add(btnVolverClienteBusqueda);
	}
}
