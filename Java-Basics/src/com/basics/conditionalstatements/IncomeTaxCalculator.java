package com.basics.conditionalstatements;

import java.util.Scanner;

public class IncomeTaxCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income: ");
		double income = sc.nextDouble();
		
		double tax;
		
		if (income < 300000) {
			tax = 0;
		} else if (income < 1200000 && income > 300000) {
			tax = income * 0.2;
		} else {
			tax = income * 0.3;
		}
		
		System.out.println("tax: " + tax);
		
	}

}
