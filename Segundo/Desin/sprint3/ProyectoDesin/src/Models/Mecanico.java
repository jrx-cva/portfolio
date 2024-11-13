package Models;

/**
 * En esta clase tendremos los datos de los Mecanico de la aplicacion
 */

public class Mecanico extends Usuario{

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idMecanico,idEspecialidad, idJefeMecanico;
	private String tipoEmpleado;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Mecanico() {
		super();
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idMecanico
	 * @param idEspecialidad
	 * @param idJefeMecanico
	 */
	public Mecanico(int idMecanico, int idEspecialidad, int idJefeMecanico, String tipoMecanico) {
		
		super();
		this.idMecanico = idMecanico;
		this.idEspecialidad = idEspecialidad;
		this.idJefeMecanico = idJefeMecanico;
		this.tipoEmpleado = tipoMecanico;
		
	}

	/**
	 * Realizamos los setters/getters de la clase usuario 
	 */
	
	
	public int getIdMecanico() {
		return idMecanico;
	}

	public void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public int getIdJefeMecanico() {
		return idJefeMecanico;
	}

	public void setIdJefeMecanico(int idJefeMecanico) {
		this.idJefeMecanico = idJefeMecanico;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	
	/**
	 * Generamos el toString
	 */
	@Override
	public String toString() {
		return "Mecanico [idMecanico=" + idMecanico + ", idEspecialidad=" + idEspecialidad + ", idJefeMecanico="
				+ idJefeMecanico + ", tipoEmpleado=" + tipoEmpleado + "]";
	}
}
