package jornada1;

public class StringOperador {
	
	public static void main(String[] args) {
		
		String lang = "java";
		
		//boolean esJava = lang.equals("java"); 
		boolean esJava = lang.equalsIgnoreCase("jaVa"); //mejor opci�n.
		
		System.out.println(esJava);
		
		
	}

}
