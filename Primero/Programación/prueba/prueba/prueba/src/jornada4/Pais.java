package jornada4;

public class Pais {
		
	private String nombre; 								//strings
	private String bandera;
	private String idioma;
	private int poblacion; 								//integer
	private boolean isUe;
	private Continente continente; 						//Enumerador
	private Ciudad capital;
	
	private Ciudad[] ciudadesImportantes; 				//crear array de ciudades
	
	
	


	/*PUBLIC NORMAL*/
	public String getInfoCovid() { 
		
		return "Lavarse las manos";
	}
	

	
	/*PUBLIC VOID*/
	
	//setter nombre
	public void setNombre(String n) {   
		this.nombre = n;
	}
	
	//getter nombre
	public String getNombre() {
		return this.nombre;
	}
	
	
	
	
	//getter bandera
	public String getBandera() {
		return bandera;
	}

	//setter bandera
	public void setBandera(String bandera) {
		this.bandera = bandera;
	}
	
	
	
	
	//getter idioma
	public String getIdioma() {
		return idioma;
	}

	//setter idioma
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
	
	
	//getter poblacion
	public int getPoblacion() {
		return poblacion;
	}

	//setter poblacion
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	
	
	
	
	//getter Continente
	public Continente getContinente() {
		return continente;
	}
	
	//setter Continente
	public void setContinente(Continente continente) {
		this.continente = continente;
	}	
	
	
	
	
	//boolean isUe
	public boolean isUe() {
		return isUe;
	}

	//setter isUe
	public void setUe(boolean isUe) {
		this.isUe = isUe;
	}
	
	
	
	
	//getter capital
	public Ciudad getCapital() {
		return capital;
	}
	
	//setter capital
	public void setCapital(Ciudad capital) {
		this.capital = capital;
	}
	
	
	
	
	//getter ciudades
	public Ciudad[] getCiudadesImportantes() {
		return ciudadesImportantes;
	}

	//setter ciudades
	public void setCiudadesImportantes(Ciudad[] ciudadesImportantes) {
		this.ciudadesImportantes = ciudadesImportantes;
	}
	

}
