/**
 * Purpose  : This program that takes a money, rate of interest, year as input and outputs 
 * 			  the Present value calculated.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 7/12/18
 */


package com.bridgelabz.week2;

import com.bridgelabz.libraries.MathFunction;

import utility.Utility;

public class PresentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//TO CALCULATE FUTURE VALUE AND PRESENT VALUE
		System.out.println("Enter money :");
		double money = Utility.doubleNumber();
		System.out.println("Enter rate of interest:");
		double rateOfInterest = Utility.doubleNumber();
		System.out.println("Enter years :");
		double year = Utility.doubleNumber();
		if(money < 0 || rateOfInterest < 0 || year < 0)
		{
			System.out.println("Incorrect Input..");
		}
		else 
		{	
			double presentVal = MathFunction.presentValue(money, rateOfInterest, year);
			System.out.println("Present Value Calculated is : "+presentVal);
		}
		
		
	}

}
