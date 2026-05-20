package com.basics.conditionalstatements;

public class TestTernaryOperator {

	public static void main(String[] args) {

		int a = 8;
		
		String type = (a % 2 == 0) ? "even" : "odd";
		
		System.out.println(type);

	}

}
