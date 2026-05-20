package com.basics.datatypes;

import java.util.Scanner;

public class AverageOf3Num {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first num: ");
		int a = sc.nextInt();
		
		System.out.println("enter second num: ");
		int b = sc.nextInt();
		
		System.out.println("enter third num: ");
		int c = sc.nextInt();
		
		int average = (a + b + c)/ 3;
		
		System.out.println("average: " + average);
		
	}

}
