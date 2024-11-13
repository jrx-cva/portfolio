package com.iespablopicasso.sportyworld;

import android.content.Context;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccesosASistema {

    /*CREAR ARRAYLIST*/

    //Estado
    ArrayList<Acceso> listaDeAcceso = new ArrayList<>();
    MainActivity myApp;


    //Constructor

    public AccesosASistema(MainActivity myApp) {
        this.myApp = myApp;
    }

    public void addAcceso(Acceso acceso) {
        listaDeAcceso.add(acceso); //añadir acceso
        Context mainActivity;
        String path = myApp.getFilesDir() + "/accesos.txt";
        BufferedWriter bw;
        try {
            System.out.println(path);
            bw = new BufferedWriter(new FileWriter(path, true));
            bw.write(acceso.serializar());
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
