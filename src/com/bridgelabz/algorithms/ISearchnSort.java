package com.bridgelabz.algorithms;
import utility.Utility;

public class ISearchnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double start=System.currentTimeMillis();		
		 System.out.println("Start time of the function : " + start);
		 
		
		//Insertion sort on Integer Array
		System.out.println("Enter the size of Integer array");
		int n = Utility.inputNumber();
		int arr[] = new int[n];
		System.out.println("Enter the elements of Integer array");
		for(int i=0;i<n;i++)
		{
			arr[i] = Utility.inputNumber();
		}
		Utility.IsortInt(arr, n);
	
		//Insertion sort on String array
		System.out.println("Enter the size of String array");
		int k = Utility.inputNumber();
		String ar[] = new String[k];
		k=ar.length;
		System.out.println("Enter the elements of String array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] =Utility.inputString();
		}
		Utility.IsortSearch(ar, k);
		
		double stop=System.currentTimeMillis();		
		 System.out.println("Stop time of the function : " + start);
	     
	     double elapsedTime=stop-start;		//Calculate elapsed time
	     System.out.println("Elapsed - Time in milliseconds : " + elapsedTime);
	}
}
