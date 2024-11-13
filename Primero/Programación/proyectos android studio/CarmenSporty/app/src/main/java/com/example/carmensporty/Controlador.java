package com.example.carmensporty;


import android.content.res.AssetManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

    //ESTADO//
     private static Controlador singleton;
     protected TiposEjercicios coleccionDeEj;
     private static final String NOMBRE_FICHERO = "data.txt";

     protected Spinner miSpinner;
     protected MainActivity miAplication;


     //CONSTRUCTOR//
    private Controlador(MainActivity miAplication, Spinner miSpinner) {
        coleccionDeEj = new TiposEjercicios();
        this.miSpinner = miSpinner;
        this.miAplication= miAplication;
    }


    //singleton
    public static Controlador getSingleton(MainActivity miAplication, Spinner miSpinner) {
        if(singleton == null) {
            singleton = new Controlador(miAplication, miSpinner);
        }
        return singleton;
    }


    //inicializar datos
    public void iniciaDatos() throws FileNotFoundException {
        ArrayList<String> ejercicios = new ArrayList<>();

        cargarFichero();

        for (int i = 0; i < coleccionDeEj.size(); i++) {
            ejercicios.add(coleccionDeEj.getEjercicioByIndex(i).getDescripcion());
        }

        ArrayAdapter<String> adaptadorItem =
                new ArrayAdapter<String>(this.miAplication, android.R.layout.simple_spinner_item, ejercicios);
        adaptadorItem.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        miSpinner.setAdapter(adaptadorItem);

        adaptadorItem.notifyDataSetChanged();
    }

    public String ButCalcular(float minutos, float kgr, String descripcion) {
        return this.coleccionDeEj.getEjercicioByDescripcion(descripcion).calcularKCal(minutos, kgr);
    }

    private void cargarFichero() throws FileNotFoundException {
        AssetManager miAsset = miAplication.getApplicationContext().getAssets();
        InputStream is;
        FileWriter ficheroDeError;

        try {
            is = miAsset.open(NOMBRE_FICHERO);
        } catch (IOException exception) {
            exception.printStackTrace();
            return;
        }

        Scanner miScanner = new Scanner(is);

        Ejercicio nuevoEjercicio;
        String lineaNueva;
        ComprobadorEntradaFichero comprobador = new ComprobadorEntradaFichero();
        String errores = "";
        int nuevalinea = 1;

        while (miScanner.hasNextLine()) {
            lineaNueva = miScanner.nextLine();
            if(comprobador.test(lineaNueva)) {
                nuevoEjercicio = new Ejercicio(lineaNueva);
                coleccionDeEj.addEjercicio(nuevoEjercicio);
            } else {
                errores += "Error en la linea: " + String.valueOf(nuevalinea) + ". Datos: " +lineaNueva + "\n";
            }
            nuevalinea++;
        }

        miScanner.close();
        if(errores !="") {
            Toast mensaje = Toast.makeText(miAplication, errores, Toast.LENGTH_LONG);
            mensaje.show();
        }
    }








}
