/**
 * Purpose  : This program to simulate a coin flip and print out "Heads" or
 *			  "Tails" accordingly and finally print the percentage of Head vs Tail.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 24/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The number of times to Flip Coin");
		int numOfTimes = Utility.inputNumber();			//Input value of n numOfTimes to flip coin from user
		//Ensure it is positive integer.
		if(numOfTimes>0)					
		{
			Utility.flipCoin(numOfTimes);				//Flip function call
		}
		else
		{
			System.out.print("Please enter correct number");
			System.out.println("Enter The number of times to Flip Coin");
			int numOfTimes1 = Utility.inputNumber();
			Utility.flipCoin(numOfTimes1);	
		}
	}

}



//check logic
