package Models;

/**
 * En esta clase tendremos los datos de los Jefe de la aplicacion
 */

public class Jefe extends Usuario{
	
	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idJefe;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Jefe() {
		super();
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idJefe
	 */
	public Jefe(int idJefe) {
		
		super();
		this.idJefe = idJefe;		
	}
	
	/**
	 * Realizamos Setters and Getters
	 */
	
	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	
	/**
	 * Generamos el toString
	 */
	
	@Override
	public String toString() {
		return "Jefe [idUsuario=" + super.getId_usuario()+ ", idJefe=" + idJefe + "]";
	}	
}
