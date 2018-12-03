package com.bridgelabz.libraries;

public class MathFunction {

	 /**
	 * @param d return date
	 * @param m return month
	 * @param y return year
	 * @return This method takes input date, month, year and calculates day of week
	 */
	public static int dayOfWeek(int d, int m, int y) 
	  {
		  // Calculate day of week by taking date input from user.
		  int y0 = y-(14 - m) / 12;
		  int x = y0 + y0/4 -y0/100 +y0/400;
		  int m0 = m + 12 * ((14 - m) /12) - 2;
		   // Calculate day of week
		  int d0 = (d + x +(31*m0)/12)%7;
		
		  return d0;
	  }
	 
	 //**********************************************************************************
	 
	 /**
	 * @param year is an input from user
	 * @return This method returns whether the year is leap or not 
	 */
	public static boolean checkLeapYear(int year)
	  {
		  boolean isLeap = false;	 
			  if(year % 4 == 0)
			  {
				  if( year % 100 == 0)
				  {
					  if ( year % 400 == 0)
						  isLeap = true;
					  else
						  isLeap = false;
				  }
				  else
					  isLeap = true;
			  }
			  else 
			  {
				  isLeap = false;
			  }		 
		  return isLeap; 
	  }
	 
	 //********************************************************************************** 
	 
	 /**
	 * @param n is an input given by user
	 * @return This method returns the Harmonic value of input number
	 */
	public static double harmonicNumber(int n)
		{
			double sum = 0;	
			// Calculate till we get n'th term
	        for (double i = 1; i <= n; i++) 
	        {
	            sum = sum + (double)1 / i;	//To calculate the harmonic value of given input  
	        }
	        return sum;
		}
	 
	//********************************************************************************** 
	 
	 /**
	 * @param n is user input decimal number
	 * @return This method returns the binary conversion of given number 
	 */
	public static void decimalToBinary(int n)
	  {
		// array to store binary number 
	        int[] binaryNum = new int[1000]; 
	   
	        // counter for binary array 
	        int count = 0; 
	        while (n > 0)  
	        { 
	            // storing remainder in binary array 
	            binaryNum[count] = n % 2; 
	            n = n / 2; 
	            count++; 
	        }     
	
	        // printing binary array in reverse order 
	        System.out.println("Converted Binary Number is:");
	        for (int j = count - 1; j >= 0; j--) 
	        {
	            System.out.print(binaryNum[j]);	         
	        }	
	  }
	 
	 
	//**********************************************************************************  
	 

	  /**
	 * @param c is an input number
	 * @return This method returns the square roots of given number
	 */
	public static double squareRoot(double c)
	  {
		  double epsilon = 1e-15;    
	        double t = c;              // calculate the square root of c
	        
	        // repeatedly apply Newton method until desired precision is achieved
	        while (Math.abs(t - c/t) > epsilon*t)
	        {
	            t = (c/t + t) / 2.0;
	        }
	        return t;
	  }
	 
	 
	//**********************************************************************************   
	 
	 /**
	 * @param num is an Input number 
	 * @return This method is to check input number is prime or not
	 */
	public static boolean primeNumber(int num)
	 {
		 boolean flag = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            // condition for nonprime number
	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }
	        return flag;
	 }
	 
	//**********************************************************************************   
	 
	 /**
	 * @param n Input value from user
	 * @return This method returns the factorial of given input number
	 */
	public static int findFactorial(int n)
	{
		 int i,fact=1;  
		 for(i=1;i<=n;i++)
		 {    
		      fact=fact*i;    
		 }    
		  
		 return fact;
	}
	 
	//********************************************************************************** 
	 
	 /**
	 * @param C is money value that user wants to invest
	 * @param R is rate of interest
	 * @param T is time period
	 * @return This method returns the future value calculated using formula.
	 */
	public static double futureValue(double C,double R, double T)
	{
		 double r = Math.pow((1+R), T);
		 double futureVal = C * r;
		 return futureVal;
	}
	 
	//********************************************************************************** 
	 
	 /**
		 * @param C is money value that user wants to invest
		 * @param R is rate of interest
		 * @param T is time period
		 * @return This method returns the present value calculated using formula.
		 */
	public static double presentValue(double C,double R, double T)
	{
		 double r = Math.pow((1+R), T);
		 double futureVal = C / r;
		 return futureVal;
	}
	 
	//**********************************************************************************  
	 
	 /**
	 * @param numbers user input integer array 
	 * @return	This method returns the maximum value from the integer array
	 */
	public static int getMaxValue(int[] numbers)
	 {
		  int maxValue = numbers[0];
		  for(int i=1;i < numbers.length;i++)
		  {
			    if(numbers[i] > maxValue)
			    {
			    	maxValue = numbers[i];
				}
		  }
		  return maxValue;
		}
	 
	//**********************************************************************************  
	 
	 	/**
		 * @param numbers user input integer array 
		 * @return	This method returns the minimum value from the integer array
		 */
		public static int getMinValue(int[] numbers)
		{
			  int minValue = numbers[0];
			  for(int i=1;i<numbers.length;i++)
			  {
				  if(numbers[i] < minValue)
				  {
					  minValue = numbers[i];
				  }
			  }
			  return minValue;
		}
	 
	//**********************************************************************************   
	 
	 
	 /**
	 * @param x1 x co-ordinate of Point A
	 * @param y1 y co-ordinate of Point A
	 * @param x2 x co-ordinate of Point B
	 * @param y2 y co-ordinate of Point B
	 * @param x3 x co-ordinate of Point C
	 * @param y3 y co-ordinate of Point C
	 * @return This method checks the given points are collinear or not using Slope formula
	 */
		
	public static void checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		 	int slopeAB = (y2 - y1) / (x2 - x1);
			int slopeBC = (y3 - y2) / (x3 - x2);
			int slopeAC = (y3 - y1) / (x3 - x1);
			//int sum = (y2 - y3) * x1 + (y3 - y1) * x2 + (y1 - y2) * x3 ;
			
			if(slopeAB == slopeBC && slopeBC == slopeAC)
			{
				 System.out.println("The points are collinear");
			}
			else
	            System.out.println("The points are not collinear");
	 }
	 
	//**********************************************************************************   	
		
	/**
	 * @param x1 x co-ordinate of Point A
	 * @param y1 y co-ordinate of Point A
	 * @param x2 x co-ordinate of Point B
	 * @param y2 y co-ordinate of Point B
	 * @param x3 x co-ordinate of Point C
	 * @param y3 y co-ordinate of Point C
	 * @return This method checks the given points are collinear or not using Area formula
	 */
	public static void checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3)
	{
			int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2); 
			if(area == 0)
			{
				 System.out.println("The points are collinear");
			}
			else
		         System.out.println("The points are not collinear");
	}
		
		
	//**********************************************************************************  	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	 
	 
}
