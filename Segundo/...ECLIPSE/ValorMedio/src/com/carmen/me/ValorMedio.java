package com.carmen.me;
import java.util.*; 

public class ValorMedio {
	public static void main(String[] args) {
		Random rnd = new Random();
		double sum = 0.0;
		for (int i = 0; i < 1000000; i++) {
			sum = sum + rnd.nextDouble();
		}
		
		System.out.println("media = " +sum/1000000.0);
	}

}
