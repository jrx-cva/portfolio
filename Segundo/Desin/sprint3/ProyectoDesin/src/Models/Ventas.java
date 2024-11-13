package Models;

/**
 * En esta clase tendremos los datos de los Ventas de la aplicación
 */
public class Ventas extends Usuario{

	/**
	 * Definimos los atributos de usuarios
	 */
	
	private int idVentas, numVendidos;
	private String fechaVenta;
	
	/**
	 * Creamos un constructor vacio siempre esta bien tenerlo
	 */
	public Ventas() {
		super();
	}
	
	/**
	 * Constructor al que le pasamos los parametros que sera los que les pasemos de la BBDD o lo introduzcamos nosotros.
	 * @param idVentas
	 * @param numVendidos
	 * @param fechaVenta
	 */
	public Ventas(int idVentas, int numVendidos, String fechaVenta) {
		
		super();
		this.idVentas = idVentas;
		this.numVendidos = numVendidos;
		this.fechaVenta = fechaVenta;
		
	}
	
	/**
	 * Realizamos los Getters and Setters
	 */

	public int getIdVentas() {
		return idVentas;
	}

	public void setIdVentas(int idVentas) {
		this.idVentas = idVentas;
	}

	public int getNumVendidos() {
		return numVendidos;
	}

	public void setNumVendidos(int numVendidos) {
		this.numVendidos = numVendidos;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * Generamos el toString 
	 */
	
	@Override
	public String toString() {
		return "Ventas [idUsuario=" + super.getId_usuario() + ", idVentas=" + idVentas + ", numVendidos=" + numVendidos + ", fechaVenta=" + fechaVenta + "]";
	}
	
}
