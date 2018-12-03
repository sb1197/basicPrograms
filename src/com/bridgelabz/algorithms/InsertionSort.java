/**
 * Purpose  : This program is used to sort the strings using the Insertion Sort.			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 01/12/18
 */


package com.bridgelabz.algorithms;
import java.util.Arrays;

import utility.Utility;

public class InsertionSort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Input Strings to be sorted :");
		String tokens[] = Utility.inputString().split(" ");
		int k = tokens.length;
		System.out.println(Arrays.asList(tokens));
		System.out.println("Input Array is :");
		for(int i=0;i<tokens.length;i++)
		{
			System.out.println(tokens[i]);
		}
		Utility.IsortSearch(tokens, k);
	}
}
