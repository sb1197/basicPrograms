/**
 * Purpose  : This program is to print the repeated number from given list.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 18/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class RepeatedNumber
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of array :");
		int size = Utility.inputNumber();
		int array[] = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i = 0; i<size; i++)
		{
			array[i] = Utility.inputNumber();
		}
		
		Utility.printRepeating(array, size);
	}
}
