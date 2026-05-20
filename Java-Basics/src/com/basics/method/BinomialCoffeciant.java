package com.basics.method;

public class BinomialCoffeciant {
	
	public static int factorial(int n) {
		int fact = 1;
		
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int binomialCo(int n, int r) {
		int factn = factorial(n);
		int factr = factorial(r);
		int factnr = factorial(n-r);
		
		int bc = factn / (factr * factnr);
		return bc;
	}
	
	public static void main(String[] args) {
		
		int ans = binomialCo(5, 2);
		System.out.println(ans);
		
	}

}
