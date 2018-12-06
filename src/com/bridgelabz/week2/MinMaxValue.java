/**
 * Purpose  : This program that takes an array as input and outputs 
 * 			  the Minimum and Maximum number.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 6/12/18
 */

package com.bridgelabz.week2;

import com.bridgelabz.libraries.MathFunction;

import utility.Utility;

public class MinMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //TO FIND MINIMUM AND MAXIMUM VALUE FROM INTEGER ARRAY
		System.out.println("Enter the size of array :");
		int size = Utility.inputNumber();
		int arrInteger[] =  new int[size];
		System.out.println("Enter the elements :");
		for(int i=0;i<size;i++)
		{
			arrInteger[i] = Utility.inputNumber();
		}
		System.out.println("Input Array Elelments are: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arrInteger[i]);
		}
		int maxValue = MathFunction.getMaxValue(arrInteger);
		System.out.println("Maximum Value :"+maxValue);
		
		int minValue = MathFunction.getMinValue(arrInteger);
		System.out.println("Minimum Value :"+minValue);
	}

}
