package com.example.carmensporty;

public class Persona {
    protected String name;
    protected String password;
    protected String userName;
    protected String lastName;
    protected String dni;
    protected String email;


    public Persona (String serializado) {
        String[] trozos = serializado.split(";");
        this.userName = trozos[0];
        this.password = String.valueOf(trozos[1]);
        this.name=trozos[2];
        this.lastName=trozos[3];
        this.dni=trozos[4];
        this.email=trozos[5];
    }

    public Persona (String name, String password, String nombreUsuario, String apellidos, String dni, String correo) {
        this.name = name;
        this.password = password;
        this.userName = nombreUsuario;
        this.lastName = apellidos;
        this.dni = dni;
        this.email = correo;
    }

    public boolean validacionName (String persona) {
        boolean resultado = false;

        if (persona.compareTo(this.name) == 0) {
            resultado = true;
        }
        return resultado;
    }

    public boolean validacionPassword(String contraseña) {
        boolean resultado = false;

        if (contraseña.compareTo(this.password) == 0) {
            resultado = true;
        }
        return resultado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String serializar() {
        return userName+";"+password+";"+name+";"+lastName+";"+dni+";"+email;
    }
}
