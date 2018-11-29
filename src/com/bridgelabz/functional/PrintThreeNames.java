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
		String s1,s2,s3;
		System.out.println("Enter three names: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Hi "+s3+","+s2+","+s1+" .");
		//use reverse order in utility
	}

}
