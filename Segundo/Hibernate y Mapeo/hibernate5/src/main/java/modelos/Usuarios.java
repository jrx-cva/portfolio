package modelos;

import java.util.Objects;

public class Usuarios {
    private String nombre;
    private String clave;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(nombre, usuarios.nombre) && Objects.equals(clave, usuarios.clave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, clave);
    }
}
