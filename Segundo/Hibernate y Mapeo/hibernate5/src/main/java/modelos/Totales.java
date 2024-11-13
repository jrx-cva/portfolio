package modelos;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class Totales {
    private int id;
    private Date fechaPedido;
    private int clienteId;
    private Integer empleadoId;
    private Integer envioId;
    private BigDecimal cargo;
    private Double importe;
    private Double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Integer getEnvioId() {
        return envioId;
    }

    public void setEnvioId(Integer envioId) {
        this.envioId = envioId;
    }

    public BigDecimal getCargo() {
        return cargo;
    }

    public void setCargo(BigDecimal cargo) {
        this.cargo = cargo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Totales totales = (Totales) o;
        return id == totales.id && clienteId == totales.clienteId && Objects.equals(fechaPedido, totales.fechaPedido) && Objects.equals(empleadoId, totales.empleadoId) && Objects.equals(envioId, totales.envioId) && Objects.equals(cargo, totales.cargo) && Objects.equals(importe, totales.importe) && Objects.equals(total, totales.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaPedido, clienteId, empleadoId, envioId, cargo, importe, total);
    }
}
