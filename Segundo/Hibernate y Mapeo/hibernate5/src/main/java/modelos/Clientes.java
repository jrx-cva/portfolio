package modelos;

import java.util.Collection;
import java.util.Objects;

public class Clientes {
    private int id;
    private String codigo;
    private String empresa;
    private String contacto;
    private String cargoContacto;
    private String direccion;
    private String ciudad;
    private String region;
    private String cp;
    private String pais;
    private String telefono;
    private String fax;
    private Collection<Pedidos> pedidosById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return id == clientes.id && Objects.equals(codigo, clientes.codigo) && Objects.equals(empresa, clientes.empresa) && Objects.equals(contacto, clientes.contacto) && Objects.equals(cargoContacto, clientes.cargoContacto) && Objects.equals(direccion, clientes.direccion) && Objects.equals(ciudad, clientes.ciudad) && Objects.equals(region, clientes.region) && Objects.equals(cp, clientes.cp) && Objects.equals(pais, clientes.pais) && Objects.equals(telefono, clientes.telefono) && Objects.equals(fax, clientes.fax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, empresa, contacto, cargoContacto, direccion, ciudad, region, cp, pais, telefono, fax);
    }

    public Collection<Pedidos> getPedidosById() {
        return pedidosById;
    }

    public void setPedidosById(Collection<Pedidos> pedidosById) {
        this.pedidosById = pedidosById;
    }
}
