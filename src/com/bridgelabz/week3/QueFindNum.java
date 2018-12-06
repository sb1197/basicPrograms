/**
 * Purpose  : This program is used to guess a number using binary search method.			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 01/12/18
 */


package com.bridgelabz.week3;
import utility.Utility;

public class QueFindNum 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of n :");
		//int n = Integer.parseInt(args[0]);
		int n  = Utility.inputNumber();
		int k = (int) Math.pow(2, n);
		int arr[] = new int[k];
		for(int j=0;j<k;j++)
		{
			arr[j]=j;
		}
		Utility.yourNumber(arr);
		System.out.println("User Input value is : "+n);
		System.out.println("2^n Value : "+k);	
		
	}

}
