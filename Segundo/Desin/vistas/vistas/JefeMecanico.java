package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;

public class JefeMecanico {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField txtTiempoEstimado;
	private JTextField txtPresupuestoEstimado;
	private JTextField txtPiezascomsumiblesUsados;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JefeMecanico window = new JefeMecanico();
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
	public JefeMecanico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 50, 800, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(233, 196, 106));
		panel.setBounds(0, 0, 784, 45);
		frame.getContentPane().add(panel);
		
		JLabel lbl1 = new JLabel("Mec\u00E1nico");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lbl1.setBounds(325, 11, 77, 22);
		panel.add(lbl1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(38, 70, 83));
		panel_2.setBounds(10, 67, 423, 373);
		frame.getContentPane().add(panel_2);
		
		JButton btnAvisar = new JButton("Avisar");
		btnAvisar.setFont(new Font("SansSerif", Font.PLAIN, 14));
		btnAvisar.setBackground(Color.WHITE);
		btnAvisar.setBounds(298, 489, 132, 30);
		panel_2.add(btnAvisar);
		
		JLabel lblFoto = new JLabel("           (foto)");
		lblFoto.setBounds(10, 11, 113, 113);
		panel_2.add(lblFoto);
		lblFoto.setForeground(Color.BLACK);
		lblFoto.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblFoto.setBorder(BorderFactory.createTitledBorder(""));
		lblFoto.setBackground(Color.WHITE);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(133, 32, 71, 16);
		panel_2.add(lblNombre);
		lblNombre.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(192, 28, 202, 27);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(133, 95, 71, 16);
		panel_2.add(lblEmail);
		lblEmail.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 91, 202, 27);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setBounds(10, 168, 71, 16);
		panel_2.add(lblDireccion);
		lblDireccion.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 164, 86, 27);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setBounds(192, 168, 71, 16);
		panel_2.add(lblTelefono);
		lblTelefono.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField_3 = new JTextField();
		textField_3.setBounds(251, 164, 143, 27);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDatosDeInteres = new JLabel("Datos de inter\u00E9s:");
		lblDatosDeInteres.setForeground(Color.WHITE);
		lblDatosDeInteres.setBounds(10, 225, 150, 16);
		panel_2.add(lblDatosDeInteres);
		lblDatosDeInteres.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 252, 388, 93);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		txtTiempoEstimado = new JTextField();
		txtTiempoEstimado.setForeground(Color.LIGHT_GRAY);
		txtTiempoEstimado.setFont(new Font("SansSerif", Font.PLAIN, 13));
		txtTiempoEstimado.setText("tiempo estimado");
		txtTiempoEstimado.setBounds(459, 131, 274, 45);
		frame.getContentPane().add(txtTiempoEstimado);
		txtTiempoEstimado.setColumns(10);
		
		txtPresupuestoEstimado = new JTextField();
		txtPresupuestoEstimado.setForeground(Color.LIGHT_GRAY);
		txtPresupuestoEstimado.setText("presupuesto estimado");
		txtPresupuestoEstimado.setFont(new Font("SansSerif", Font.PLAIN, 13));
		txtPresupuestoEstimado.setBounds(459, 216, 274, 45);
		frame.getContentPane().add(txtPresupuestoEstimado);
		txtPresupuestoEstimado.setColumns(10);
		
		btnNewButton = new JButton("Guardar");
		btnNewButton.setBackground(new Color(38, 70, 83));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(621, 548, 112, 32);
		frame.getContentPane().add(btnNewButton);
		
		txtPiezascomsumiblesUsados = new JTextField();
		txtPiezascomsumiblesUsados.setText("piezas/consumibles usados");
		txtPiezascomsumiblesUsados.setForeground(Color.LIGHT_GRAY);
		txtPiezascomsumiblesUsados.setFont(new Font("SansSerif", Font.PLAIN, 13));
		txtPiezascomsumiblesUsados.setColumns(10);
		txtPiezascomsumiblesUsados.setBounds(459, 296, 274, 228);
		frame.getContentPane().add(txtPiezascomsumiblesUsados);
		
		JList list = new JList();
		list.setBounds(67, 524, 1, 1);
		frame.getContentPane().add(list);
	}
}
