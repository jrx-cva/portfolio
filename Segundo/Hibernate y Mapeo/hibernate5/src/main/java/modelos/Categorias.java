package modelos;

import java.util.Collection;
import java.util.Objects;

public class Categorias {
    private int id;
    private String categoria;
    private String descripcion;
    private Collection<Productos> productosById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorias that = (Categorias) o;
        return id == that.id && Objects.equals(categoria, that.categoria) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoria, descripcion);
    }

    public Collection<Productos> getProductosById() {
        return productosById;
    }

    public void setProductosById(Collection<Productos> productosById) {
        this.productosById = productosById;
    }
}
