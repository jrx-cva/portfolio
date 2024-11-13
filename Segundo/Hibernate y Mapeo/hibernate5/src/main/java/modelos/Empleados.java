package modelos;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

public class Empleados {
    private int id;
    private String apellidos;
    private String nombre;
    private String cargo;
    private String tratamiento;
    private Date fechaNacimiento;
    private Date fechaContratacion;
    private String direccion;
    private String ciudad;
    private String region;
    private String cp;
    private String pais;
    private String telefonoDomicilio;
    private String extension;
    private String notas;
    private Integer jefeId;
    private Empleados empleadosByJefeId;
    private Collection<Empleados> empleadosById;
    private Collection<Pedidos> pedidosById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
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

    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    public void setTelefonoDomicilio(String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getJefeId() {
        return jefeId;
    }

    public void setJefeId(Integer jefeId) {
        this.jefeId = jefeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleados empleados = (Empleados) o;
        return id == empleados.id && Objects.equals(apellidos, empleados.apellidos) && Objects.equals(nombre, empleados.nombre) && Objects.equals(cargo, empleados.cargo) && Objects.equals(tratamiento, empleados.tratamiento) && Objects.equals(fechaNacimiento, empleados.fechaNacimiento) && Objects.equals(fechaContratacion, empleados.fechaContratacion) && Objects.equals(direccion, empleados.direccion) && Objects.equals(ciudad, empleados.ciudad) && Objects.equals(region, empleados.region) && Objects.equals(cp, empleados.cp) && Objects.equals(pais, empleados.pais) && Objects.equals(telefonoDomicilio, empleados.telefonoDomicilio) && Objects.equals(extension, empleados.extension) && Objects.equals(notas, empleados.notas) && Objects.equals(jefeId, empleados.jefeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apellidos, nombre, cargo, tratamiento, fechaNacimiento, fechaContratacion, direccion, ciudad, region, cp, pais, telefonoDomicilio, extension, notas, jefeId);
    }

    public Empleados getEmpleadosByJefeId() {
        return empleadosByJefeId;
    }

    public void setEmpleadosByJefeId(Empleados empleadosByJefeId) {
        this.empleadosByJefeId = empleadosByJefeId;
    }

    public Collection<Empleados> getEmpleadosById() {
        return empleadosById;
    }

    public void setEmpleadosById(Collection<Empleados> empleadosById) {
        this.empleadosById = empleadosById;
    }

    public Collection<Pedidos> getPedidosById() {
        return pedidosById;
    }

    public void setPedidosById(Collection<Pedidos> pedidosById) {
        this.pedidosById = pedidosById;
    }
}
