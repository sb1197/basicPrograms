/**
 * Purpose  : This program is to find the roots of the equation a*x*x + b*x + c.
			  Since the equation is x*x, hence there are 2 roots.
			  Take  a,  b  and  c  as  input  values  to  find  the  roots  of  x.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 18/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class QuadraticEquation 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a, b, c;
		//Input values of equation from user
		System.out.println("Enter the values of a :");
		a = Utility.inputNumber();
		System.out.println("Enter the values of b :");
		b = Utility.inputNumber();
		System.out.println("Enter the values of c :");
		c = Utility.inputNumber();
		
		Utility.qudraticEquation(a,b,c);
	}
}
