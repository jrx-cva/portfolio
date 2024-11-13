package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.RealizaPropuesta;

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
public class RealizarPropuestaNueva extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombreYApellidosRealizarPropuesta;
	private JTextField tfDescripcinVehiculoRealizarPropuesta;
	private JTextField tfPrecioRealizarPropuesta;
	private JButton btnRealizarPropuesta;
	private JButton btnVolverRealizarPropuesta;
	private JTextField tfFechaRealizarPropuesta;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealizarPropuestaNueva frame = new RealizarPropuestaNueva();
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
	public RealizarPropuestaNueva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 800, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(231,111,81));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 44);
		contentPane.add(panel);
		
		JLabel lblRealizarPropuestaNueva = new JLabel("Realizar propuesta nueva");
		lblRealizarPropuestaNueva.setForeground(Color.BLACK);
		lblRealizarPropuestaNueva.setFont(new Font("SansSerif", Font.PLAIN, 17));
		lblRealizarPropuestaNueva.setBounds(298, 11, 190, 22);
		panel.add(lblRealizarPropuestaNueva);
		
		JLabel lblRealizarPropuesta = new JLabel("Realizar propuesta:");
		lblRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblRealizarPropuesta.setBounds(10, 94, 162, 22);
		contentPane.add(lblRealizarPropuesta);
		
		tfNombreYApellidosRealizarPropuesta = new JTextField();
		tfNombreYApellidosRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfNombreYApellidosRealizarPropuesta.setForeground(Color.LIGHT_GRAY);
		tfNombreYApellidosRealizarPropuesta.setText("nombre y apellidos del cliente");
		tfNombreYApellidosRealizarPropuesta.setBounds(10, 127, 764, 34);
		contentPane.add(tfNombreYApellidosRealizarPropuesta);
		tfNombreYApellidosRealizarPropuesta.setColumns(10);
		
		tfDescripcinVehiculoRealizarPropuesta = new JTextField();
		tfDescripcinVehiculoRealizarPropuesta.setText("descripci\u00F3n del veh\u00EDculo y datos de inter\u00E9s");
		tfDescripcinVehiculoRealizarPropuesta.setForeground(Color.LIGHT_GRAY);
		tfDescripcinVehiculoRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfDescripcinVehiculoRealizarPropuesta.setBounds(10, 187, 764, 184);
		contentPane.add(tfDescripcinVehiculoRealizarPropuesta);
		tfDescripcinVehiculoRealizarPropuesta.setColumns(10);
		
		tfPrecioRealizarPropuesta = new JTextField();
		tfPrecioRealizarPropuesta.setText("precio total");
		tfPrecioRealizarPropuesta.setForeground(Color.LIGHT_GRAY);
		tfPrecioRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfPrecioRealizarPropuesta.setColumns(10);
		tfPrecioRealizarPropuesta.setBounds(231, 462, 304, 44);
		contentPane.add(tfPrecioRealizarPropuesta);
		
		btnRealizarPropuesta = new JButton("Ok");
		btnRealizarPropuesta.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				if(!(tfPrecioRealizarPropuesta.getText().equals(null)) && !(tfNombreYApellidosRealizarPropuesta.getText().equals(null))) {
					RealizaPropuesta registrarPropuesta = new RealizaPropuesta();
					registrarPropuesta.registrarPropuesta(Integer.parseInt(tfPrecioRealizarPropuesta.getText().toString()), tfFechaRealizarPropuesta.getText().toString(), tfDescripcinVehiculoRealizarPropuesta.getText(), tfNombreYApellidosRealizarPropuesta.getText().toString());
				}
				okPropuesta();
				
			}

			private void okPropuesta() {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(contentPane, "Propuesta realizada");
				
			}
		});
		btnRealizarPropuesta.setBackground(Color.WHITE);
		btnRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnRealizarPropuesta.setBounds(645, 521, 129, 79);
		contentPane.add(btnRealizarPropuesta);
		
		btnVolverRealizarPropuesta = new JButton("\uD83E\uDC60");
		btnVolverRealizarPropuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ventas ventas = new Ventas();
				ventas.setVisible(true);
			}
		});
		btnVolverRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnVolverRealizarPropuesta.setBackground(Color.WHITE);
		btnVolverRealizarPropuesta.setBounds(10, 521, 122, 79);
		contentPane.add(btnVolverRealizarPropuesta);
		
		tfFechaRealizarPropuesta = new JTextField();
		tfFechaRealizarPropuesta.setText("fecha ");
		tfFechaRealizarPropuesta.setForeground(Color.LIGHT_GRAY);
		tfFechaRealizarPropuesta.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tfFechaRealizarPropuesta.setColumns(10);
		tfFechaRealizarPropuesta.setBounds(231, 396, 304, 44);
		contentPane.add(tfFechaRealizarPropuesta);
	}
}
