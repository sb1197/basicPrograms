/**
 * Purpose  : This program program takes two int values m and d from the
 *			  command line and prints true if day d of month m is between 
 *			  March 20 (m = 3, d =20) and June 20 (m = 6, d = 20), 
 *			  false otherwise.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 15/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class SpringSeason 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int date = Integer.parseInt(args[0]);		
		int month = Integer.parseInt(args[1]);
//		int date = Utility.inputNumber();
//		int month = Utility.inputNumber();
		boolean flag = Utility.isSpringSeason(date, month);
		if(flag==true)
			System.out.println("Date falls in Spring Season..");
		else
			System.out.println("Date do not falls in Spring Season..");
	}

}
