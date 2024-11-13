package Models;

/**
 * En esta clase tendremos los datos de los Motocicleta de la aplicacion
 */

public class Motocicleta {

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idMotocicleta, idVehiculo, numPlazas;
	private String tipoFreno, tipoMotocicleta, tipoHorquilla;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Motocicleta() {
		super();
	}
	
	public Motocicleta(int idMotocicleta, int idVehiculo, int numPlazas, String tipoFreno, String tipoMotocicleta, String tipoHorquilla) {
		super();
		this.idMotocicleta = idMotocicleta;
		this.idVehiculo = idVehiculo;
		this.numPlazas = numPlazas;
		this.tipoFreno = tipoFreno;
		this.tipoMotocicleta = tipoMotocicleta;
		this.tipoHorquilla = tipoHorquilla;
	}

	/**
	 * Realizamos los Setters and Getters
	 */
	
	public int getIdMotocicleta() {
		return idMotocicleta;
	}

	public void setIdMotocicleta(int idMotocicleta) {
		this.idMotocicleta = idMotocicleta;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String getTipoFreno() {
		return tipoFreno;
	}

	public void setTipoFreno(String tipoFreno) {
		this.tipoFreno = tipoFreno;
	}

	public String getTipoMotocicleta() {
		return tipoMotocicleta;
	}

	public void setTipoMotocicleta(String tipoMotocicleta) {
		this.tipoMotocicleta = tipoMotocicleta;
	}

	public String getTipoHorquilla() {
		return tipoHorquilla;
	}

	public void setTipoHorquilla(String tipoHorquilla) {
		this.tipoHorquilla = tipoHorquilla;
	}

	/**
	 * Generamos el toString
	 */
	@Override
	public String toString() {
		return "Motocicleta [idMotocicleta=" + idMotocicleta + ", idVehiculo=" + idVehiculo + ", numPlazas=" + numPlazas
				+ ", tipoFreno=" + tipoFreno + ", tipoMotocicleta=" + tipoMotocicleta + ", tipoHorquilla="
				+ tipoHorquilla + "]";
	}
}
