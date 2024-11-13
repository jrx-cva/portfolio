package com.iespablopicasso.sportyworld;

import android.content.Context;
import android.content.res.AssetManager;
import android.provider.ContactsContract;
import android.security.keystore.UserPresenceUnavailableException;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Controlador  {
	////////////////////////////////////////////////////////////////////////////////////////////////
    //Estado
	////////////////////////////////////////////////////////////////////////////////////////////////


	//Instancia singleton
	private static Controlador singleton;

	//Control de login y registro
	protected boolean bLoginOk;
	protected boolean bNuevoRegistro;
	protected String userLoged;


	//Colecciones de datos actuales
	protected TiposEjercicios coleccionEj;
	protected ListaUsuarios coleccionUsers;


	//Ficheros de soporte de la serialización
	private static final String NOMBRE_FICHERO = "data.txt";
	private static final String NOMBRE_FICHERO_USERS = "users.txt";

	//Referencia a la actividad principal
	protected MainActivity myApp;




	////////////////////////////////////////////////////////////////////////////////////////////////
	//Comportamientos
	////////////////////////////////////////////////////////////////////////////////////////////////

	
	//Constructor
	private Controlador(MainActivity myApp) {
		coleccionEj = new TiposEjercicios();
		coleccionUsers = new ListaUsuarios();

		this.myApp = myApp;
		bLoginOk = false;
		userLoged = "";
		bNuevoRegistro = false;
		
		
	}


	//Get singleton
	public static Controlador getSingleton(MainActivity myApp) {
		if (singleton == null) {
			singleton = new Controlador(myApp);
		}
		return singleton;

	}


	//Getter del singleton
	public static Controlador getSingleton() {

		return singleton;

	}

	//inicializar datos. Devolvemos un arraylist con los string a meter en en spinner
	public ArrayList<String> iniciaDatos() throws FileNotFoundException {
		ArrayList<String> ejercicios = new ArrayList<>();


		//Cargamos datos del fichero
		cargarFichero1();  //Ejercicios. Carga datos en coleccionEj
		cargarFichero2();  //Usuarios. Carga datos en coleccionUsers


		//Introducimos en el ArrayList los datos
		for (int i=0;i<coleccionEj.size();i++) {
			ejercicios.add(coleccionEj.getEjercicioByIndex(i).getDescripcion());
		}

		return ejercicios;
		
	}
	
	
	//Método principal de cálculo
	public String calculaKCal(float minutos, float kgs, String descr) {
	
		return coleccionEj.getEjercicioByDescripcion(descr).calcularKCal(minutos, kgs);
	}
	
	
	//Carga de datos desde fichero de texto. Ejercicios
	private void cargarFichero1() {

		AssetManager myAssets = myApp.getApplicationContext().getAssets();
		InputStream is;

		try {
			is = myAssets.open(NOMBRE_FICHERO);
		} catch (IOException ex) {
			ex.printStackTrace();
			return;
		}

		Scanner in = new Scanner(is);
		
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
		
		
		//Ahora escribimos en pantalla errores encontrados
		if (errores != "") {
			Toast mensaje = Toast.makeText(myApp,errores,Toast.LENGTH_LONG);
			mensaje.show();
		}
		
	}

	//Carga de datos desde fichero de texto. Usuarios
	private void cargarFichero2() {

		FileInputStream fichero;

		try {
			 fichero = myApp.openFileInput(NOMBRE_FICHERO_USERS);
		} catch (IOException ex) {
			ex.printStackTrace();
			return;
		}

		Scanner in = new Scanner(fichero);

		usuario nuevoUser;
		String siguienteLinea;
		ComprobadorEntradaFichero comprobador = new ComprobadorEntradaFichero();
		String errores = "";
		int numLinea = 1;

		while (in.hasNextLine()) {

			siguienteLinea = in.nextLine();
			if (comprobador.testUsuario(siguienteLinea)) {
				nuevoUser = new usuario(siguienteLinea);
				coleccionUsers.addUsuario(nuevoUser);
			} else {
				//Controlar cuántos errores va dando
				errores += "Error en la línea: " + String.valueOf(numLinea) + ". Datos: " + siguienteLinea + "\n";

			}
			numLinea++;
		}

		in.close();


		//Ahora escribimos
		if (errores != "") {

			Toast mensaje = Toast.makeText(myApp,errores,Toast.LENGTH_LONG);
			mensaje.show();

		}

	}

	
    //Login y acceso
	public boolean testLogin(String user,String passwd) {
		boolean resultado;

		resultado = coleccionUsers.test(user,passwd);

		bLoginOk = resultado;
		if (resultado) {
			userLoged = user;
		}

		return resultado;
	}


	//usuario logeado??
	public boolean estaUsuarioLogeado() {
		return bLoginOk;
	}

	//get usuario logeado
	public String getUsuarioLogged(){
		return userLoged;
	}

	//testeamos antes de registrar nuevo usuario si ya estaba
	public boolean testNuevoUsuario(String user) {
		boolean resultado;

		resultado = (coleccionUsers.getUsuarioByUser(user) != null);

		return resultado;
	}

	//Añadimos nuevo usuario al sistema
	public void addNuevoUsuario(String user,String passwd,String nombre, String apellidos,String dni,String email) {
		usuario nuevoUser = new usuario(user, passwd, nombre,  apellidos, dni, email);
		coleccionUsers.addUsuario(nuevoUser);
		grabaNuevoUsuario(nuevoUser);
		userLoged = nuevoUser.getUser();
		bLoginOk = true;
		bNuevoRegistro = true;

	}

	//Grabar un nuevo usuario a disco
	public void grabaNuevoUsuario(usuario nuevoUser) {

		try {
			FileOutputStream fichero = this.myApp.openFileOutput(NOMBRE_FICHERO_USERS, Context.MODE_APPEND);


			PrintWriter impresor = new PrintWriter(fichero,true);
			BufferedWriter miBuffer = new BufferedWriter(impresor);
			miBuffer.write(nuevoUser.serializar());
			miBuffer.newLine();
			miBuffer.flush();
			miBuffer.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}

	public boolean esNuevoRegistro() {
		return bNuevoRegistro;

	}
	public void desactivaNuevoRegistro() {
		bNuevoRegistro = false;
	}


}
