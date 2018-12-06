/**
 * Purpose  : This program read words from file and search word from the file using binary search method. 			  
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 01/12/18
 */

package com.bridgelabz.week3;
import java.io.*;
import java.util.Arrays;

import utility.Utility;
public class Word
{

	private static BufferedReader br;

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub	
		
		File file=new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/week3/sample.txt");// to open the file		
		    br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));		
		    String line = null;		
		    String tokens[] = {};
		    while((line = br.readLine())!= null)		
		    {		
		        // s+ anynumber of white spaces between tokens 		
		         tokens = line.split ("\\s+");	
		    }
		   Arrays.sort(tokens, 0, tokens.length);
		   System.out.println("File elements are :");
		    for (int i=0 ; i<tokens.length ; i++)
	        { 
		    	System.out.println(tokens[i]);
	        }
		    System.out.println("Enter a word to search from input file :");
		    String search = Utility.inputString();
		    System.out.println("Input string to be search :"+search);
		    Utility.searchString(tokens, search);
		    
		    
		    //return result to main()
	}
}
