/**
 * Purpose  : This program prints the nth harmonic number. 
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 24/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input given through command line arguments 
		int n = Integer.parseInt(args[0]);
		System.out.println("Input Value is :"+n);		
		double result = Utility.harmonicNumber(n);
		System.out.println(result);		//Print the harmonic value
	}

}

