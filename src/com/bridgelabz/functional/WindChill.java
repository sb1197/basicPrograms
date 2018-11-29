/**
 * Purpose  : This program takes two double command­line arguments t and v and prints the wind chill.
 * 			  Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and 
 * 			  the wind speed v (in miles per hour), the National Weather Service defines the effective 
 * 			  temperature (the wind chill) to be:
 * 			  Note : the formula is not valid if t is larger than 50 in absolute value or if v is larger
 * 			  than 120 or less than 3 (you may assume that the values you get are in that range).
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 16/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class WindChill 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double temperature, windspeed;
		//Pass the temperature and wind speed through command line arguement
		temperature = Double.parseDouble(args[0]);
		windspeed = Double.parseDouble(args[1]);
		
		//To calculate the wind chill
		//the formula is not valid if t is larger than 50 
		//or if v is larger than 120 or less than 3 
		if(temperature<50 && windspeed>3 && windspeed<120)	
		{
			double result = Utility.calculateWindChill(temperature,windspeed);
			// Print the values of t, v, w
		    System.out.println("Temperature = " + temperature);
	        System.out.println("Wind speed  = " + windspeed);
	        System.out.println("Wind chill  = " + result);
		}
		else
			System.out.println("Invalid Input..Try Again..");
	}
}
