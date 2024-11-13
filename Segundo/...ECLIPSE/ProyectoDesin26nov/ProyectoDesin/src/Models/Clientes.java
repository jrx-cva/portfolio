package Models;

/**
 * En esta clase tendremos los datos de los Clientes de la aplicacion
 */

public class Clientes {

	/**
	 * Definimos los atributos de usuarios
	 */
	private int idCliente;
	private String nombreCliente, dniCliente, emailCliente, numCuenta;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Clientes() {
		
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idCliente
	 * @param nombreCliente
	 * @param dniCliente
	 * @param emailCliente
	 * @param numCuenta
	 */
	public Clientes(int idCliente, String nombreCliente, String dniCliente, String emailCliente,String numCuenta) {
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.emailCliente = emailCliente;
		this.numCuenta = numCuenta;
	}

	public Clientes(String nombreCliente, String dniCliente, String emailCliente, String numCuenta) {
		this.nombreCliente = nombreCliente;
		this.dniCliente = dniCliente;
		this.emailCliente = emailCliente;
		this.numCuenta = numCuenta;
	}

	/**
	 * Relaizamos los los Setters and Getters
	 */
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	/**
	 * Generamos el toString
	 */
	
	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente
				+ ", emailCliente=" + emailCliente + ", numCuenta=" + numCuenta + "]";
	}
	
	
}
