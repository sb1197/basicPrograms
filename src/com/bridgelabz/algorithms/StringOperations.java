/**
 * Purpose  : This program is to perform different Operations on Strings.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 29/11/18
 */

package com.bridgelabz.algorithms;
import com.bridgelabz.libraries.StringFunctions;
import utility.Utility;

public class StringOperations
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("1)To Check String Is Anagram. \n2) To Check String is Palindrome. "
								+ "\n3)To Find all Permutations Of Given String(Recursive Method)"
								+ "\n 4)To Find all Permutations Of Given String(Iterative Method)");

		int cont;
		do
		{
			System.out.println("Enter your choice to perform String Operations:");
			int choice = Utility.inputNumber();
			switch(choice)
			{
				case 1:
					System.out.println("Enter first string :");
					String string1 = Utility.inputStr();
					
					System.out.println("Enter second string :");
					String string2 = Utility.inputStr();
					
					StringFunctions.checkAnagram(string1, string2);
					
					//consider spaces between strings
					break;
					
				case 2:
					System.out.println("Enter string to check if it is Palindrome or not :");
					String checkString = Utility.inputStr();
					
					boolean status = StringFunctions.stringPalindrome(checkString);
					if(status==true)
					{
						  System.out.println(checkString+" is a palindrome");
					}
					else
					{
						  System.out.println(checkString+" is not palindrome");
					}
					break;
					
				case 3:
					System.out.println("Enter a sting to find all Permutations of Using Recursive Method:");
					String s = Utility.inputStr();
					//String s = "ABC";
					StringFunctions.strRecursivePermutations(s.toCharArray(), 0);
					break;
			
				case 4:
					System.out.println("Enter a string to find all Permutations of Using Iterative Method:");
					String string = Utility.inputStr();
					
					StringFunctions.strPermutation(string.toCharArray(), 0);
					break;
			
				default:
					System.out.println("Invalid Input..");
					break;
			
			}
			System.out.println("Do you want to continue (0=Exit/1=Continue):");
			cont = Utility.inputNumber();
		}while(cont==1);
		
	}

}
