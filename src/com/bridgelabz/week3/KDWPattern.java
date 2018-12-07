/**
 * Purpose  : This program is used to print the asterisk pattern of matching initial alphabets of input user names.			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 01/12/18
 */


package com.bridgelabz.week3;
import utility.Utility;
public class KDWPattern 
{			
		public static void main(String[] args) 
		{
				// TODO Auto-generated method stub	
				System.out.println("Enter the names :");
				String names = Utility.inputString();
				String word[] = null;
				//To get the Initials of input names
				for(int i = 0;i<names.length();i++)
				{
					 word = names.split("\\s+");	
				}
				
				//To search for appropriate pattern  
				for(int i=0;i<word.length;i++)
				{
					if(word[i].charAt(0)=='k')
					{
						Utility.readPatternFromFile("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/pattern.txt", 1,9);
						System.out.println();
						
					}
					else if(word[i].charAt(0)=='d')
					{
						Utility.readPatternFromFile("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/pattern.txt", 11,19);	
						System.out.println();
					}
					else if(word[i].charAt(0)=='w')
					{
						Utility.readPatternFromFile("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/pattern.txt", 21,29);		
					}
					else
						System.out.println("Given string do not match with any pattern..");
				}
		
		
		}

}
