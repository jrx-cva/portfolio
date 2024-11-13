package com.carmen.me;

public class Centros {
	String codigo;
	String nombre;
	String domicilio;
	String municipio;
	String codigo_postal;
	String enseñanzas;
	String denominacion;
	String dependencia;
	String localidad;
	String provincia;
	String telefono;
	
	public Centros(String linea) {
		//crear array
		String[] centros = linea.split(";");
		
		//separar array
		codigo = centros[0];
		denominacion = centros[1];
		nombre = centros[2];
		dependencia = centros[3];
		domicilio = centros[4];
		localidad = centros[5];
		municipio = centros[6];
		provincia = centros[7];
		codigo_postal = centros[8];
		telefono = centros[9];
		enseñanzas = centros[10];
	}
	
	public Centros(String codigo, String denominacion, String nombre, String dependencia, String domicilio, String localidad, String municipio, String provincia, String codigo_postal, String telefono, String enseñanzas) {
		this.codigo = codigo;
		this.denominacion = denominacion;
		this.nombre = nombre;
		this.dependencia = dependencia;
		this.domicilio = domicilio;
		this.localidad = localidad;
		this.municipio = municipio;
		this.provincia = provincia;
		this.codigo_postal = codigo_postal;
		this.telefono = telefono;
		this.enseñanzas = enseñanzas;
	}

	
	/***
	 * Método toString: para pasar un objeto a String.
	 */
	@Override
	public String toString() {
		return "Centros [codigo=" + codigo + ", nombre=" + nombre + ", domicilio=" + domicilio + ", municipio="
				+ municipio + ", codigo_postal=" + codigo_postal + ", enseñanzas=" + enseñanzas + ", denominacion="
				+ denominacion + ", dependencia=" + dependencia + ", localidad=" + localidad + ", provincia="
				+ provincia + ", telefono=" + telefono + "]";
	}

	//GETTERS Y SETTERS
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public String getEnseñanzas() {
		return enseñanzas;
	}

	public void setEnseñanzas(String enseñanzas) {
		this.enseñanzas = enseñanzas;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
