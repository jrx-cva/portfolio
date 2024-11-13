package Models;

/**
 * En esta clase tendremos los datos de los Propuesta de la aplicacion
 */

public class Propuesta {

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private Integer idPropuesta, idVentas, idCliente, idVehiculo;
	private Float precioPropuesta;
	private String nombreUsuario, fechaPropuesta, fechaValidez, descripcionPropuesta, estadoPropuesta;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Propuesta() {
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo Integerroduzcamos nosotros.
	 * @param idPropuesta
	 * @param idVentas
	 * @param idCliente
	 * @param idVehiculo
	 * @param precioPropuesta
	 * @param fechaPropuesta
	 * @param fechaValidez
	 * @param descrpcionPropuesta
	 */
	public Propuesta(Integer idPropuesta,Integer idVentas,Integer idCliente,Integer idVehiculo,Float precioPropuesta, 
				String nombreUsuario, String fechaPropuesta, String fechaValidez, String descrpcionPropuesta, String estadoPropuesta) {
		this.idPropuesta = idPropuesta;
		this.idVentas = idVentas;
		this.idCliente = idCliente;
		this.idVehiculo = idVehiculo;
		this.precioPropuesta = precioPropuesta;
		this.nombreUsuario = nombreUsuario;
		this.fechaPropuesta = fechaPropuesta;
		this.fechaValidez = fechaValidez;
		this.descripcionPropuesta = descrpcionPropuesta;
		this.estadoPropuesta = estadoPropuesta;
		
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo Integerroduzcamos nosotros.
	 * @param idVentas
	 * @param idCliente
	 * @param idVehiculo
	 * @param precioPropuesta
	 * @param fechaPropuesta
	 * @param fechaValidez
	 * @param descrpcionPropuesta
	 */
	public Propuesta(Float precioPropuesta, String nombreUsuario, String fechaPropuesta, String descrpcionPropuesta) {
		
		this.precioPropuesta = precioPropuesta;
		this.nombreUsuario = nombreUsuario;
		this.fechaPropuesta = fechaPropuesta;
		this.fechaValidez = fechaValidez;
		this.descripcionPropuesta = descrpcionPropuesta;
		
	}
	
	/**
	 * Realizamos los Setters and Getters
	 */

	public Integer getIdPropuesta() {
		return idPropuesta;
	}

	public void setIdPropuesta(Integer idPropuesta) {
		this.idPropuesta = idPropuesta;
	}

	public Integer getIdVentas() {
		return idVentas;
	}

	public void setIdVentas(Integer idVentas) {
		this.idVentas = idVentas;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public Float getPrecioPropuesta() {
		return precioPropuesta;
	}

	public void setPrecioPropuesta(Float precioPropuesta) {
		this.precioPropuesta = precioPropuesta;
	}

	public String getFechaPropuesta() {
		return fechaPropuesta;
	}

	public void setFechaPropuesta(String fechaPropuesta) {
		this.fechaPropuesta = fechaPropuesta;
	}

	public String getFechaValidez() {
		return fechaValidez;
	}

	public void setFechaValidez(String fechaValidez) {
		this.fechaValidez = fechaValidez;
	}

	public String getDescripcionPropuesta() {
		return descripcionPropuesta;
	}

	public void setDescripcionPropuesta(String descripcionPropuesta) {
		this.descripcionPropuesta = descripcionPropuesta;
	}

	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getEstadoPropuesta() {
		return estadoPropuesta;
	}

	public void setEstadoPropuesta(String estadoPropuesta) {
		this.estadoPropuesta = estadoPropuesta;
	}

	@Override
	public String toString() {
		return "Propuesta [idPropuesta=" + idPropuesta + ", idVentas=" + idVentas + ", idCliente=" + idCliente
				+ ", idVehiculo=" + idVehiculo + ", precioPropuesta=" + precioPropuesta + ", nombreUsuario="
				+ nombreUsuario + ", fechaPropuesta=" + fechaPropuesta + ", fechaValidez=" + fechaValidez
				+ ", descripcionPropuesta=" + descripcionPropuesta + ", estadoPropuesta=" + estadoPropuesta + "]";
	}

}
