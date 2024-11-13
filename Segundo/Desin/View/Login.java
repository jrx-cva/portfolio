package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.DatatypeConverter;

import DAO.GestionUsuario;
import Exception.BBdd;
import Models.Mecanico;
import Models.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

/*
 * En esta vista es donde comienza el programa y nos logueamos y en función de que tipo de usuario sea
 * se mostrará una venta u otra.
 */
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JButton btnValidar;
	private JPasswordField tfPassword;
	private static Login frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Login();
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(38,70,83));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(233,196,106));
		panel.setBounds(117, 29, 177, 202);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbLogin = new JLabel("LOGIN");
		lbLogin.setBounds(57, 5, 49, 23);
		lbLogin.setFont(new Font("SansSerif", Font.PLAIN, 17));
		panel.add(lbLogin);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblNewLabel.setBounds(23, 39, 71, 14);
		panel.add(lblNewLabel);
		
		tfUsuario = new JTextField();
		tfUsuario.setFont(new Font("SansSerif", Font.PLAIN, 11));
		tfUsuario.setBounds(23, 56, 114, 20);
		panel.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lbPassword = new JLabel("Contrase\u00F1a:");
		lbPassword.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lbPassword.setBounds(21, 87, 85, 14);
		panel.add(lbPassword);
		
		btnValidar = new JButton("VALIDAR");
		btnValidar.setForeground(Color.WHITE);
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					validar();
				} catch (NoSuchAlgorithmException e1) {
					e1.printStackTrace();
				}
			}

			public void validar() throws NoSuchAlgorithmException {
				
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
					switch(usu.getRol()) {
					
						case Ventas:  
							Ventas ventas = new Ventas();
							ventas.setVisible(true);
						break;
						
						case Jefe:
							
						break;
						
						case Mecanico:
							
							Connection con = BBdd.conectar();
							PreparedStatement pst;
							ResultSet rs;
							
							String sqlContra = "select tipo_empleado from mecanico join usuario using(id_usuario)"
									+ "where id_usuario = ?";
							
							try {
								
								pst = con.prepareStatement(sqlContra);
								pst.setInt(1, usu.getId_usuario());
								
								rs = pst.executeQuery();
								
								if(pst.executeQuery().equals("Jefe")) {
									
									JefeMecanico jMecanico = new JefeMecanico();
									jMecanico.setVisible(true);
									
								}else if(pst.executeQuery().equals("Empleado")){
									
									View.Mecanico mecanico = new View.Mecanico();
									mecanico.setVisible(true);
									
								}
								
							} catch (SQLException e) {
								e.printStackTrace();
							}
							
						break;
						
						default:
							System.out.print("¡Error! Dato no valido.");
						break;
					}
					
				} else{
					JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		btnValidar.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnValidar.setBounds(10, 153, 84, 23);
		btnValidar.setBackground(new Color(38,70,83));
		panel.add(btnValidar);
		
		tfPassword = new JPasswordField();
		tfPassword.setFont(new Font("SansSerif", Font.PLAIN, 11));
		tfPassword.setBounds(23, 106, 114, 20);
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
				
				System.exit(0);
			}
		});
		
		btnSalir.setBounds(96, 153, 71, 23);
		panel.add(btnSalir);
		
		//hace que el boton de login funcione con la tecla enter
		frame.getRootPane().setDefaultButton(btnValidar);
	}
}
