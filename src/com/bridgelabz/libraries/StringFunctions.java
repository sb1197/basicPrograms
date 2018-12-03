package com.bridgelabz.libraries;

import java.util.Arrays;

public class StringFunctions {
		
	/**
	 * @param str1 user input String 1
	 * @param str2 user input String 2
	 * @return This method checks whether input strings are anagram or not
	 */
	public static void checkAnagram(String str1, String str2)
	{
			int m = str1.length();
			int n = str2.length();
			
			if(m == n)
			{
				char[] a = str1.toCharArray();
				Arrays.sort(a);
				char[] b = str2.toCharArray();
				Arrays.sort(b);
				String sortedString1 = new String(a);
				String sortedString2 = new String(b);
	//			System.out.println("First string sorted is :"+sortedString1);
	//			System.out.println("Second string sorted is :"+sortedString2);
				
				if(sortedString1.equals(sortedString2))
				{
					System.out.println("Input Strings "+str1+" & "+str2+" are Anagram.. ");
				}
				else
				{
					System.out.println("Input Strings "+str1+" & "+str2+" are not Anagram..");
				}
			}
			else
			{
				System.out.println("Input strings are of differnt length..");
			}
	}

	//*************************************************************************************************

	 /**
	 * @param str user input string
	 * @return This method check whether given string is palindrome or not
	 */
	public static boolean stringPalindrome(String str)
	 {
			String reverse = "";
			boolean flag = false;
			int length = str.length();
			for ( int i = length - 1; i >= 0; i-- )
			{
				 reverse = reverse + str.charAt(i);
			}
		    if (str.equals(reverse))		       
		    	flag = true;
		    else		       
		    	flag = false;
	 
	 return flag;
	 
	 }

	//*************************************************************************************************

	
		/**
		 * @param ch is a character array 
		 * @param i is start value of character array
		 * @param j is the end value of character array
		 * @return This method is used to swap the character array 
		 */
		public static void stringSwap(char[] ch, int i, int j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}

		// Recursive function to generate all permutations of a String
		/**
		 * @param ch is a character array 
		 * @param currentIndex is an index value of array
		 * @return This method is used to find all permutations of input string
		 */
		public static void strRecursivePermutations(char[] ch, int currentIndex)
		{
			if (currentIndex == ch.length - 1) 
			{
				System.out.println(String.valueOf(ch));
			}

			for (int i = currentIndex; i < ch.length; i++)
			{
				stringSwap(ch, currentIndex, i);
				strRecursivePermutations(ch, currentIndex + 1);
				stringSwap(ch, currentIndex, i);		
			}
			
		}

		//*************************************************************************************************

		// Iterative function to generate all permutations of a String in Java
		
		/**
		 * @param char_arr is a character array 
		 * @param i is an index value of array
		 */
		public static void strPermutation(char[] char_arr, int i)
		{			
		    if(i==char_arr.length-1)
		    {
		        // print the shuffled string 
		            String str="";
		            for(int j=0; j<char_arr.length; j++)
		            {
		                str=str+char_arr[j];
		            }
		            System.out.println(str);
		    }
		    else
		    {
			    for(int j=i; j<char_arr.length; j++)
			    {
			        char tmp = char_arr[i];
			        char_arr[i] = char_arr[j];
			        char_arr[j] = tmp;
			        strPermutation(char_arr,i+1);
			        char tmp1 = char_arr[i];
			        char_arr[i] = char_arr[j];
			        char_arr[j] = tmp1;
			      
			    }
		    }
		}

		//*************************************************************************************************







































































































}
