package com.bridgelabz.algorithms;
import java.io.*;
import java.util.Arrays;

import utility.Utility;
public class Word
{

	private static BufferedReader br;

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		File file=new File("/home/bridgeit/eclipse-workspace/JPrograms/src/com/Algorithms/sample.txt");// to open the file		
		    br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));		
		    String line = null;		
		    String tokens[] = {};
		    while((line = br.readLine())!= null)		
		    {		
		        // s+ anynumber of white spaces between tokens 		
		         tokens = line.split ("\\s+");		
//		        for (int i=0 ; i<tokens.length ; i++)
//		        {		
//		            String var = tokens[i];
//		        }
		       
		    }
		    System.out.println("Array elements :");
		    for (int i=0 ; i<tokens.length ; i++)
	        { 
		    	System.out.println(tokens[i]);
	        }
		   Arrays.sort(tokens, 0, tokens.length);
		   System.out.println("Sorted Array elements :");
		    for (int i=0 ; i<tokens.length ; i++)
	        { 
		    	System.out.println(tokens[i]);
	        }
		    System.out.println("Enter a word to search from input file :");
		    String search = Utility.inputString();
		    System.out.println("Input string to be search :"+search);
		    Utility.BsearchString(tokens, search);
	}
}
