package com.example.carmensporty;

public class Ejercicio {

    //ESTADO//
    protected String descripcion;
    protected float met;

    //COMPORTAMIENTOS//

    //CONSTRUCTOR//
    public Ejercicio(String serializado) {
        String[] trozos;
        trozos = serializado.split(";");
        descripcion = trozos[0];
        met = Float.parseFloat(trozos[1]);
    }


    //calcular kcal
    public String calcularKCal(float minutos, float kgr) {
        return String.valueOf(minutos*kgr*met/60);
    }

    public String getDescripcion() {
        return descripcion;
    }
}
