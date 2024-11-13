package modelos;

import java.util.Collection;
import java.util.Objects;

public class Envios {
    private int id;
    private String empresa;
    private String telefono;
    private Collection<Pedidos> pedidosById;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Envios envios = (Envios) o;
        return id == envios.id && Objects.equals(empresa, envios.empresa) && Objects.equals(telefono, envios.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empresa, telefono);
    }

    public Collection<Pedidos> getPedidosById() {
        return pedidosById;
    }

    public void setPedidosById(Collection<Pedidos> pedidosById) {
        this.pedidosById = pedidosById;
    }
}
