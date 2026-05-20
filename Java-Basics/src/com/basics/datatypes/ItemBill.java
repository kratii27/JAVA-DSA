package com.basics.datatypes;

public class ItemBill {
	
	public static void main(String[] args) {
		
		float pen = 10.0f;
		float pencil = 5.0f;
		float eraser = 3.0f;
		
		float total = pen + pencil + eraser;
		float gst = ((pen + pencil + eraser)/100) * 18;
		float totalBill = total + gst;
		
		System.out.println("your total bill is: " + total);
		System.out.println("your total bill including GST is: " + totalBill);
		
	}

}
