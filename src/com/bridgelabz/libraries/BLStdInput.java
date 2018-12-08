package com.bridgelabz.libraries;

import java.util.ArrayList;
import java.util.Scanner;

public class BLStdInput
{
	
	private static Scanner sc;	
	/**
	* Function is used to check the empty input 
	* @return Returns true if standard input is empty 
	*/
	public static boolean isEmpty() 
	{
	     return !sc.hasNext();
	}
	
	/**
     * Function used the next token from standard input, parses it as an integer, and returns the integer.
     */
	 public static int readInteger()
	 {
		 return sc.nextInt();
	 }
	
	/**
	 * Function used the next token from standard input, parses it as double, and returns the double.
	 */
	 public static double readDouble()
	 {
		 return sc.nextDouble();
	 }
	

	/**
	 * Function used the next token from standard input, parses it as String, and returns the String.
	 */
	 public static String readString()
	 {
		  return sc.next();
	 }
	
	
	 /**
	  * Function is used read the next token from standard input, parses it as a boolean,
	  * and returns the boolean.
	  */
	 public static boolean readBoolean()
	 {
	     String token = readString();
         if ("true".equalsIgnoreCase(token))  
        	 return true;
         if ("false".equalsIgnoreCase(token))
        	 return false;
         if ("1".equals(token))               
        	 return true;
         if ("0".equals(token))               
        	 return false;
		return false;
	 }
	 
	 /**
	  * Function is true if standard input has more input
	  * @return true if standard input has more input otherwise false
	  */
	   public static boolean hasNextCharacter() 
	   {
	    	boolean result = sc.hasNext();
	    	return result;
	   }
	   
	   /**
	     * Function is used to read and return the character
	     * @return 	the remainder of a input as a string
	     */
	   public static char readCharacter()
	   {
		  String ch = sc.next();
		  return ch.charAt(0);
	   
	   }
	  
	  /**
	    * Function is true if statndard input has more input  
	    * @return true if standard input has more input otherwise false
	    */
	   public static boolean hasNextLine()
	   {
	    	boolean result = sc.hasNext();
	    	return result;
	   } 
	 
	  /**
	   * Function is used to read and return the string
	   * @return the remainder of a input as a string
	   */
	   public static String readLine()
	   {
	    	String ch=sc.nextLine();
	    	return ch;
	   }
	    
	   /**
	     * Reads and returns the remainder of the input, as a string.
	     * @return the remainder of the input, as a string
	     */
	   public static String readAll()
	   {
	        if (!sc.hasNextLine())
	            return "";

	        String result = sc.next();
	        return result;
	    }
	   
	    /**
	     * Reads all remaining tokens into a string from standard input and returns them as an array of strings.
	     * @return all remaining tokens on standard input, as an array of strings
	     */
	    public static String[] readAllStrings(String convertToArray) 
	    {
	        String[] tokens = convertToArray.split(readAll());
	        if (tokens.length == 0 || tokens[0].length() > 0)
	            return tokens;

	        // don't include first token if it is leading whitespace
	        String[] newArray = new String[tokens.length-1];
	        for (int i = 0; i < tokens.length - 1; i++)
	        	newArray[i] = tokens[i+1];
	        return newArray;
	    }
	 
	    /**
	     * Reads all remaining tokens from standard input, parses them as integers, and returns
	     * them as an array of integers.
	     * @return all remaining integers on standard input, as an array
	     * @throws InputMismatchException if any token cannot be parsed as an {@code int}
	     */
	     public static int[] readAllInts() 
	     {
	        String[] fields = readAllStrings("");
	        int[] vals = new int[fields.length];
	        for (int i = 0; i < fields.length; i++)
	            vals[i] = Integer.parseInt(fields[i]);
	        return vals;
	    }
	     
	    
	     /**
	      * Reads all remaining tokens from standard input, parses them as doubles, and returns
	      * them as an array of doubles.
	      * @return all remaining doubles on standard input, as an array
	      * @throws InputMismatchException if any token cannot be parsed as a {@code double}
	      */
	     public static double[] readAllDoubles() 
	     {
	         String[] fields = readAllStrings("");
	         double[] vals = new double[fields.length];
	         for (int i = 0; i < fields.length; i++)
	         vals[i] = Double.parseDouble(fields[i]);
	         return vals;
	     }	     
	     
	     /**
	      * Reads all remaining lines from standard input and returns them as an array of strings.
	      * @return all remaining lines on standard input, as an array of strings
	      */
	     public static String[] readAllLines()
	     {
	         ArrayList<String> lines = new ArrayList<String>();
	         while (hasNextLine()) 
	         {
	             lines.add(readLine());
	         }
	         return lines.toArray(new String[lines.size()]);
	     }
	    
	     /**
	     * Reads all remaining tokens, parses them as integers, and returns
	     * them as an array of integers. 
	     * @return all remaninig integer on standard input, as an array of integer
	     */
	     public static int[] readInts()
	     {
	         return readAllInts();
	     }
	     
	    /**
	     * Read all remaining tokens, parse them as intgers, and returns
	     * then as array of doubles 
	     * @return all remaning double on standard input, as an array of double 
	     */	     
	     public static double[] readDoubles() 
	     {
	         return readAllDoubles();
	     }
	     
	    /**
	     * Read all remaining tokens, parse them as intgers, and returns
	     * then as array of doubles
	     * @return all remaning double on standard input, as an array of double 
	     */    
	     public static String[] readStrings() {
	         return readAllStrings("");
	     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
