package modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class Importes {
    private int pedidoId;
    private int productoId;
    private BigDecimal precioUnidad;
    private Short cantidad;
    private Double descuento;
    private Double importe;

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public BigDecimal getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(BigDecimal precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Short getCantidad() {
        return cantidad;
    }

    public void setCantidad(Short cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Importes importes = (Importes) o;
        return pedidoId == importes.pedidoId && productoId == importes.productoId && Objects.equals(precioUnidad, importes.precioUnidad) && Objects.equals(cantidad, importes.cantidad) && Objects.equals(descuento, importes.descuento) && Objects.equals(importe, importes.importe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoId, productoId, precioUnidad, cantidad, descuento, importe);
    }
}
