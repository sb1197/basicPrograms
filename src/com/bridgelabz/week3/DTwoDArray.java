/**
 * Purpose  : This program is to print following 2D Array.
 *  			1) To print 2D Integer Array
				2) To print 2D Double Array
				3) To print 2D Boolean Array
				
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 4/12/18
 */

package com.bridgelabz.week3;
import utility.Utility;

public class DTwoDArray 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int i, j; 
		System.out.println("1. To print 2D Integer array \n"
				+ "2. To print 2D Double Array \n"
				+ "3. To print 2D Boolean Array");
		int cont;
		do
		{
			System.out.println("Enter your choice :");
			int choice = Utility.inputNumber();
			switch(choice)
			{
				case 1:
					 int[][] arr = new int[2][2];
					
					 //Accepting the Integer array elements
					 System.out.println("Enter the elements in Integer array");
					 for(i=0;i<arr.length;i++) 
					 {				
							for(j=0;j<arr.length;j++)
							{
								arr[i][j] = Utility.inputNumber();
							}
					 }
					 Utility.integerArray(arr,0,arr.length);
					
					break;
				
				case 2:
					 double[][] doubles = new double[2][2];
					 
					 //Accepting the Double array elements 
					 System.out.println("Enter the elements in Double array");
					 for( i=0;i<doubles.length;i++) 
					 {
							for(j=0;j<doubles.length;j++) 
							{
								doubles[i][j] = Utility.doubleNumber();
							}
					 }
					 
					Utility.doubleArray(doubles, 0, doubles.length);
					 break;
					 
				case 3:
					 boolean[][] booleans = new boolean[2][2];
					 
					//Accepting the Boolean array elements  		       
			        System.out.println("Enter the elements in Boolean array");
			        for(i=0;i<booleans.length;i++) 
			        {
						for(j=0;j<booleans.length;j++) 
						{
							booleans[i][j] = Utility.booleanValue();
						}
						System.out.println();
			        }
			        Utility.booleanArray(booleans, 0, booleans.length);
			       
			        break;
			        
			        default: 
			        	System.out.println("Invalid Input...");
			        	  break;
			}
			System.out.println();
			System.out.println("Do you want to continue (0=Exit/1=Continue):");
			cont = Utility.inputNumber();
		}while(cont==1);


	}

}
