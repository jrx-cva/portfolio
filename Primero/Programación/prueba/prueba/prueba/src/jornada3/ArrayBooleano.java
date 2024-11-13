package jornada3;

import java.util.Random;

public class ArrayBooleano {
	public static void main(String[] args) {
		
		boolean[] penalties = new boolean[5];
		
		Random r = new Random();
		
		for (int i = 0; i < penalties.length; i++) {
			
			int num = r.nextInt(2); //retorna 0 y 1
			penalties[i] = num == 0 ? false : true; 
			
			if (penalties[i]) {
				System.out.println("Gool!");
				
			}else 
				System.out.println("Alv");
			
			
		}
		
		
		
	}

}
