package com.example.carmensporty;

import java.util.ArrayList;

public class TiposEjercicios {

    //ESTADO//
    //lista de ejercicios disponibles
    protected ArrayList<Ejercicio> listaEjercicios;


    //COMPORTAMIENTOS//

    //CONSTRUCTOR//
    public TiposEjercicios() {
        listaEjercicios = new ArrayList();
    }

    //añadir un ejercicio
    public void addEjercicio(Ejercicio nuevoEjercicio) {
        listaEjercicios.add(nuevoEjercicio);
    }

    //¿cuántos hay?
    public int size() {
        return listaEjercicios.size();
    }

    //dar el ejercicio de la posición i
    public Ejercicio getEjercicioByDescripcion(String descripcion) {
        Ejercicio ejer = null;

        int i = 0;

        while (ejer == null && i< listaEjercicios.size()) {
            if (listaEjercicios.get(i).getDescripcion() == descripcion) {
                ejer = listaEjercicios.get(i);
            } else
                i++;
        }

        return ejer;

    }

    public Ejercicio getEjercicioByIndex(int i) {
        return listaEjercicios.get(i);
    }

}



