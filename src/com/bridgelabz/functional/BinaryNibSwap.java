/**
 * Purpose  : This program that takes a decimal number and prints the binary conversion of that number.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 25/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class BinaryNibSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to convert into binary:");
		int n = Utility.inputNumber();
		
		int convertedDecimal = (int) Utility.binaryswap(n);
		System.out.println("Decimal Number after swapping:"+convertedDecimal);
		
		boolean flag = Utility.isPowerOfTwo(convertedDecimal);
		
		if(flag == true)
		{
			System.out.println("Converted decimal number "+convertedDecimal+" is power of two");
		}
		else
			System.out.println("Converted decimal number "+convertedDecimal+" is not power of two");		
		
	}

}




//Enter any number :
//150			rev=105	not powof2
//10010110		01101001

//231			rev=126	powof2
//11100111		01111110