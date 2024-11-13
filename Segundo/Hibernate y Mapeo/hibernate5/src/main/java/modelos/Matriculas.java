package modelos;

import java.util.Objects;

public class Matriculas {
    private int matriculaId;

    public int getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(int matriculaId) {
        this.matriculaId = matriculaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matriculas that = (Matriculas) o;
        return matriculaId == that.matriculaId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculaId);
    }
}
