package Models;

/**
 * En esta clase tendremos los datos de los Concesionario de la aplicación
 */

public class Concesionario {

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idConcesionario;
	private String cif, nombreConcesionario, provincia, direccionConcesionario, descripcionConcesionario;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Concesionario() {
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idConcesionario
	 * @param cif 
	 * @param nombreConcesionario 
	 * @param provincia 
	 * @param direccionConcesionario 
	 * @param descripcionConcesionario 
	 */
	public Concesionario(int idConcesionario, String cif, String nombreConcesionario, String provincia, String direccionConcesionario, String descripcionConcesionario) {
		
		this.idConcesionario = idConcesionario;
		this.cif = cif;
		this.nombreConcesionario = nombreConcesionario;
		this.provincia = provincia;
		this.direccionConcesionario = direccionConcesionario;
		this.descripcionConcesionario = descripcionConcesionario;
	}

	/**
	 * Realizamos los Getters and Setters
	 */
	
	public int getIdConcesionario() {
		return idConcesionario;
	}

	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombreConcesionario() {
		return nombreConcesionario;
	}

	public void setNombreConcesionario(String nombreConcesionario) {
		this.nombreConcesionario = nombreConcesionario;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDireccionConcesionario() {
		return direccionConcesionario;
	}

	public void setDireccionConcesionario(String direccionConcesionario) {
		this.direccionConcesionario = direccionConcesionario;
	}

	public String getDescripcionConcesionario() {
		return descripcionConcesionario;
	}

	public void setDescripcionConcesionario(String descripcionConcesionario) {
		this.descripcionConcesionario = descripcionConcesionario;
	}

	/**
	 * Generamos el toString
	 */
	
	@Override
	public String toString() {
		return "Concesionario [idConcesionario=" + idConcesionario + ", cif=" + cif + ", nombreConcesionario="
				+ nombreConcesionario + ", provincia=" + provincia + ", direccionConcesionario="
				+ direccionConcesionario + ", descripcionConcesionario=" + descripcionConcesionario + "]";
	}
	
	
}
