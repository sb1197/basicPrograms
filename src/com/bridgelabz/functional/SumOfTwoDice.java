/**
 * Purpose  : This program prints the sum of two random integers
 *			  between 1 and 6 (such as you might get when rolling dice).
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 16/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class SumOfTwoDice 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
			int a = 1, b = 6;
//	        int a = Integer.parseInt(args[0]); // 1
//	        int b = Integer.parseInt(args[1]); // 6
	        double result = Utility.sumOfTwoDice(a, b);
	        
	      //Display results
	        System.out.println("Sum of Random Number is : " +(int)result);	 
	}
}
