package modelos;

import java.util.Objects;

public class Clavesanteriores {
    private int numero;
    private String nombre;
    private String clave;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

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
        Clavesanteriores that = (Clavesanteriores) o;
        return numero == that.numero && Objects.equals(nombre, that.nombre) && Objects.equals(clave, that.clave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, nombre, clave);
    }
}
