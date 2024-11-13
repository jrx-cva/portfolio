package Models;

/**
 * En esta clase tendremos los datos de los Vehiculo de la aplicacion
 */


public class Vehiculo {
	
	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idVehiculo, idConcesionario, idCliente, idVentas;
	private String numBastidor, matricula, marca, modelo, color, potencia, anio, descripcionVeehiculo, combustible, tipoVehiculo;
	private float precio;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Vehiculo() {
		
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idVehiculo
	 * @param idConcesionario
	 * @param idCliente
	 * @param idVentas
	 * @param numBastidor
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param color
	 * @param potencia
	 * @param anio
	 * @param descripcionVeehiculo
	 */
	public Vehiculo(int idVehiculo, int idConcesionario, int idCliente, int idVentas, String numBastidor, String matricula, String marca, 
			String modelo, String tipoVehiculo, String color, String potencia, String anio, String combustible, float precio,
			String descripcionVeehiculo) {
		
		this.idVehiculo = idVehiculo;
		this.idConcesionario = idConcesionario;
		this.idCliente = idCliente;
		this.idVentas = idVentas;
		this.numBastidor = numBastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.color = color;
		this.potencia = potencia;
		this.anio = anio;
		this.combustible = combustible;
		this.precio = precio;
		this.descripcionVeehiculo = descripcionVeehiculo;
	}
	
	public Vehiculo(int idConcesionario, int idCliente, int idVentas, String numBastidor, String matricula,
			String marca, String modelo, String tipoVehiculo, String color, String potencia, String anio,
			String combustible, float precio, String descripcionVeehiculo) {
		this.idConcesionario = idConcesionario;
		this.idCliente = idCliente;
		this.idVentas = idVentas;
		this.numBastidor = numBastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipoVehiculo = tipoVehiculo;
		this.color = color;
		this.potencia = potencia;
		this.anio = anio;
		this.combustible = combustible;
		this.precio = precio;
		this.descripcionVeehiculo = descripcionVeehiculo;
	}

	/**
	 * Realizamos los Setters and Getters
	 */

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdVentas() {
		return idVentas;
	}

	public void setIdVentas(int idVentas) {
		this.idVentas = idVentas;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getDescripcionVeehiculo() {
		return descripcionVeehiculo;
	}

	public void setDescripcionVeehiculo(String descripcionVeehiculo) {
		this.descripcionVeehiculo = descripcionVeehiculo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	/**
	 * Generamos el toString
	 */

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", idConcesionario=" + idConcesionario + ", idCliente="
				+ idCliente + ", idVentas=" + idVentas + ", numBastidor=" + numBastidor + ", matricula=" + matricula
				+ ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", anio="
				+ anio + ", descripcionVeehiculo=" + descripcionVeehiculo + ", precio=" + precio + ", tipoVehiculo="
				+ tipoVehiculo + ", combustible=" + combustible + "]";
	}
	
	
}
