package Models;

/**
 * 
 * @author Laura
 *
 * En esta clase tendremos los datos de los Repara de la aplicacion
 */

public class Repara {

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idRepara, idVehiculo, idMecanico;
	private double horasReparacion;
	private String fechaInicio, fechaFin, tipoReparacion, descipcionReparacion;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Repara() {
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idRepar
	 * @param idVehiculo
	 * @param idMecanico
	 * @param horasReparacion
	 * @param fechaInicio
	 * @param fechaFin
	 * @param tipoReparacion
	 * @param descipcionReparacion
	 */
	public Repara(int idRepara, int idVehiculo, int idMecanico, double horasReparacion, String fechaInicio, 
				String fechaFin, String tipoReparacion, String descipcionReparacion) {
		this.idRepara = idRepara;
		this.idVehiculo = idVehiculo;
		this.idMecanico = idMecanico;
		this.horasReparacion = horasReparacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoReparacion = tipoReparacion;
		this.descipcionReparacion = descipcionReparacion;
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idVehiculo
	 * @param idMecanico
	 * @param horasReparacion
	 * @param fechaInicio
	 * @param fechaFin
	 * @param tipoReparacion
	 * @param descipcionReparacion
	 */
	public Repara(int idVehiculo, int idMecanico, double horasReparacion, String fechaInicio, 
				String fechaFin, String tipoReparacion, String descipcionReparacion) {
		this.idVehiculo = idVehiculo;
		this.idMecanico = idMecanico;
		this.horasReparacion = horasReparacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tipoReparacion = tipoReparacion;
		this.descipcionReparacion = descipcionReparacion;
	}
	
	/**
	 * Realizamos los Setters and Getters
	 */

	public int getIdRepara() {
		return idRepara;
	}

	public void setIdRepara(int idRepara) {
		this.idRepara = idRepara;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getIdMecanico() {
		return idMecanico;
	}

	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}

	public double getHorasReparacion() {
		return horasReparacion;
	}

	public void setHorasReparacion(float horasReparacion) {
		this.horasReparacion = horasReparacion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getTipoReparacion() {
		return tipoReparacion;
	}

	public void setTipoReparacion(String tipoReparacion) {
		this.tipoReparacion = tipoReparacion;
	}

	public String getDescipcionReparacion() {
		return descipcionReparacion;
	}

	public void setDescipcionReparacion(String descipcionReparacion) {
		this.descipcionReparacion = descipcionReparacion;
	}
	
	/**
	 * Generamos el toString
	 */

	@Override
	public String toString() {
		return "Repara [idRepara=" + idRepara + ", idVehiculo=" + idVehiculo + ", idMecanico=" + idMecanico
				+ ", horasReparacion=" + horasReparacion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", tipoReparacion=" + tipoReparacion + ", descipcionReparacion=" + descipcionReparacion + "]";
	}
	
	
}
