/**
 * Purpose  : This program to compute Factors of a number N using Prime factorization method.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 24/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		System.out.println("Enter the number to find the prime factor's of :");
		int n = Utility.inputNumber();
		System.out.println("Input Number :"+n);		//Display input number
		Utility.calculatePrimeFactors(n);
		
	}

}
//check logic