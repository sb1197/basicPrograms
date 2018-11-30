package com.bridgelabz.libraries;

import java.util.Arrays;

//import utility.Utility;
public class StringFunctions {
		
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

	// Utility function to swap two characters in a character array
		public static void stringSwap(char[] ch, int i, int j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}

		// Recursive function to generate all permutations of a String
		public static void strRecursivePermutations(char[] ch, int currentIndex)
		{
			if (currentIndex == ch.length - 1) {
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
		
		public static void strIterativePermutations(char[] ch, int currentIndex)
		{

		}









































































































}
