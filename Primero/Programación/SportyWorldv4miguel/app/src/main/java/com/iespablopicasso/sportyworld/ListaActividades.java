package com.iespablopicasso.sportyworld;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaActividades implements Serializable {

    //Lista de ejercicios disponibles
    protected ArrayList<Actividad> listaActividades;

    //Constructor
    public ListaActividades(){listaActividades=new ArrayList<>();}


    //Añadir un ejercicio
    public void addActividad(Actividad newActividad){listaActividades.add(newActividad);}

    //¿Cuántos hay)
    public int size(){return listaActividades.size();}

    //Dar el ejercicio de la posicion i
    public Actividad getActividadIndex(int index) {return listaActividades.get(index);}

    public ArrayList<String> getActividadesByUser(String user){


        ArrayList<String> resultado =new ArrayList<>();

        int i=0;

        while(i<listaActividades.size()){
            if(listaActividades.get(i).getUsuario().equals(user)){
                resultado.add(listaActividades.get(i).dameLosDatos());
            }
            i++;
        }

        return resultado;

    }
/*
    public String getActividadesByUser(String user){


        String resultado =null;

        int i=0;

        boolean aux=false;

        while(i<listaActividades.size() && aux==false){
            if(listaActividades.get(i).getUsuario().equals(user)){
                resultado=listaActividades.get(i).dameLosDatos();
                aux=true;
            }
            i++;
        }

        return resultado;

    }

*/
}
