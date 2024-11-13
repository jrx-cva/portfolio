package com.carmen.me;

public class Vuelo {
	static public int sigVuelo = 1;
	private String localizadorVuelo;
	
	public Vuelo(String lin) {
		localizadorVuelo = lin + "_" + sigVuelo;
		sigVuelo++; //modifica valor de la copia compartida
	}
	
	public String toSring() {
		return localizadorVuelo;
	}

}
