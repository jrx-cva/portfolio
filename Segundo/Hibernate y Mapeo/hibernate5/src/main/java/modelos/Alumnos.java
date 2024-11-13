package modelos;

import java.util.Objects;

public class Alumnos {
    private int idAlumnos;
    private String nombre;
    private String apellidos;
    private int alumnoId;

    public Alumnos() {

    }

    public Alumnos(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "idAlumnos=" + idAlumnos +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public int getIdAlumnos() {
        return idAlumnos;
    }

    public void setIdAlumnos(int idAlumnos) {
        this.idAlumnos = idAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return idAlumnos == alumnos.idAlumnos && alumnoId == alumnos.alumnoId && Objects.equals(nombre, alumnos.nombre) && Objects.equals(apellidos, alumnos.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumnoId, apellidos, nombre, idAlumnos);
    }
}
