package vistas;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Usuario;
import dao.GestionUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

/**
 * 
 * @author Carmen
 *
 */
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JButton btnValidar;
	private JPasswordField tfPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(38,70,83));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233,196,106));
		panel.setBounds(117, 29, 539, 518);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbLogin = new JLabel("LOGIN");
		lbLogin.setBounds(225, 36, 85, 23);
		lbLogin.setFont(new Font("SansSerif", Font.PLAIN, 23));
		panel.add(lbLogin);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblNewLabel.setBounds(237, 130, 49, 14);
		panel.add(lblNewLabel);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("SansSerif", Font.PLAIN, 11));
		tfUsuario.setBounds(153, 155, 224, 30);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lbPassword = new JLabel("Contrase\u00F1a:");
		lbPassword.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lbPassword.setBounds(238, 254, 85, 14);
		panel.add(lbPassword);
		
		btnValidar = new JButton("VALIDAR");
		btnValidar.setForeground(Color.WHITE);
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validar();
			}

			private void validar() {
				// TODO Auto-generated method stub
				String nombre_usuario = tfUsuario.getText();
				String contrasenia = String.valueOf(tfPassword.getPassword());
				
				//instanciar clase gestionUsuario
				GestionUsuario gestionUsuario = new GestionUsuario();
				
				Usuario usuario2 = new Usuario();
				usuario2.setNombre_usuario(nombre_usuario);
				usuario2.setContrasenia(contrasenia);
				
				Usuario usu = gestionUsuario.obtenerUsuario(usuario2);
				
				if (usu != null) {
					JOptionPane.showMessageDialog(contentPane, "Bienvenido");
					
					//this.dispose();
					
					Ventas ventas = new Ventas();
					ventas.setVisible(true);
					
				} else{
					JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		btnValidar.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnValidar.setBounds(381, 443, 132, 46);
		btnValidar.setBackground(new Color(38,70,83));
		panel.add(btnValidar);
		
		tfPassword = new JPasswordField();
		tfPassword.setFont(new Font("SansSerif", Font.PLAIN, 11));
		tfPassword.setBounds(153, 279, 224, 30);
		panel.add(tfPassword);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(new Color(38,70,83));
		
		btnSalir.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}

			private void salir() {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		btnSalir.setBounds(23, 442, 132, 48);
		panel.add(btnSalir);
	}
}
