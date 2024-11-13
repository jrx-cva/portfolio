package modelos;

import java.util.Collection;
import java.util.Objects;

public class Proveedores {
    private int id;
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
    private String web;
    private Collection<Productos> productosById;

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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedores that = (Proveedores) o;
        return id == that.id && Objects.equals(empresa, that.empresa) && Objects.equals(contacto, that.contacto) && Objects.equals(cargoContacto, that.cargoContacto) && Objects.equals(direccion, that.direccion) && Objects.equals(ciudad, that.ciudad) && Objects.equals(region, that.region) && Objects.equals(cp, that.cp) && Objects.equals(pais, that.pais) && Objects.equals(telefono, that.telefono) && Objects.equals(fax, that.fax) && Objects.equals(web, that.web);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, empresa, contacto, cargoContacto, direccion, ciudad, region, cp, pais, telefono, fax, web);
    }

    public Collection<Productos> getProductosById() {
        return productosById;
    }

    public void setProductosById(Collection<Productos> productosById) {
        this.productosById = productosById;
    }
}
