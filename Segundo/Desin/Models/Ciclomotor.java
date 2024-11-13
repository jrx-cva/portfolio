package Models;

/**
 * En esta clase tendremos los datos de los Ciclomotor de la aplicacion
 */

public class Ciclomotor {
	
	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idCiclomotor, idVehiculo;
	private String tipoCiclomotor;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Ciclomotor() {
		super();
	}
	
	public Ciclomotor(int idCiclomotor, int idVehiculo, String tipoCiclomotor) {
		super();
		this.idCiclomotor = idCiclomotor;
		this.idVehiculo = idVehiculo;
		this.tipoCiclomotor = tipoCiclomotor;
	}
	
	/**
	 * Realizamos los Setters and Getters
	 */

	public int getIdCiclomotor() {
		return idCiclomotor;
	}

	public void setIdCiclomotor(int idCiclomotor) {
		this.idCiclomotor = idCiclomotor;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getTipoCiclomotor() {
		return tipoCiclomotor;
	}

	public void setTipoCiclomotor(String tipoCiclomotor) {
		this.tipoCiclomotor = tipoCiclomotor;
	}

	/**
	 * Generamos el toString
	 */
	
	@Override
	public String toString() {
		return "Ciclomotor [idCiclomotor=" + idCiclomotor + ", idVehiculo=" + idVehiculo + ", tipoCiclomotor="
				+ tipoCiclomotor + "]";
	}
	
	
}
