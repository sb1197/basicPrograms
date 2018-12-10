package com.bridgelabz.datastructures;
import java.util.Random;

import utility.Utility;

public class Demo 
{
	static int totalNo = 5;
	static int outputArray[] = new int[totalNo];
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			       // int totalNo = 15;
			       // int outputArray[] = uniqueRandomArray(totalNo);
			outputArray = uniqueRandomArray(totalNo);
			        
		}
	
		static void printArray()
		{
			for(int i = 0; i<totalNo; i++)
	        {
	            System.out.print(outputArray[i] + ", ");
	        }
			System.out.print("\n");
		}
		  
		public static int[] uniqueRandomArray(int totalNo)
		{
			
			  //int [] A = new int[totalNo];
			  Random rd = new Random();
			  
			  for(int i = 0; i< outputArray.length; )
			  {
			        if(i == outputArray.length)
			        {
			             break;
			        }
			       
			       int b = rd.nextInt(10);
			     
			        if(check(outputArray,b) == false)
			        {
			        	outputArray[i++] = b;
			        } else {
			        	System.out.println("no repeated:"+b);
	//		        	Arrays.sort(outputArray);
	//		        	int random = rd.nextInt(10-b);
	//		        	check(outputArray,random);
			        	//BSInt(totalNo, outputArray, b);
			        }
			      //  Arrays.sort(outputArray);
			        printArray();
			 }
			 int numbers[] = Utility.bubbleIntSort(outputArray, outputArray.length);
			    return numbers;
			 
		}
		    
		public static boolean check(int[] A, int n)
		{
			        for(int i=0; i<A.length; i++)
			        {
			            if(A[i] == n)
			            {
			                return true;
			            }
			        }
			        return false;
		}


		
		
		
		
}	//class close


