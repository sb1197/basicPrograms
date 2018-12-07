package com.bridgelabz.functional;
import utility.Utility;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[]= new int[20];
		int arr[] = {-1,1,2,3,4,5,-3,-4,0,-5};
//		System.out.println("Input size of array :");
//		int n = Utility.inputNumber();
		int n = arr.length;
//		System.out.println("Enter elements of array :");
//		for(int i=0;i<n;i++)
//		{
//			arr[i] =Utility.inputNumber();	//Input elements in array
//		}
		Utility.calculateTriplet(n, arr);
	}
}
