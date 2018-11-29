package com.bridgelabz.functional;
import utility.Utility;

public class DTwoDArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int[][] arr = new int[2][2];
		 int i, j;
		 
		 //Accepting the Integer array elements
		 System.out.println("Enter the elements in Integer array");
		 for(i=0;i<arr.length;i++) 
		 {				
				for(j=0;j<arr.length;j++)
				{
					arr[i][j] = Utility.inputNumber();
				}
		 }
		 
		// To print Integer 2D array
		 for(i=0;i<arr.length;i++) 
		 {
				for(j=0;j<arr.length;j++) 
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
		 }
		
		 //******************************************************
		 
		 //Accepting the Double array elements 
		 		
		 double[][] doubles = new double[2][2];
		 System.out.println("Enter the elements in Double array");
		 for(i=0;i<doubles.length;i++) 
		 {
				for(j=0;j<doubles.length;j++) 
				{
					doubles[i][j] = Utility.doubleNumber();
				}
		 }
		 
			// To print Double 2D array
		 for(i=0;i<doubles.length;i++) 
		 {
				for(j=0;j<doubles.length;j++) 
				{
         System.out.print(doubles[i][j]+" ");
				}
				System.out.println();
		 }
         
		 //******************************************************
		 
		 //To print the Boolean array elements 
		 
        boolean[][] booleans = new boolean[2][2];
        for(i=0;i<booleans.length;i++) 
        {
			for(j=0;j<booleans.length;j++) 
			{
				if(i==j)
				  System.out.println("True \t");
				else
					 System.out.println("False \n");
			}
			System.out.println();
        }
      



	}

}
