package modelos;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Pedidos {
    private int id;
    private int clienteId;
    private Integer empleadoId;
    private Date fechaPedido;
    private Date fechaEntrega;
    private Date fechaEnvio;
    private Integer envioId;
    private BigDecimal cargo;
    private String destinatario;
    private String direccionDestinatario;
    private String ciudadDestinatario;
    private String regionDestinatario;
    private String cpDestinatario;
    private String paisDestinatario;
    private Collection<Detalles> detallesById;
    private Clientes clientesByClienteId;
    private Empleados empleadosByEmpleadoId;
    private Envios enviosByEnvioId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
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

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public String getCiudadDestinatario() {
        return ciudadDestinatario;
    }

    public void setCiudadDestinatario(String ciudadDestinatario) {
        this.ciudadDestinatario = ciudadDestinatario;
    }

    public String getRegionDestinatario() {
        return regionDestinatario;
    }

    public void setRegionDestinatario(String regionDestinatario) {
        this.regionDestinatario = regionDestinatario;
    }

    public String getCpDestinatario() {
        return cpDestinatario;
    }

    public void setCpDestinatario(String cpDestinatario) {
        this.cpDestinatario = cpDestinatario;
    }

    public String getPaisDestinatario() {
        return paisDestinatario;
    }

    public void setPaisDestinatario(String paisDestinatario) {
        this.paisDestinatario = paisDestinatario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedidos pedidos = (Pedidos) o;
        return id == pedidos.id && clienteId == pedidos.clienteId && Objects.equals(empleadoId, pedidos.empleadoId) && Objects.equals(fechaPedido, pedidos.fechaPedido) && Objects.equals(fechaEntrega, pedidos.fechaEntrega) && Objects.equals(fechaEnvio, pedidos.fechaEnvio) && Objects.equals(envioId, pedidos.envioId) && Objects.equals(cargo, pedidos.cargo) && Objects.equals(destinatario, pedidos.destinatario) && Objects.equals(direccionDestinatario, pedidos.direccionDestinatario) && Objects.equals(ciudadDestinatario, pedidos.ciudadDestinatario) && Objects.equals(regionDestinatario, pedidos.regionDestinatario) && Objects.equals(cpDestinatario, pedidos.cpDestinatario) && Objects.equals(paisDestinatario, pedidos.paisDestinatario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clienteId, empleadoId, fechaPedido, fechaEntrega, fechaEnvio, envioId, cargo, destinatario, direccionDestinatario, ciudadDestinatario, regionDestinatario, cpDestinatario, paisDestinatario);
    }

    public Collection<Detalles> getDetallesById() {
        return detallesById;
    }

    public void setDetallesById(Collection<Detalles> detallesById) {
        this.detallesById = detallesById;
    }

    public Clientes getClientesByClienteId() {
        return clientesByClienteId;
    }

    public void setClientesByClienteId(Clientes clientesByClienteId) {
        this.clientesByClienteId = clientesByClienteId;
    }

    public Empleados getEmpleadosByEmpleadoId() {
        return empleadosByEmpleadoId;
    }

    public void setEmpleadosByEmpleadoId(Empleados empleadosByEmpleadoId) {
        this.empleadosByEmpleadoId = empleadosByEmpleadoId;
    }

    public Envios getEnviosByEnvioId() {
        return enviosByEnvioId;
    }

    public void setEnviosByEnvioId(Envios enviosByEnvioId) {
        this.enviosByEnvioId = enviosByEnvioId;
    }
}
