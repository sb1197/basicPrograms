package com.calculaterandom;

import java.util.Random;

import utility.Utility;

public class Demo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int numberToGenerate=5;
		int array[] = new int[numberToGenerate];
		 Random rd = new Random();
		
		 for(int i=0;i<array.length;i++)
		 {
			 int randomNumber = rd.nextInt(10);
			 array[i] = randomNumber;
			 System.out.println(array[i]);
		 }
		 
				
		
			
	}
}


