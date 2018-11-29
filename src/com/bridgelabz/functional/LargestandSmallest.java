/**
 * Purpose  : This program that takes an integer array and prints the 2nd Largest 
 * 			  and Smallest number from that array without sorting the array.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 29/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class LargestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the size of array :");
		int size = Utility.inputNumber();
		int array[] = new int[size];
		System.out.println("Enter the elements of array :");
		for(int i = 0;i < size; i++)
		{
			array[i] = Utility.inputNumber();
		}
		System.out.println("Elements of array are :");
		for(int i = 0;i < size; i++)
		{
			System.out.print(array[i]+" ");
		}
		Utility.secondLargestInt(array, size);
	
		Utility.secondSmallestInt(array, size);
		
	}

}
