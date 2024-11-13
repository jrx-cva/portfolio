package com.iespablopicasso.sportyworld;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaActividades implements Serializable {
    //Array de actividades disponibles
    protected ArrayList<Actividad> listaDeActividades;

    /*CONSTRUCTOR*/
    public ListaActividades() {
        listaDeActividades =new ArrayList<>();
    }

    public void añadirActividad(Actividad newActividad) { //añadir ejercicio
        listaDeActividades.add(newActividad);
    }

    public int size() {//tamaño lista
        return listaDeActividades.size();
    }

    public Actividad getActividadIndex(int index) { //devuelve el ejercicio en una posición
        return listaDeActividades.get(index);
    }

    public ArrayList<String> getActividadesByUser(String user){ //
        ArrayList<String> resultado = new ArrayList<>();

        int i=0;

        while(i < listaDeActividades.size()){

            if(listaDeActividades.get(i).getUsuario().equals(user)){
                resultado.add(listaDeActividades.get(i).devolverDatos());
            }

            i++;
        }

        return resultado;

    }

    public Actividad getActividadByIndex(int i) {
        return listaDeActividades.get(i);
    }
}
