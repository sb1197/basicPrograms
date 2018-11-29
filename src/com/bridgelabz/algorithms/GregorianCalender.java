package com.bridgelabz.algorithms;
import utility.Utility;
public class GregorianCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dayofweek = { "Invalid", "Sun", "Mon", "Tue", 
                "Wed", "Thur", "Fri", "Sat" }; 
		int y = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int d = Integer.parseInt(args[2]); 
		System.out.println(dayofweek[Utility.method(y, m, d)]); 
	}

}
