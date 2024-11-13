package clases;

import java.util.Random;

import seccionCritica.Cangreburgers;

public class Cliente extends Thread{
	private int tiempo;
	private Cangreburgers cangreburgers; //para acceder hamburguesas
	private int numero;
	
	
	public Cliente(Cangreburgers cangreburgers, int numero) {
		this.cangreburgers = cangreburgers;
		this.numero = numero;
	}
	
	
	public void run() {
		Random random = new Random();
		
		while (true) {
			try {
				sleep(random .nextInt(3000 - 1000 + 1000) + 1000);
				cangreburgers.comer(numero);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
