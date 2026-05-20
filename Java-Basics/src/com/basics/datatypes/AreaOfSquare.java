package com.basics.datatypes;

import java.util.Scanner;

public class AreaOfSquare {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter side of square; ");
		
		float side = sc.nextFloat();
		float area = side * side;
		
		System.out.println("are of square is; " + area);
		
	}

}
