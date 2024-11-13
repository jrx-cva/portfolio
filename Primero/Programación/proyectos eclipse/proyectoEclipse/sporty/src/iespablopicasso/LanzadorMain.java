package com.iespablopicasso;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.FileNotFoundException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LanzadorMain {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Controlador miControlador;
  
  		JFrame fMain = new JFrame("Sporty World Java Swing"); 
  		JPanel fondo = new JPanel(new FlowLayout(FlowLayout.CENTER,50,30));
        JPanel fondo2 = new JPanel();
        JPanel fondo3 = new JPanel();
        

        fondo.setBackground(Color.blue);
        fondo2.setBackground(Color.black);
        fondo3.setBackground(Color.red);

		  //fondo.setLayout(new BoxLayout(fondo,BoxLayout.Y_AXIS));
		  //fondo.setLayout(new FlowLayout(FlowLayout.RIGHT,60,60));
		  //fondo.setLayout(new FlowLayout(FlowLayout.LEFT,60,60));
		  //fondo.setLayout(new FlowLayout(FlowLayout.TRAILING,60,60));
	  
	  
          //Panel para los TextFields y los JLabel
		  JPanel TextBoxsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,40,30));
		  TextBoxsPanel.setBackground(Color.magenta);
		  
		  
		  //Panel gris
		  JPanel GrisPanel = new JPanel();
		  GrisPanel.setBackground(Color.gray);
		  
		  //Panel azul
		  JPanel AzulPanel = new JPanel();
		  AzulPanel.setBackground(Color.cyan);
		  
		  //Panel amarillo
		  JPanel AmarilloPanel = new JPanel();
		  AmarilloPanel.setBackground(Color.yellow);
		  
		  //añadimos el panel naranja
		  JPanel ComboBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		  ComboBoxPanel.setBackground(Color.orange);
		  
		  //Panel para el resultado
		  JPanel ResultsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,40,30));
		  ResultsPanel.setBackground(Color.green);
		  
		  //creamos un nuevo panel
	      JPanel LoginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,20,20));
		  LoginPanel.setBackground(Color.red);
		  
		  fMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		  
		  
		//Añadimos los componentes
		JLabel laMinutos = new JLabel("Minutos");       
        JTextField tfMinutos = new JTextField(5); // acepta hasta 5 caracteres 
        JLabel laKgs = new JLabel("Kilogramos");       
        JTextField tfKgs= new JTextField(3); // acepta hasta 5 caracteres 
        JComboBox cbEjercicios = new JComboBox();
        JLabel laKCal = new JLabel("KCal:"); 
        JLabel laKCalResult = new JLabel(""); 
        JButton buCalcular = new JButton("Calcular");  
        miControlador = new Controlador(tfMinutos,tfKgs,cbEjercicios,laKCalResult);
        buCalcular.addActionListener(miControlador);
        
        
        JLabel laNombre = new JLabel("Usuario:");
		laNombre.setForeground(Color.black);
		JTextField tfNombre = new JTextField(10);
		JLabel laPassword = new JLabel("Password:");
		laPassword.setForeground(Color.black);
		JTextField tfPassword = new JTextField(10);
        
        try {
        	miControlador.iniciaDatos();
        } catch (FileNotFoundException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        }
        
   
        
        //Aquí añadimos al panel de TextFields y Jpanels sus componentes
        AzulPanel.add(laMinutos);  
        AzulPanel.add(tfMinutos); 
        
        
        AmarilloPanel.add(laKgs); 
        AmarilloPanel.add(tfKgs);
        
        //añadimos el combobox
        ComboBoxPanel.add(cbEjercicios);
        
        
        //Aquí un ejemplo de añadir componentes al BorderLayout
        ResultsPanel.add(BorderLayout.WEST,laKCal);
        ResultsPanel.add(BorderLayout.EAST,laKCalResult);
        ResultsPanel.add(BorderLayout.SOUTH,buCalcular);
        
        
        
        //aqui añadimos el panel de login
        LoginPanel.add(laNombre);
        LoginPanel.add(tfNombre);
        LoginPanel.add(laPassword);
        LoginPanel.add(tfPassword);
        
        
        fondo.add(TextBoxsPanel);
        
        TextBoxsPanel.add(GrisPanel);
        
        GrisPanel.add(AzulPanel);
        
        GrisPanel.add(AmarilloPanel);
        
        fondo.add(ComboBoxPanel);
        
        //fondo.add(cbEjercicios); //Va directo al Fondo. Es un componente que no tiene panel intermedio
        
        fondo.add(ResultsPanel);
        
        fondo3.add(LoginPanel);
           
        
        fMain.add(BorderLayout.NORTH,fondo);
        fMain.add(BorderLayout.CENTER,fondo2);
        fMain.add(BorderLayout.SOUTH,fondo3);
        
        
        
        fMain.pack();
        
       
        
        fMain.setVisible(true); 

 }

}
