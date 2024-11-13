package modelos;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

public class Productos {
    private int id;
    private String producto;
    private Integer proveedorId;
    private Integer categoriaId;
    private String cantidadPorUnidad;
    private BigDecimal precioUnidad;
    private Short unidadesExistencia;
    private Short unidadesPedido;
    private Integer nivelNuevoPedido;
    private byte suspendido;
    private String notas;
    private BigDecimal iva;
    private Collection<Detalles> detallesById;
    private Proveedores proveedoresByProveedorId;
    private Categorias categoriasByCategoriaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getProveedorId() {
        return proveedorId;
    }

    public void setProveedorId(Integer proveedorId) {
        this.proveedorId = proveedorId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getCantidadPorUnidad() {
        return cantidadPorUnidad;
    }

    public void setCantidadPorUnidad(String cantidadPorUnidad) {
        this.cantidadPorUnidad = cantidadPorUnidad;
    }

    public BigDecimal getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(BigDecimal precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Short getUnidadesExistencia() {
        return unidadesExistencia;
    }

    public void setUnidadesExistencia(Short unidadesExistencia) {
        this.unidadesExistencia = unidadesExistencia;
    }

    public Short getUnidadesPedido() {
        return unidadesPedido;
    }

    public void setUnidadesPedido(Short unidadesPedido) {
        this.unidadesPedido = unidadesPedido;
    }

    public Integer getNivelNuevoPedido() {
        return nivelNuevoPedido;
    }

    public void setNivelNuevoPedido(Integer nivelNuevoPedido) {
        this.nivelNuevoPedido = nivelNuevoPedido;
    }

    public byte getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(byte suspendido) {
        this.suspendido = suspendido;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Productos productos = (Productos) o;
        return id == productos.id && suspendido == productos.suspendido && Objects.equals(producto, productos.producto) && Objects.equals(proveedorId, productos.proveedorId) && Objects.equals(categoriaId, productos.categoriaId) && Objects.equals(cantidadPorUnidad, productos.cantidadPorUnidad) && Objects.equals(precioUnidad, productos.precioUnidad) && Objects.equals(unidadesExistencia, productos.unidadesExistencia) && Objects.equals(unidadesPedido, productos.unidadesPedido) && Objects.equals(nivelNuevoPedido, productos.nivelNuevoPedido) && Objects.equals(notas, productos.notas) && Objects.equals(iva, productos.iva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, producto, proveedorId, categoriaId, cantidadPorUnidad, precioUnidad, unidadesExistencia, unidadesPedido, nivelNuevoPedido, suspendido, notas, iva);
    }

    public Collection<Detalles> getDetallesById() {
        return detallesById;
    }

    public void setDetallesById(Collection<Detalles> detallesById) {
        this.detallesById = detallesById;
    }

    public Proveedores getProveedoresByProveedorId() {
        return proveedoresByProveedorId;
    }

    public void setProveedoresByProveedorId(Proveedores proveedoresByProveedorId) {
        this.proveedoresByProveedorId = proveedoresByProveedorId;
    }

    public Categorias getCategoriasByCategoriaId() {
        return categoriasByCategoriaId;
    }

    public void setCategoriasByCategoriaId(Categorias categoriasByCategoriaId) {
        this.categoriasByCategoriaId = categoriasByCategoriaId;
    }
}
