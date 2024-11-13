package jornada1;

public class StringOperador {
	
	public static void main(String[] args) {
		
		String lang = "java";
		
		//boolean esJava = lang.equals("java"); 
		boolean esJava = lang.equalsIgnoreCase("jaVa"); //mejor opción.
		
		System.out.println(esJava);
		
		
	}

}
