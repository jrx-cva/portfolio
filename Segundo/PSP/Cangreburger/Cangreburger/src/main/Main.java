package main;

import java.util.Random;

import clases.Cliente;
import clases.Cocinero;
import seccionCritica.Cangreburgers;

public class Main {
	final int N_CLIENTES = 4;
	final int N_COCINEROS = 4;
	
	public void main(String[] args) {
		
		Cangreburgers cangre = new Cangreburgers();
		
		Cliente[] cliente = new Cliente[N_CLIENTES];
		Cocinero[] cocinero = new Cocinero[N_COCINEROS];
		
		//hilo de cliente
        for(int i = 0 ; i < N_CLIENTES ; i++){
        	cliente[i] = new Cliente(cangre, i+1);
        }
        //hilo de cocinero
        for(int i = 0 ; i < N_COCINEROS ; i++){
        	cocinero[i] = new Cocinero(cangre, i+1);
        }
		
        
        //lanzar hilo cliente 
        for(int i = 0 ; i < N_CLIENTES ; i++){
            cliente[i].start();
        }
		
        //lanzar hilo cocinero
        for(int i = 0 ; i < N_COCINEROS ; i++){
            cocinero[i].start();
        }
	}
}
