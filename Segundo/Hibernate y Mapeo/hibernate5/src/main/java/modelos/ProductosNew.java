package modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductosNew {
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
    private ProveedoresNew proveedoresNewByProveedorId;
    private CategoriasNew categoriasNewByCategoriaId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductosNew that = (ProductosNew) o;
        return id == that.id && suspendido == that.suspendido && Objects.equals(producto, that.producto) && Objects.equals(proveedorId, that.proveedorId) && Objects.equals(categoriaId, that.categoriaId) && Objects.equals(cantidadPorUnidad, that.cantidadPorUnidad) && Objects.equals(precioUnidad, that.precioUnidad) && Objects.equals(unidadesExistencia, that.unidadesExistencia) && Objects.equals(unidadesPedido, that.unidadesPedido) && Objects.equals(nivelNuevoPedido, that.nivelNuevoPedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, producto, proveedorId, categoriaId, cantidadPorUnidad, precioUnidad, unidadesExistencia, unidadesPedido, nivelNuevoPedido, suspendido);
    }

    public ProveedoresNew getProveedoresNewByProveedorId() {
        return proveedoresNewByProveedorId;
    }

    public void setProveedoresNewByProveedorId(ProveedoresNew proveedoresNewByProveedorId) {
        this.proveedoresNewByProveedorId = proveedoresNewByProveedorId;
    }

    public CategoriasNew getCategoriasNewByCategoriaId() {
        return categoriasNewByCategoriaId;
    }

    public void setCategoriasNewByCategoriaId(CategoriasNew categoriasNewByCategoriaId) {
        this.categoriasNewByCategoriaId = categoriasNewByCategoriaId;
    }
}
