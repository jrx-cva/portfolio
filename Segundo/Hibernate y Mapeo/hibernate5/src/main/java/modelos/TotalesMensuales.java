package modelos;

import java.sql.Date;
import java.util.Objects;

public class TotalesMensuales {
    private Integer año;
    private Integer mes;
    private Date fecha;
    private Long cargo;
    private Double importe;
    private Double total;
    private long numPedidos;

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getCargo() {
        return cargo;
    }

    public void setCargo(Long cargo) {
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

    public long getNumPedidos() {
        return numPedidos;
    }

    public void setNumPedidos(long numPedidos) {
        this.numPedidos = numPedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalesMensuales that = (TotalesMensuales) o;
        return numPedidos == that.numPedidos && Objects.equals(año, that.año) && Objects.equals(mes, that.mes) && Objects.equals(fecha, that.fecha) && Objects.equals(cargo, that.cargo) && Objects.equals(importe, that.importe) && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(año, mes, fecha, cargo, importe, total, numPedidos);
    }
}
