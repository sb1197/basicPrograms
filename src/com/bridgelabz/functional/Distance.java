/**
 * Purpose  : This program takes two integer command­line arguments x  and y and 
 * 			  prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 19/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;

public class Distance 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x1 = Integer.parseInt(args[0]);
		int y1 = Integer.parseInt(args[1]);
		double result = Utility.calculateDistance(x1, y1);
		System.out.println("Distance from given point to origin(0,0) is : "+result);	//Display distance		
	}

}