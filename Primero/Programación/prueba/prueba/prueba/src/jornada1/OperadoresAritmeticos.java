package jornada1;

public class OperadoresAritmeticos {
	
	
	public static void main (String [] args) {
		
		int precio = 100;
		
		int impuesto = 5;
		
		float propina = 0.2f;
		
		int resto = 400 % 4; //Modulo %
		
		
		
//++
		
		int numerosuma = 1;
		
		numerosuma++; //numero + 1
		
		System.out.println(numerosuma);
		
		
		int numeroresta = 1;
		
		numeroresta--; //numero - 1
		
		System.out.println(numeroresta);
		
		
	
		
//+-/*
		
		float sumar = (int) (impuesto + propina); //mas avanzado 
		
		int restar = impuesto - precio;
		
		int dividir = impuesto / precio;
		
		int multiplicar = impuesto * precio;
		
		
//imprimir en pantalla
		
		System.out.println(resto);
		
		System.out.println(sumar);
		
		System.out.println(restar);
		
		System.out.println(dividir);
		
		System.out.println(multiplicar);
		
		
		
	
	}

}
