/**
 * Purpose  : This program is to illustrate various trigonometric functions in the Math
 *			  library, such as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an
 *			  angle (in degrees), converts to radians, and then performs various trigonometric calculations.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 23/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class TrignometricFunction
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		System.out.println("Enter the value of an angle in Degrees:");
		double angle = Utility.doubleNumber();
		System.out.println("Given Angle is: "+angle);
		Utility.calTrignometricFunction(angle);
		
	}

}
