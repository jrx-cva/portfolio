package modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class Detalles {
    private int pedidoId;
    private int productoId;
    private BigDecimal precioUnidad;
    private Short cantidad;
    private Double descuento;
    private int id;
    private Pedidos pedidosByPedidoId;
    private Productos productosByProductoId;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detalles detalles = (Detalles) o;
        return pedidoId == detalles.pedidoId && productoId == detalles.productoId && id == detalles.id && Objects.equals(precioUnidad, detalles.precioUnidad) && Objects.equals(cantidad, detalles.cantidad) && Objects.equals(descuento, detalles.descuento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoId, productoId, precioUnidad, cantidad, descuento, id);
    }

    public Pedidos getPedidosByPedidoId() {
        return pedidosByPedidoId;
    }

    public void setPedidosByPedidoId(Pedidos pedidosByPedidoId) {
        this.pedidosByPedidoId = pedidosByPedidoId;
    }

    public Productos getProductosByProductoId() {
        return productosByProductoId;
    }

    public void setProductosByProductoId(Productos productosByProductoId) {
        this.productosByProductoId = productosByProductoId;
    }
}
