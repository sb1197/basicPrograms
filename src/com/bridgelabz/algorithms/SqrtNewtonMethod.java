/**
 * Purpose  : This program is to compute Square root of n number using Newton's method.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 24/11/18
 */

package com.bridgelabz.algorithms;
import utility.Utility;
public class SqrtNewtonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to find square root of :");
		  double number = Utility.doubleNumber();
		  if(number<0)
		  {
			  System.out.println("Invalid Input.. Try Again.");
		  }
		  else
		  {
			 // print out the square root of c	       
			  double result = Utility.squareRoot(number);
			  System.out.println("Square root of given number "+number+" is :"+result);
		  }
	}

}
