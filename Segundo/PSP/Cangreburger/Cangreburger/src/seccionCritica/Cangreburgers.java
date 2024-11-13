package seccionCritica;

public class Cangreburgers {
	private int numeroHamburguesas;
	
	
	/*
	 * Controlador de hilos
	 */
	public void comer(int numero) { //restar
		if (numeroHamburguesas == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		numeroHamburguesas--; 
		System.out.println("El cliente " + numero + " ha comido " + numeroHamburguesas);
	}

	public void cocinar(int numero) { //sumar
		// TODO Auto-generated method stub
		numeroHamburguesas++; 
		System.out.println("El cocinero " + numero + " ha cocinado " + numeroHamburguesas);
		notifyAll(); //o notify()
		
	}
	
}
