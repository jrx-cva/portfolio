package modelos;

import java.util.Objects;

public class Profesor {
    private int id;
    private String apellidos1;
    private String appellidos2;
    private String nombres;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public String getAppellidos2() {
        return appellidos2;
    }

    public void setAppellidos2(String appellidos2) {
        this.appellidos2 = appellidos2;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return id == profesor.id && Objects.equals(apellidos1, profesor.apellidos1) && Objects.equals(appellidos2, profesor.appellidos2) && Objects.equals(nombres, profesor.nombres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apellidos1, appellidos2, nombres);
    }
}
