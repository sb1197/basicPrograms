/**
 * Purpose  : This program takes a, b and c as (double) input values and
 * 			  print the results of following operations a + b *c, a * b + c, 
 * 			  c + a / b, and a % b + c.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 25/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class DoubleOpt
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter first value :");
		double a = Utility.doubleNumber();
		System.out.println("Enter second value :");
		double b = Utility.doubleNumber();
		System.out.println("Enter third value :");
		double c = Utility.doubleNumber();
		//Perform Operations a + b *c, a * b + c, c + a / b, and a % b + c on double numbers.
		Utility.doubleOperation(a, b, c);
		
	}

}
