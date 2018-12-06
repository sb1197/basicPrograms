/**
 * Purpose  : This program is used to sort the integer array using Bubble Sort method.			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 01/12/18
 */


package com.bridgelabz.week3;
import java.util.*;

import utility.Utility;
public class BubbleIntsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		 System.out.println("Enter size of arraylist:");
		 int n = Utility.inputNumber();
		 System.out.println("Please enter a list of numbers: ");
	       
	     for(int j=0;j<n;j++)
	      {
	         int input = Utility.inputNumber();
	         numbers.add(input);
	      }
	      System.out.println("Input arraylist is :");
	      int tokens[] = new int[n];
	      for (int i = 0; i < n; i++) 
	      {
				System.out.println(numbers.get(i));
				 tokens[i] = numbers.get(i);
	      }

	     Utility.BubbleIntsort(tokens, n);
	    
			
	}

}
