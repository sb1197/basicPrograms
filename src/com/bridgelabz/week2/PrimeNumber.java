/**
 * Purpose  : This program that takes a number as input and outputs 
 * 			  the number is prime or not.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 5/12/18
 */


package com.bridgelabz.week2;

import com.bridgelabz.libraries.MathFunction;

import utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //TO FIND GIVEN NUMBER IS PRIME OR NOT
		System.out.println("Enter any number to check whether it is prime or not: ");
		int primeNum = Utility.inputNumber();
		if(primeNum != 0)
		{
			boolean flag = MathFunction.isPrimeNumber(primeNum);
			if (!flag)
	            System.out.println(primeNum + " is a prime number.");
	        else
	            System.out.println(primeNum + " is not a prime number.");
		}
		else
		{
			System.out.println("Invalid Input..");		
		}
	}

}
