package com.carmen.me;

public class Particula extends Punto {
	
	//ATRIBUTOS (ya tiene los de punto)
	final static double G = 6.67384e-11;
	protected double masa;
	
	//CONSTRUCTORES
	public Particula() {
		masa = 0;
	}
	
	public Particula(float m) {
		this(0, 0, m); //(double, double, double)
	}


	public Particula(double a, double b, double m) {
		// TODO Auto-generated constructor stub
		super(a, b); //punto (double, double)
		masa =  m;
	}
	
	
	//MÉTODOS (ya tiene los de punto)
	public void masa(double m) {
		masa = m;
	}
	
	public double masa() {
		return masa;
	}
	
	public double atraccion(Particula particula) {
		return G * masa * particula.masa / Math.pow(distancia(particula), 2);
	}
	
	double distancia(double x1, double y1) {
		double dx = x - x1;
		double dy = y -y1;
		return Math.abs(Math.max(dx,  dy));
	}
	


	
	

}
