package com.bridgelabz.week2;

import com.bridgelabz.libraries.MathFunction;

import utility.Utility;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TO FIND FACTORIAL OF A GIVEN NUMBER
		System.out.println("Enter a number to find factorial of:");
		int factNum = Utility.inputNumber();
		if(factNum != 0)
		{
			int res = MathFunction.findFactorial(factNum);
			System.out.println("Factorial of "+factNum+" is: "+res);
		}
		else
			System.out.println("Give proper Input..");		
	}

}
