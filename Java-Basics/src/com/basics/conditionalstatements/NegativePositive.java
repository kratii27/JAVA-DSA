package com.basics.conditionalstatements;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("entered number is positive");
		} else {
			System.out.println("entered number is negative");
		}
	}

}
