package com.iespablopicasso.sportyworld;

public class Acceso {

    //ESTADO

    protected String user;
    protected String passwd;
    protected String dni;
    protected String year;
    protected String month;
    protected String day;
    protected String hour;
    protected String minute;


    //Comportamientos

    //Constructor
    public Acceso(String serializado) {
        String[] trozo;
        trozo = serializado.split(";");
        user = trozo[0];
        passwd = trozo[1];
        dni = trozo[2];
        year = trozo[3];
        month = trozo[4];
        day = trozo[5];
        hour = trozo[6];
        minute = trozo[7];


    }

    public Acceso(String user,String passwd,String dni,String year,String month,String day,String hour,String minute) {
        this.user= user;
        this.passwd= passwd;
        this.dni= dni;
        this.year= year;
        this.month= month;
        this.day= day;
        this.hour= hour;
        this.minute= minute;

    }


    //getters
    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getDni() {
        return dni;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    //serializar
    public String serializar() {
        return user + ";" +  passwd + ";" +  dni + ";" +  year + ";" +  month + ";" +  day + ";" +  hour + ";" +  minute;
    }

}
