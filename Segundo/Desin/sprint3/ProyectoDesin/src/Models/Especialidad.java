package Models;

/**
 * En esta clase tendremos los datos de los Especialidad de la aplicacion
 */

public class Especialidad {

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idEspecialidad;
	private String nombreEspecialidad, descrpcionEspecialidad;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Especialidad() {
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idEspecialidad
	 * @param nombreEspecialidad
	 * @param descripcionEspecialidad
	 */
	public Especialidad(int idEspecialidad, String nombreEspecialidad, String descripcionEspecialidad) {
		
		this.idEspecialidad = idEspecialidad;	
		this.nombreEspecialidad = nombreEspecialidad;
		this.descrpcionEspecialidad = descripcionEspecialidad;
	}
	
	/**
	 * Realizamos Setters and Getters
	 */

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public String getDescrpcionEspecialidad() {
		return descrpcionEspecialidad;
	}

	public void setDescrpcionEspecialidad(String descrpcionEspecialidad) {
		this.descrpcionEspecialidad = descrpcionEspecialidad;
	}

	/**
	 * Generamos el toString 
	 */
	
	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", nombreEspecialidad=" + nombreEspecialidad
				+ ", descrpcionEspecialidad=" + descrpcionEspecialidad + "]";
	}
	
	
}
