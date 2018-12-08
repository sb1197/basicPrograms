package com.bridgelabz.week3;

import java.util.Random;

import utility.Utility;

public class RepeatedIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Enter the size of array :");
		int size = 30; 						//Utility.inputNumber();
		int array[] = new int[size];
		  Random rand = new Random();
		//System.out.println("Enter the elements of array:");
		for(int i = 0; i<size; i++)
		{
			array[i] = rand.nextInt(size);								//Utility.inputNumber();
		}
		System.out.println("Array elements are :");
		for(int i = 0; i<size; i++)
		{
			System.out.print(array[i]+" ");							
		}
		
		int output[] = Utility.printRepeatedArrayElement(array, size);
		for(int i=0;i<output.length;i++)
		{
			if(output[i]==0)
				System.out.print("");
			else
			System.out.print(output[i]+" ");
		}
		
	}

}
