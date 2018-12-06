/**
 * Purpose  : This program that takes x and y co-ordinates of three points as input and checks
 * 			  the given points are collinear or not using slope and area formula.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 1/12/18
 */


package com.bridgelabz.week2;

import com.bridgelabz.libraries.MathFunction;

import utility.Utility;

public class CollinearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter x1 :");
			int x1 = Utility.inputNumber();
			System.out.println("Enter y1 :");
			int y1 = Utility.inputNumber();
			System.out.println("Enter x2 :");
			int x2 = Utility.inputNumber();
			System.out.println("Enter y2 :");
			int y2 = Utility.inputNumber();
			System.out.println("Enter x3 :");
			int x3 = Utility.inputNumber();
			System.out.println("Enter y3 :");
			int y3 = Utility.inputNumber();
			
			//To check collinear using Slope
			MathFunction.checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
		
			//To check collinear using Area
			MathFunction.checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);		
		
		
	}

}
