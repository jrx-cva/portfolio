package modelos;

import java.util.Collection;
import java.util.Objects;

public class ProveedoresNew {
    private int id;
    private String empresa;
    private String contacto;
    private Collection<ProductosNew> productosNewsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProveedoresNew that = (ProveedoresNew) o;
        return id == that.id && Objects.equals(empresa, that.empresa) && Objects.equals(contacto, that.contacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empresa, contacto);
    }

    public Collection<ProductosNew> getProductosNewsById() {
        return productosNewsById;
    }

    public void setProductosNewsById(Collection<ProductosNew> productosNewsById) {
        this.productosNewsById = productosNewsById;
    }
}
