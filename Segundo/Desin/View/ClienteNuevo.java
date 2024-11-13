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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

/*
 * En esta vista se añaden clientes nuevos que no esten en la BD.
 */
public class ClienteNuevo extends JFrame {

	private JPanel contentPane;
	private JButton btnClienteNuevo;
	private JButton btnVolverClienteNuevo;
	private JTextField tfNombreClienteNuevo;
	private JTextField tfApellidosClienteNuevo;
	private JTextField tfTelefonoClienteNuevo;
	private JTextField tfEmailClienteNuevo;
	private JTextField tfDireccionClienteNuevo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteNuevo frame = new ClienteNuevo();
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
	public ClienteNuevo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(244,162,97));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 44);
		contentPane.add(panel);
		
		JLabel lblClienteNuevo = new JLabel("Cliente Nuevo");
		lblClienteNuevo.setForeground(Color.BLACK);
		lblClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblClienteNuevo.setBounds(170, 11, 100, 22);
		panel.add(lblClienteNuevo);
		
		JLabel lblTexto2 = new JLabel("Registro nuevo cliente:");
		lblTexto2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblTexto2.setBounds(32, 55, 141, 22);
		contentPane.add(lblTexto2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(32, 79, 375, 145);
		contentPane.add(panel_1);
		
		JLabel lblfoto2 = new JLabel("   (foto)");
		lblfoto2.setForeground(Color.BLACK);
		lblfoto2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblfoto2.setBorder(BorderFactory.createTitledBorder(""));
		lblfoto2.setBackground(Color.WHITE);
		lblfoto2.setBounds(10, 82, 59, 57);
		panel_1.add(lblfoto2);
		
		JLabel lbl15 = new JLabel("Nombre:");
		lbl15.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl15.setBounds(10, 13, 55, 16);
		panel_1.add(lbl15);
		
		JLabel lbl16 = new JLabel("Apellidos:");
		lbl16.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl16.setBounds(152, 13, 55, 16);
		panel_1.add(lbl16);
		
		JLabel lbl20 = new JLabel("Datos de Inter\u00E9s:");
		lbl20.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl20.setBounds(79, 80, 113, 16);
		panel_1.add(lbl20);
		
		JLabel lbl17 = new JLabel("Tel\u00E9fono:");
		lbl17.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl17.setBounds(10, 35, 55, 16);
		panel_1.add(lbl17);
		
		JLabel lbl18 = new JLabel("E-mail:");
		lbl18.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl18.setBounds(152, 35, 55, 16);
		panel_1.add(lbl18);
		
		JLabel lbl19 = new JLabel("Direcci\u00F3n:");
		lbl19.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lbl19.setBounds(10, 59, 55, 16);
		panel_1.add(lbl19);
		
		tfNombreClienteNuevo = new JTextField();
		tfNombreClienteNuevo.setBackground(Color.WHITE);
		tfNombreClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfNombreClienteNuevo.setBounds(59, 12, 86, 20);
		panel_1.add(tfNombreClienteNuevo);
		tfNombreClienteNuevo.setColumns(10);
		
		tfApellidosClienteNuevo = new JTextField();
		tfApellidosClienteNuevo.setBackground(Color.WHITE);
		tfApellidosClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfApellidosClienteNuevo.setBounds(210, 12, 155, 20);
		panel_1.add(tfApellidosClienteNuevo);
		tfApellidosClienteNuevo.setColumns(10);
		
		tfTelefonoClienteNuevo = new JTextField();
		tfTelefonoClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfTelefonoClienteNuevo.setBackground(Color.WHITE);
		tfTelefonoClienteNuevo.setBounds(59, 34, 86, 20);
		panel_1.add(tfTelefonoClienteNuevo);
		tfTelefonoClienteNuevo.setColumns(10);
		
		tfEmailClienteNuevo = new JTextField();
		tfEmailClienteNuevo.setBackground(Color.WHITE);
		tfEmailClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfEmailClienteNuevo.setBounds(210, 34, 155, 20);
		panel_1.add(tfEmailClienteNuevo);
		tfEmailClienteNuevo.setColumns(10);
		
		tfDireccionClienteNuevo = new JTextField();
		tfDireccionClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfDireccionClienteNuevo.setBackground(Color.WHITE);
		tfDireccionClienteNuevo.setBounds(79, 58, 286, 20);
		panel_1.add(tfDireccionClienteNuevo);
		tfDireccionClienteNuevo.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(79, 97, 286, 42);
		panel_1.add(textField);
		textField.setColumns(10);
		
		btnClienteNuevo = new JButton("Registrar");
		btnClienteNuevo.addActionListener(new ActionListener() {//botón que permite la registrar un cliente
			public void actionPerformed(ActionEvent e) {
				okCliente();
			}

			private void okCliente() {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(contentPane, "Cliente registrado");
			}
		});
		btnClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnClienteNuevo.setBackground(Color.WHITE);
		btnClienteNuevo.setBounds(317, 227, 89, 23);
		contentPane.add(btnClienteNuevo);
		
		btnVolverClienteNuevo = new JButton("\uD83E\uDC60");
		btnVolverClienteNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		btnVolverClienteNuevo.setBackground(Color.WHITE);
		btnVolverClienteNuevo.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverClienteNuevo.setBounds(32, 228, 56, 23);
		contentPane.add(btnVolverClienteNuevo);
	}
}
