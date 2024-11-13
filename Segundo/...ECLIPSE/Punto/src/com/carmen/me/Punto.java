package com.carmen.me;

public class Punto {
	
	//ATRIBUTOS
	private double x;
	private double y;
	
	//CONSTRUCTOR
	public Punto() {
		//x = 0;
		//y = 0;
		this(0,0);
	}
	
	public Punto(double a, double b) {
		x = a;
		y = b;
	}
	
	
	//MÉTODOS
	
		//getters y setters
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	public void setx(double a) {
		x = a;
	}
	public void sety(double b) {
		y = b;
	}
	
	
		//demas metodos
	public void trasladar(double a, double b) {
		x = x+a; //x += a
		y = y+b; //Y += b
	}
	public double distancia(Punto punto) {
		return Math.sqrt(Math.pow(x - punto.x, 2) + Math.pow(y - punto.y, 2));
	}
	
	//nuevo metodo
	double distancia (double x1, double y1) {
		double dx = x - x1;
		double dy = y - y1;
		return Math.sqrt(dx*dx + dy*dy) ;
		
	}

}
