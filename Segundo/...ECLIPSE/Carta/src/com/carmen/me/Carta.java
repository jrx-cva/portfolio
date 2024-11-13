package com.carmen.me;

public class Carta {
	private double peso;
	
	public Carta(double p) {
		peso = p;
	}
	
	public double precioSello() {
		return peso * 0.3;
	}

}
