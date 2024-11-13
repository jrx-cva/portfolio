package com.iespablopicasso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Controlador implements ActionListener{
    //Estado
	protected TiposEjercicios coleccionEj;
	private static final String NOMBRE_FICHERO = "data.txt";
	private static final String NOMBRE_FICHERO_ERRORES = "errores.txt";
	protected JComboBox cbEjercicios;
	protected JTextField tfMinutos;
	protected JTextField tfKgs;
	protected JLabel laKCalResult;
	
	//Comportamientos
	
	//Constructor
	public Controlador(JTextField tfMinutos,JTextField tfKgs, JComboBox cbEjercicios,JLabel laKCalResult) {
		coleccionEj = new TiposEjercicios();
		this.tfMinutos = tfMinutos;
		this.tfKgs = tfKgs;
		this.cbEjercicios = cbEjercicios;
		this.laKCalResult = laKCalResult;
		
	}
	
	//inicializar datos
	public void iniciaDatos() throws FileNotFoundException {
		
		//Cargamos datos del fichero
		cargarFichero();
		
		//Introducimos en el JComboBox los datos
		for (int i=0;i<coleccionEj.size();i++) {
			cbEjercicios.addItem(coleccionEj.getEjercicioByIndex(i).getDescripcion());
		}
		
	}
	
	
	//Metodo principal de cálculo
	public String calculaKCal(float minutos, float kgs, String descr) {
		return coleccionEj.getEjercicioByDescripcion(descr).calcularKCal(minutos, kgs);
	}
	
	
	//Carga de datos desde fichero de texto.
	private void cargarFichero() throws FileNotFoundException {
		File miFichero = new File(NOMBRE_FICHERO);
		FileWriter erroresFichero;
		
		Scanner in = new Scanner(miFichero);
		
		Ejercicio nuevoEjer;
		String siguienteLinea;
		ComprobadorEntradaFichero comprobador = new ComprobadorEntradaFichero();
		String errores = "";
		int numLinea = 1;
		
		while (in.hasNextLine()) {
			
			siguienteLinea = in.nextLine();
			if (comprobador.test(siguienteLinea)) {
				nuevoEjer = new Ejercicio(siguienteLinea);
				coleccionEj.addEjercicio(nuevoEjer);
			} else {
				//Controlar cuántos errores va dando
				errores += "Error en la línea: " + String.valueOf(numLinea) + ". Datos: " + siguienteLinea + "\n";
			}
			numLinea++;
		}
		
		in.close();
		
		
		//Ahora escribimos 
		if (errores != "") {
			try {
			    erroresFichero = new FileWriter(NOMBRE_FICHERO_ERRORES);
		
			    erroresFichero.write(errores);

			    erroresFichero.close();

			} catch (Exception ex) {
				System.out.println("Mensaje de la excepción: " + ex.getMessage());
			}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		laKCalResult.setText(this.calculaKCal(Float.parseFloat(this.tfMinutos.getText()), Float.parseFloat(tfKgs.getText()), (String)cbEjercicios.getSelectedItem()));
		
	}
	
	
}
