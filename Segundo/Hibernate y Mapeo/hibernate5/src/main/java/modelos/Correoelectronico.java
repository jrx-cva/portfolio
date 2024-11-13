package modelos;

import java.util.Objects;

public class Correoelectronico {
    private int correoId;
    private String direccionesCorreo;
    private Integer profesorId;

    public int getCorreoId() {
        return correoId;
    }

    public void setCorreoId(int correoId) {
        this.correoId = correoId;
    }

    public String getDireccionesCorreo() {
        return direccionesCorreo;
    }

    public void setDireccionesCorreo(String direccionesCorreo) {
        this.direccionesCorreo = direccionesCorreo;
    }

    public Integer getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Integer profesorId) {
        this.profesorId = profesorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Correoelectronico that = (Correoelectronico) o;
        return correoId == that.correoId && Objects.equals(direccionesCorreo, that.direccionesCorreo) && Objects.equals(profesorId, that.profesorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correoId, direccionesCorreo, profesorId);
    }
}
