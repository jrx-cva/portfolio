package com.carmen.me;

public class Main {
	public static void main(String[] args) {
		Vuelo vuelo1 = new Vuelo("Iberia");
		Vuelo vuelo2 = new Vuelo("Lufhtansa");
		Vuelo vuelo3 = new Vuelo("Iberia");
		
		System.out.println(vuelo1);
		System.out.println(vuelo2);
		System.out.println(vuelo3);
		
		System.out.println("El siguiente vuelo es el " + Vuelo.sigVuelo);
	}
}
