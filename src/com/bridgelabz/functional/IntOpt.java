/**
 * Purpose  : This program takes a, b and c as input integer values and 
 * 			  print the results of following integer operations a + b *c, 
 * 			  a * b + c, c + a / b, and a % b + c.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 25/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class IntOpt 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		
		System.out.println("Enter first values :");
		int a = Utility.inputNumber();
		System.out.println("Enter second value :");
		int b = Utility.inputNumber();
		System.out.println("Enter third value :");
		int c = Utility.inputNumber();
		//a + b *c, a * b + c, c + a / b, and a % b + c.	
		 Utility.integerOperation(a, b, c);
		
	}

}
