package com.basics.loops;

import java.util.Scanner;

public class ReverseOfGivenNum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("type a number: ");
		
		int num = sc.nextInt();
		int reverse = 0;
		
		while (num > 0) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num/10;
		}
		
		System.out.println(reverse);
		
	}

}
