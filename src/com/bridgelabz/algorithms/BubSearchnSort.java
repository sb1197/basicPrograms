package com.bridgelabz.algorithms;
import utility.Utility;

public class BubSearchnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 		
		//Bubble Sort on Integer Array
		double start1=System.currentTimeMillis();

		System.out.println("Enter the size of Integer array");
		int k = Utility.inputNumber();
		int ar[] = new int[k];
		k=ar.length;
		System.out.println("Enter the elements of Integer array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] =Utility.inputNumber();
		}
		System.out.println("Elements of Integer array are : ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		Utility.BubIntsort(ar, k);
		
		double stop1=System.currentTimeMillis();
		
		double elapsedTime1=stop1-start1;		//Calculate elapsed time
	     System.out.println("Elapsed - Time in milliseconds : " + elapsedTime1);
	     
	/**********************************************************************/	
		//Bubble Sort on String Array
	    double start2=System.currentTimeMillis();
	    
		System.out.println("Enter the size of String array");
		int n = Utility.inputNumber();
		String arr[] = new String[n];
		n=arr.length;
		System.out.println("Enter the elements of String array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] =Utility.inputString();
		}
		Utility.BubStrsort(arr, n);
		
		double stop2=System.currentTimeMillis();	
		
		double elapsedTime2=stop2-start2;		//Calculate elapsed time
	     System.out.println("Elapsed - Time in milliseconds : " + elapsedTime2);
	}

}
