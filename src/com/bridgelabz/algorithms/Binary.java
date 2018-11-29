/**
 * Purpose  : This program that takes a decimal number and prints the binary conversion of that number. 
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 26/11/18
 */

package com.bridgelabz.algorithms;
import utility.Utility;

public class Binary 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		System.out.println("Enter the number :");
//		int decimalNum = Utility.inputNumber();
		int decimalNum = Integer.parseInt(args[0]);
		if(decimalNum<0)
		{
			System.out.println("Invalid Input.Enter Positive Decimal Number..Try Again..");
		}
		else
		Utility.decimalToBinary(decimalNum);
	}

}
//make it a 4 byte=32bits binary number
