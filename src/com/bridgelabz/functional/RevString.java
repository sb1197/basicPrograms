package com.bridgelabz.functional;
import utility.Utility;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		System.out.println("Enter your name:");
		str1= Utility.inputString();		//Input string
		Utility.revstr(str1);	//Function calling from utility class
	}

}
