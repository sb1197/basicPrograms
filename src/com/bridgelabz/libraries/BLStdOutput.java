package com.bridgelabz.libraries;

import java.io.*;
import java.util.Locale;

public class BLStdOutput 
{

	private static final Locale LOCALE = null;
	private static PrintWriter out;
	
	/**
     * Prints a character to standard output and flushes standard output.
     * @param string the character to print
     */
	public static void print(String s)
	{
		out.print(s);
	}
	
	/**
     * Prints a character to standard output and then terminates the line.
     * @param string the character to print
     */
	public static void println(String s)
	{
		out.println(s);
	}
	
	 /**
     * Terminates the current line by printing the line-separator string.
     */
	public static void println()
	{
		out.println();
	}
	
	 /**
     * Prints a formatted string to standard output, using the specified format
     * string and arguments
     * @param format
     * @param args
     */
	 public static void printf(String format, Object... args) {
	        out.printf(LOCALE, format, args);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
