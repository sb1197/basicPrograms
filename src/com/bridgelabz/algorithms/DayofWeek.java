/**
 * Purpose  : This program takes a date as input and prints the day of the week that date falls on. 
 * 			  Your program should take three command­line arguments: m (month), d (day), and y (year). 
 * 			  For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth.
 * 			  Use the following formulas, for the Gregorian calendar (where / denotes integer division):
 * 			  y0 = y − (14 − m) / 12, x = y0 + y0/4 − y0/100 + y0/400 ,m0 = m + 12 × ((14 − m) / 12) − 2,
 * 			  d0 = (d + x + 31m0/ 12) mod 7
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 21/11/18
 */

package com.bridgelabz.algorithms;
import utility.Utility;

public class DayofWeek 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the day :");
		int date = Utility.inputNumber();
		System.out.println("Enter the month :");
		int month = Utility.inputNumber();
		System.out.println("Enter the year :");
		int year = Utility.inputNumber();
		
		//Check input given by user is valid or not
		if(date<=0 || month<=0 || year<=0)
		{
			System.out.println("Please enter valid Date...Try Again..");
		}
		else
		{
			int result = Utility.dayOfWeek(date, month, year);
			String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			System.out.println("Day of week is :"+week[result]);
		}
		
	}

}
