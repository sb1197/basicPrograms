package com.bridgelabz.algorithms;
import utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first string :");
		String str1 = Utility.inputString();
		
		System.out.println("Enter second string :");
		String str2 = Utility.inputString();
		
		Utility.anagram(str1, str2);
	}

}
