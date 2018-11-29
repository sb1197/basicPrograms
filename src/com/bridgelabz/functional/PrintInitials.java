/**
 * Purpose  : This program prints the initials (KDW) in big letters using asterisk pattern.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 28/11/18
 */

package com.bridgelabz.functional;
import utility.Utility;
public class PrintInitials 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter your Name: ");
		String initialName = Utility.inputString();
		int n = Utility.stringPattern(initialName);
		if(n==0)
		{
			System.out.println("Input String do not match with defined pattern..Try Again..");
		}
	
	}  

}  

