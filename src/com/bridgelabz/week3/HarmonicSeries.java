package com.bridgelabz.week3;
import utility.Utility;

public class HarmonicSeries 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		        System.out.print("Enter any number : ");		        
		        int num = Utility.inputNumber();
		        System.out.print("The Harmonic Series is : ");
		        double result = 0.0;
		        while(num > 0)
		        {
		              result = result + (double) 1 / num;
		              num--;
		              System.out.print(result +"  ");
		        }
		        System.out.println(" ");
		        System.out.println("Output of Harmonic Series is "+result);
	
	}

}
