package com.example.carmensporty;

import java.util.ArrayList;

public class ListaDePersonas {
    protected ArrayList<Persona> listaDePersonas = new ArrayList();
    public ListaDePersonas() {}

    public void anadirUsuario(String usuario) {
        String[] corte = usuario.split(";");
        Persona user = new Persona(corte[0], corte[1], corte[2], corte[3], corte[4], corte[5]); //posición array users.txt
        listaDePersonas.add(user);
    }

    //public VOID no va a devolver nada mientras que una función public si
    public void registrarUsuario(String name, String password, String nombreUsuario, String apellidos, String dni, String correo) {
        Persona user = new Persona(name,password,nombreUsuario,apellidos,dni,correo);
        listaDePersonas.add(user);

    }

    public Persona getUsuarioByNombre(String name) {
        Persona user = null;

        for (int i = 0; i< listaDePersonas.size(); i++) {
            if(listaDePersonas.get(i).getName().compareTo(name) == 0) {
                user = listaDePersonas.get(i);
            }
        }
        return user;
    }

    public boolean comprobarRegistro(String persona) {
        for (int i=0; i<listaDePersonas.size(); i++) {
            if (listaDePersonas.get(i).getName().compareTo(persona) == 0) {
                return true;
            }
        }
        return false;
    }

    public int getListaSize() {
        return listaDePersonas.size();
    }

    public Persona getUsuarioByIndex(Integer index) {
        return listaDePersonas.get(index);

    }

    public void addPersona(Persona nuevaPersona) {
        listaDePersonas.add(nuevaPersona);
    }
}
