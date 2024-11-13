package com.iespablopicasso.sportyworld;

import java.io.Serializable;

public class Actividad implements Serializable{
    /*ESTADO*/
    protected String user;
    protected String exercise;
    protected String kgm;
    protected String hour;
    protected String minutes;
    protected String date;

    /*COMPORTAMIENTOS*/

    /*CONSTRUCTOR*/
    public Actividad(String usuario, String ejercicio, String kgm, String hora, String minutos, String fecha) {
        this.user = usuario;
        this.exercise = ejercicio;
        this.kgm = kgm;
        this.hour = hora;
        this.minutes = minutos;
        this.date = fecha;
    }

    //Método para devolver los datos
    public String devolverDatos (){
        return ("Usuario : " + user + " Actividad realizada : " + exercise + " Kilogramos: " + kgm + "\n" + "En: " + minutes + " Fecha: " + date + " Hora" + hour);
    }

    //comprueba Usuario
    public boolean comprobarUsuario(String otroUsuario){
        return otroUsuario.equalsIgnoreCase(user);
    }

    public Object getUsuario() {
        return user;
    }

    public String getExercise() {
        return exercise;
    }

    public String getKgm() {
        return kgm;
    }

    public String getHour() {
        return hour;
    }

    public String getMinutes() {
        return minutes;
    }

    public String getDate() {
        return date;
    }
}
