package modelos;

import java.util.Objects;

public class Superusuarios {
    private int idUser;
    private String apellidos;
    private String nombre;
    private String user;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superusuarios that = (Superusuarios) o;
        return idUser == that.idUser && Objects.equals(apellidos, that.apellidos) && Objects.equals(nombre, that.nombre) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, apellidos, nombre, user);
    }
}
