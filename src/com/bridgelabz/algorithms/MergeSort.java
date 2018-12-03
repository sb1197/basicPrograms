/**
 * Purpose  : This program is used to sort the string array using Merge Sort method.			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 01/12/18
 */

package com.bridgelabz.algorithms;
import java.util.*;

import utility.Utility;
public class MergeSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		System.out.println("Enter size of arraylist:");
		 int n = Utility.inputNumber();
		 ArrayList<String> strings = new ArrayList<String>();
		 System.out.println("Please enter a list of Strings: ");
		for(int j=0;j<=n;j++)
	      {
	         String input = Utility.inputString();
	         strings.add(input);
	      }
		 System.out.println("Input arraylist is :");
	     String tokens[] = new String[strings.size()];
	     
	     for (int i = 0; i < strings.size(); i++) {
				System.out.println(strings.get(i));
				tokens[i]=strings.get(i);
			}
	      System.out.println("Converted array is :");
	      for (int i = 0; i < strings.size();i++) 
	      {
				System.out.println(tokens[i]);
	      }
	      Utility.mergeSort(tokens, 0, n);
	      System.out.println("Sorted array is :");
	      for (int i = 0; i < strings.size();i++) 
	      {
				System.out.println(tokens[i]);
	      }
	      
	      
	      
	}

}







///*ArrayList to Array Conversion */
//String array[] = new String[arrlist.size()];              
//for(int j =0;j<arrlist.size();j++){
//  array[j] = arrlist.get(j);
//}
//
///*Displaying Array elements*/
//for(String k: array)
//{
//	System.out.println(k);
//}

