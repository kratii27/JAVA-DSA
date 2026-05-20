package com.basics.loops;

import java.util.Scanner;

public class TestBreak {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("enter a num; ");
			int num = sc.nextInt();
			if (num % 10 == 0) {
				break;
			}
			
			System.out.println(num);
		} while (true);
		
	}

}
