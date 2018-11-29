/**
 * Purpose  : This program that takes a command­line argument n and prints the powers of 2 
 * 			  that are less than or equal to 2^n.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 24/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read command-line argument
				int number = Integer.parseInt(args[0]);
				System.out.println("Number is :"+number);
				if(number<=0)
				{
					System.out.println("Invalid Input..");
				}
				else
				{
					Utility.powOfTwo(number);
				}
	}

}
