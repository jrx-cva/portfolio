package jornada1;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean tengoDinero = true;
		boolean juegaMiEquipoFavorito = false;
		boolean esLindoDia = false;
		
		
		//||
		boolean asistirAPartido = tengoDinero || juegaMiEquipoFavorito; 
		System.out.println(asistirAPartido);
		
		//&
		boolean asistirAPartido2 = tengoDinero && juegaMiEquipoFavorito; 
		System.out.println(asistirAPartido2);
		
		//3 variables
		boolean asistirAPartido3 = tengoDinero && juegaMiEquipoFavorito && esLindoDia;
		System.out.println(asistirAPartido3);
		
		boolean asistirAPartido4 = tengoDinero || juegaMiEquipoFavorito && esLindoDia;
		System.out.println(asistirAPartido4);
	}

}
