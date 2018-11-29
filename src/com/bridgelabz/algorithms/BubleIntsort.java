package com.bridgelabz.algorithms;
import java.util.*;

import utility.Utility;
public class BubleIntsort {

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
	      System.out.println("Converted array is :");
	      for (int j = 0; j < n; j++) 
	      {
	    	  System.out.println(tokens[j]);
	      }
	     Utility.BubIntsort(tokens, n);
	    
			
	}

}
