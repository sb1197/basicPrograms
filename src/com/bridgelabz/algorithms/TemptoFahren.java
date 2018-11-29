package com.bridgelabz.algorithms;
import utility.Utility;

public class TemptoFahren {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub	
		double temperature;
		System.out.println("Enter the temperature in Celsius or Fahrenheit :");
		temperature = Utility.doubleNumber();
		Utility.convertTemp(temperature);
		//display results here
	}

}
