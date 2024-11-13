package com.example.carmensporty;

public class ComprobadorEntradaFichero {

    public boolean test(String linea) {
        String[] trozos = linea.split(";");
        try {
            Float.parseFloat(trozos[1]);
        } catch (Exception e) {
            return false;
        }
        return (trozos.length == 2);
    }

}
