package com.basics.loops;

public class ReverseOfNumber {
	
	public static void main(String[] args) {
		
//		int n = 5685;
//		int temp = n;
//		int r = 0;
//		int sum = 0;
//		
//		// using while loop	-------------------------------------------------------------------
//		while (temp > 0) {
//			r = temp % 10;
//			sum = sum * 10 + r;
//			temp = temp/10;
//		}
//		
//		
//		
//		// using for loop-----------------------------------------------------------------------
//		for (int temp = n; temp > 0; temp = temp/10) {
//			r = temp % 10;
//			sum = sum * 10 + r;
//		}
//		
//		System.out.print(sum);
		
		
		// ------------------------------------------------------------------------------
		
		int num = 86489;
		
		while (num > 0) {
			int lastDigit = num % 10;
			System.out.print(lastDigit);
			num = num/10;
		}
		
	}
	
	

}
