package com.carmen.me;

public class Segmento {
	
	//ATRIBUTOS
	private Punto origen, extremo;  //un segmento tiene	dos	Puntos,	el	origen	y	el	extremo
	
	
	//CONSTRUCTOR
	public Segmento(double x1, double y1, double x2, double y2) {
		origen = new Punto(x1, y1);
		extremo = new Punto(x2, y2);
	}
	
	public Segmento(Punto p1, Punto p2, Punto p3, Punto p4) { //referencias a puntos ya creados
		origen = p1;					  //copia referncia p1 en origen
		extremo = p2;					  //copia referencia p2 en origen
		origen = new Punto(p3.getx(), p3.gety());
		extremo = new Punto(p4.getx(), p4.gety());
		}
	
	
	
	
	//METODOS
	public void desplazar(double a, double b) {
		origen.trasladar(a, b);
		extremo.trasladar(a,b);
	}
	
	public double longitud() {
		return origen.distancia(extremo);
	}

}
