package modelos;

import java.io.Serializable;
import java.util.Objects;

public class DetallesPK implements Serializable {
    private int pedidoId;
    private int productoId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetallesPK that = (DetallesPK) o;
        return pedidoId == that.pedidoId && productoId == that.productoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoId, productoId);
    }
}
