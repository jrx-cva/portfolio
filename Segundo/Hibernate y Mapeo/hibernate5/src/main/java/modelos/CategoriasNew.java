package modelos;

import java.util.Collection;
import java.util.Objects;

public class CategoriasNew {
    private int id;
    private String categoria;
    private String descripcion;
    private Collection<ProductosNew> productosNewsById;

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
        CategoriasNew that = (CategoriasNew) o;
        return id == that.id && Objects.equals(categoria, that.categoria) && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoria, descripcion);
    }

    public Collection<ProductosNew> getProductosNewsById() {
        return productosNewsById;
    }

    public void setProductosNewsById(Collection<ProductosNew> productosNewsById) {
        this.productosNewsById = productosNewsById;
    }
}
