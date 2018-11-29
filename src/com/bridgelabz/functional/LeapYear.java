/**
 * Purpose  : This program that takes a year as input and outputs 
 * 			  the Year is a Leap Year or not a Leap Year.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 13/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class LeapYear 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		
		System.out.println("Enter the year :");
		int year = Utility.inputNumber();
		if(year>=1582)
		 {
			 boolean isLeap = Utility.checkLeapYear(year);
			 if(isLeap==true)
				  System.out.println(year + " is a Leap Year.");
			 else if(isLeap==false)
				  System.out.println(year + " is not a Leap Year.");
		 }
		 else
		 {
			 System.out.println("Enter year greater than 1582.. Try Again..");
		 }
			 
	}

}
