package com.carmen.me;

public class Main {
	public static void main(String [] args) {
		Punto punto1 = new Punto(1,1);
		Punto punto2 = new Punto(-1,3);
		Punto punto3 = new Punto(0,2);
		
		Punto pt1 = new Punto(1,3);
		Punto pt2 = new Punto(2,5);
		
		Segmento seg = new Segmento(pt1, pt2);
		
		Punto x = new Particula(5);
		Punto p = new Punto(3,8);
		double d;
		
		
		punto1.trasladar(3, -1);
		double x = punto1.distancia(punto2);
		
				
		double longi = seg.longitud();
		System.out.println(longi);
		
		
		d = p.distancia(8,4);   //punto -> distancia(double, double)
		d = x.distancia(9,2);   //particula -> distancia(double, double)
		
		d = p.distancia(p);     //punto -> distancia(Punto)
		d = p.distancia(x);		//punto -> distancia(Punto)
		d = x.distancia(p);		//punto -> distancia(Punto)
		d = x.distancia(x);		//punto -> distancia(Punto)
	}

}
