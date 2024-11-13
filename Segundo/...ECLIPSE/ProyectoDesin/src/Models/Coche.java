package Models;

/**
 * En esta clase tendremos los datos de los Coche de la aplicacion
 */

public class Coche extends Vehiculo{

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idCoche, idVehiculo, numPlaza;
	private String tipoRadio, tipoFreno, tipoEmbrague;
	private TipoEmision tipoEmision;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Coche() {
		super();
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idCoche
	 * @param idVehiculo
	 * @param numPlaza
	 * @param tipoRadio
	 * @param tipoFreno
	 * @param tipoEmbrague
	 * @param tipoEmision
	 */
	
	public Coche(int idCoche, int idVehiculo, int numPlaza, String tipoRadio, String tipoFreno,
			String tipoEmbrague, TipoEmision tipoEmision) {
		super();
		this.idCoche = idCoche;
		this.idVehiculo = idVehiculo;
		this.numPlaza = numPlaza;
		this.tipoRadio = tipoRadio;
		this.tipoFreno = tipoFreno;
		this.tipoEmbrague = tipoEmbrague;
		this.tipoEmision = tipoEmision;
	}

	/**
	 * Realizar los Setters and Getters
	 */
	
	public int getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(int idCoche) {
		this.idCoche = idCoche;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getNumPlaza() {
		return numPlaza;
	}

	public void setNumPlaza(int numPlaza) {
		this.numPlaza = numPlaza;
	}

	public String getTipoRadio() {
		return tipoRadio;
	}

	public void setTipoRadio(String tipoRadio) {
		this.tipoRadio = tipoRadio;
	}

	public String getTipoFreno() {
		return tipoFreno;
	}

	public void setTipoFreno(String tipoFreno) {
		this.tipoFreno = tipoFreno;
	}

	public String getTipoEmbrague() {
		return tipoEmbrague;
	}

	public void setTipoEmbrague(String tipoEmbrague) {
		this.tipoEmbrague = tipoEmbrague;
	}

	public TipoEmision getTipoEmision() {
		return tipoEmision;
	}

	public void setTipoEmision(TipoEmision tipoEmision) {
		this.tipoEmision = tipoEmision;
	}

	/**
	 * Generamos el toString
	 */
	
	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", idVehiculo=" + idVehiculo + ", numPlaza=" + numPlaza + ", tipoRadio="
				+ tipoRadio + ", tipoFreno=" + tipoFreno + ", tipoEmbrague=" + tipoEmbrague + ", tipoEmision="
				+ tipoEmision + "]";
	}
}
