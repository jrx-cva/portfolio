package jornada5_model;

public class Jugador {
	
	
	/***
	 * ESTADO
	 * 
	 */
	private String nombre;
	
	private int numeroCamiseta;
	private int velocidad;
	private int cabeza;
	private int entradas;
	private int regate;
	
	private boolean lesionado;
	private boolean capitan;
	
	private float promedio;

	
	
	

	/***
	 * COMPORTAMIENTO
	 * 
	 */
	
	
	/*GETTERS AND SETTERS*/
	//getter nombre
	public String getNombre() {
		return nombre;
	}

	//setter nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	//getter numeroCamiseta
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}

	//setter numeroCamiseta
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	
	
	//getter velocidad
	public int getVelocidad() {
		return velocidad;
	}

	//setter velocidad
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	
	
	
	//getter cabeza
	public int getCabeza() {
		return cabeza;
	}

	//setter cabeza
	public void setCabeza(int cabeza) {
		this.cabeza = cabeza;
	}

	
	
	
	//getter entradas
	public int getEntradas() {
		return entradas;
	}

	//setter entradas
	public void setEntradas(int entradas) {
		this.entradas = entradas;
	}

	
	
	
	
	//getter regate
	public int getRegate() {
		return regate;
	}

	//setter regate
	public void setRegate(int regate) {
		this.regate = regate;
	}

	
	
	
	//boolean lesionado
	public boolean isLesionado() {
		return lesionado;
	}

	//setter lesionado
	public void setLesionado(boolean lesionado) {
		this.lesionado = lesionado;
	}
	
	
	
	
	
	//boolean capitan
	public boolean isCapitan() {
		return capitan;
	}
	
	//setter capitan
	public void setCapitan(boolean capitan) {
		this.capitan = capitan;
	}
	
	
	
	
	
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	//getter promedio
	public float getPromedio() {
		return promedio;
	}
	
	

}
