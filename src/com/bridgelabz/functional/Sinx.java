package com.bridgelabz.functional;
import utility.Utility;
public class Sinx
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of n :");
		int n =Utility.inputNumber();
		System.out.println("Enter the value of x :");
		double x =Utility.doubleNumber();
		x = x % (2 * Math.PI);
		System.out.println(x);

        // compute the Taylor series approximation
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; i<=n ; i++) 
        {
            term = term *(x / i);
            if (i % 4 == 1) 
            	sum =sum + term;
            if (i % 4 == 3) 
            	sum =  sum - term;
           
        }
        System.out.println(sum);
	}

}
