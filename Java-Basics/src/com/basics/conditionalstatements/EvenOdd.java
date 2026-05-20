package com.basics.conditionalstatements;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a:");
		int a = sc.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("it is even number");
		} else {
			System.out.println("it is odd number");
		}
		
	}

}
