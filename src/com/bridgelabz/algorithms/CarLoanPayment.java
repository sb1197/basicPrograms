/**
 * Purpose  : This program reads in three command­line arguments P, Y, and R and calculates the car loan
 * 			  monthly payments you would have to make over Y years to pay off a P principal loan amount 
 * 			  at R per cent interest compounded monthly using given formula. 
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 22/11/18
 */

package com.bridgelabz.algorithms;
import utility.Utility;
public class CarLoanPayment 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double principal = Double.parseDouble(args[0]);
		double year = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		
		System.out.println("The values of P, Y, R :"+principal+" "+year+" "+rate);
		double carLoanPayment = Utility.monthlyPay(principal, year, rate);
		System.out.println("Car Loan Payment Calculated is :"+carLoanPayment);
		//check logic
	}

}
