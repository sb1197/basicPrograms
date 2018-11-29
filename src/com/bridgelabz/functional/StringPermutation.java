package com.bridgelabz.functional;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[] = new char[] {'a', 'b', 'c'};
		int n = str.length;
		int i, j;
		System.out.println("Permutation of given string is:");
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			}
			System.out.println(str);
		}	
	}
}
