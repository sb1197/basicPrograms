/**
 * Purpose  : This program that takes an angle as input and prints the Taylor series for sinx upto n'th term.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 25/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class Cosine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter an angle to find Taylor Series :");
		double angle = Utility.doubleNumber();
		System.out.println("Input number is :" +angle);
		System.out.println("Enter a n'th term to find Taylor Series :");
		int n = Utility.inputNumber();
		
		double toRadianCosine = Utility.calcCosine(angle,n);
		System.out.println("Radian value :"+toRadianCosine);
		
		double result = Math.toDegrees(toRadianCosine);
		System.out.println("Taylor Series for "+angle+" gives "+result);
	}

}
