package com.carmen.me;

public class CartaInternacional extends Carta {
	
	public CartaInternacional(double p) {
		super(p);
	}
	
	public double precioSello() {
		return 2 * (super.precioSello() +3);
	}

}
