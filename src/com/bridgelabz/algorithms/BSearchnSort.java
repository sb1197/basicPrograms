/**
 * Purpose  : This program is used to search a number and word using binary search method.			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 13/11/18
 */

package com.bridgelabz.algorithms;
import utility.Utility;

public class BSearchnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[20];
		int m, n;
		
		double start=System.currentTimeMillis();		
		 System.out.println("Start time of the function : " + start);
		 
		//Binary search on Integer Array
		 
		System.out.println("Enter the size of Integer array");
		n = Utility.inputNumber();
		
		
		System.out.println("Enter the sorted elements of Integer array :");
		for(int i=0;i<n;i++)
		{
			arr[i] = Utility.inputNumber();
		}
		System.out.println("Enter the element to be search in an Integer array");
		int search = Utility.inputNumber();
		System.out.println("Input array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Utility.BSInt(n, arr, search);
		
		//Binary search on String Array
		
		String Strarr[] = new String[5];
		m = Strarr.length;
		System.out.println("Enter the sorted elements of String array :");
		for(int i=0;i<m;i++)
		{
			Strarr[i] = Utility.inputString();
		}
		System.out.println("Enter the element to be search in String array");
		String searchstr = Utility.inputString();
		System.out.println("Input array is: ");
		for(int i=0;i<m;i++)
		{
			System.out.print(Strarr[i]+" ");
		}
		System.out.println();
		Utility.searchString(Strarr, searchstr);
		
		double stop=System.currentTimeMillis();
		 System.out.println("Stop time of the function : " + stop);
		 
	     double elapsedTime= stop-start;		//Calculate elapsed time
		    System.out.println("Elapsed - Time in milliseconds : " + elapsedTime);
	    	
	}

}
