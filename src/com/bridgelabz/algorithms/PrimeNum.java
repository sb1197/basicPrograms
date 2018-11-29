/**
 * Purpose  : This program that takes a command­line argument m,n and prints the prime numbers in that range(m,n). 
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 25/11/18
 */

package com.bridgelabz.algorithms;
import utility.Utility;

public class PrimeNum 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int fromNum = Integer.parseInt(args[0]);
		int toNum = Integer.parseInt(args[1]);
		if(fromNum<0 || toNum<0)
		{
			System.out.println("Enter Positive Integer Range..Try Again..");
		}
		else
		Utility.primeCheck(fromNum, toNum);
		
	}

}
//optimise the logic to be executed in less time