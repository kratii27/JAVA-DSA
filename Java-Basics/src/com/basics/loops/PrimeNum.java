package com.basics.loops;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		int num = 2;
		
		boolean isPrimeNum = true;
		
		for (int i = 2; i <= num - 1; i++) {
			
			if (num % i == 0) {
				isPrimeNum = false;
			}
			
		}
		
		if (isPrimeNum) {
			System.out.println("it is prime number");
		} else {
			System.out.println("it is not prime number");
		}
	}

}
