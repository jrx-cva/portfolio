package com.iespablopicasso.sportyworld;

import java.io.Serializable;

public class Actividad implements Serializable {

    //ESTADO

    protected String hora;
    protected String fecha;
    protected String usuario;
    protected String ejercicio;
    protected String kgs;
    protected String minutos;
    protected String Kcal;


    //Comportamientos

    //Constructor
    /*public Actividad (String serializado) {
        String[] trozos;
        trozos = serializado.split(";");
        hora = trozos[0];
        fecha = trozos[1];
        usuario = trozos[2];
        ejercicio = trozos[3];
        kgs = trozos[4];
        minutos = trozos[5];
    }*/

    public Actividad(String hora, String fecha, String usuario, String ejercicio, String kgs, String minutos,String Kcal) {
        this.hora = hora;
        this.fecha = fecha;
        this.usuario = usuario;
        this.ejercicio = ejercicio;
        this.kgs = kgs;
        this.minutos = minutos;
        this.Kcal=Kcal;
    }



    /*public String serializar() {
        return hora + ";" + fecha + ";" +  usuario + ";" +  ejercicio +";" +  kgs + ";" +  minutos;
    }*/


    public String dameLosDatos(){
        return "Hora "+hora + ";" + "Fecha "+ fecha + ";"+ "Usuario " +  usuario + ";" + "Ejercicio "+  ejercicio +";"+ "Kilos " +  kgs + ";"+ "minutos " +  minutos+";"+"Kcal quemadas "+Kcal;
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public String getKgs() {
        return kgs;
    }

    public String getMinutos() {
        return minutos;
    }



}