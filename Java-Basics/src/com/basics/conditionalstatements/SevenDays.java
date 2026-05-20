package com.basics.conditionalstatements;

import java.util.Scanner;

public class SevenDays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: " );
		
		int day = sc.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("it's Monday");
			break;
		case 2:
			System.out.println("it's Tuesday");
			break;
		case 3:
			System.out.println("it's Wednesday");
			break;
		case 4:
			System.out.println("it's thrusday");
			break;
		case 5:
			System.out.println("it's friday");
			break;
		case 6:
			System.out.println("it's saturday");
			break;
		case 7:
			System.out.println("it's sunday");
			break;

		default:
			System.out.println("enter number from 1 to 7");
			break;
		}
		
	}

}
