package com.bridgelabz.functional;

import utility.Utility;

public class Sin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find Taylor Series :");
		double angle = Utility.doubleNumber();
		System.out.println("Input number is" +angle);
		System.out.println("Enter a number upto find Taylor Series :");
		int n = Utility.inputNumber();
		double result = Utility.calcSine(angle,n);
		System.out.println("Taylor Series for "+angle+" gives "+result);
	}

}
