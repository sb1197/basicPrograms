package com.bridgelabz.week2;

import com.bridgelabz.libraries.MathFunction;

import utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //TO FIND SQUARE ROOT OF GIVEN NUMBER
			System.out.println("Enter a number to find square root of :");
		  double num = Utility.doubleNumber();
		  if(num<0)
		  {
			  System.out.println("Invalid Input.. Try Again.");
		  }
		  else
		  {
			 // print out the square root of c	       
			  double output = MathFunction.squareRoot(num);
			  System.out.println("Square root of given number "+num+" is :"+output);
		  }
	}

}
