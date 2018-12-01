/**
 * Purpose  : This program prints three names in reverse order. 
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 24/11/18
 */


package com.bridgelabz.functional;

import java.util.Scanner;
public class PrintThreeNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1,rev="Hi ";		
	
		System.out.println("Enter names: ");
		s1 = sc.nextLine();
		String arr[] = s1.split(" ");
		System.out.println("Array is");
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");		
		}
		
		for(int i =arr.length-1; i>=0;i--)
		{
			rev = rev + arr[i] + " ";
			//System.out.print(arr[i]+" ");			
		}
		System.out.println("Reverse : "+rev);	
		
	}

}
