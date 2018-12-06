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
	public static boolean isPrimeNumber(int num)
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
		 for(i=1;i<=n;i++)		//Traverse from i=1 to n
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
		// Compare the values till end
		  for(int i=1;i < numbers.length;i++)
		  {
			    if(numbers[i] > maxValue)		//Check array value with previous element
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
			  // Compare the values till end
			  for(int i=1;i<numbers.length;i++)
			  {
				  if(numbers[i] < minValue)			//Check array value with previous element
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
		 //Check points are collinear using slope formula
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
			int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);  //Check points are collinear using area formula
			if(area == 0)
			{
				 System.out.println("The points are collinear");
			}
			else
		         System.out.println("The points are not collinear");
	}
		
		
	//**********************************************************************************  	
		
	/**
	 * @param theta is an angle input
	 * @param n is the nth term to find Taylor series upto n
	 * @return This method returns the Taylor series of sin(x) upto nth term
	 */
	public static double calcSine(double theta, int n)
	{
		//Convert angle x to an angle between -­2PI and 2PI
		double x = theta * ( Math.PI/180);
		System.out.println("Convert angle: "+x);
		
		double sum = 0.0,term = 1.0;
		double numerator,denominator;
		
		for(int i = 1;i <= n; i++)
		{
			if(term!= 0.0)
			{
				if(i % 2 == 1)		//To iterate the i value with even numbers
				{
					//To calculate the numerator value using Math.power()			
					numerator = Math.pow(x, i);
					System.out.println("Numerator:"+numerator);
					// To calculate te denominator value using factorial()
					denominator = MathFunction.findFactorial(i);
					System.out.println("Denominator:"+denominator);
					term = term * ( numerator / denominator);
				}
				if (i % 4 == 1) 
					sum = sum + term;
	            if (i % 4 == 3) 
	            	sum = sum - term;
			}
		}	
		
		return sum;
	}


//*****************************************************************************************

	/**
	 * @param theta is an angle input
	 * @param n is the nth term to find Taylor series upto n
	 * @return This method returns the Taylor series of cos(x) upto nth term
	 */
	public static double calcCosine(double theta, int n)
	{
		//Convert angle x to an angle between -­2PI and 2PI
		double x = theta * ( Math.PI/180);
		System.out.println("Convert angle: "+x);
		
		double sum = 0.0,term = 1.0;
		double numerator,denominator;
		
		for(int i = 1;i <= n; i++)
		{
			if(term!= 0.0)
			{
				if(i % 2 == 0)		//To iterate the i value with even numbers
				{
					//To calculate the numerator value using Math.power()
					numerator = Math.pow(x, i);
					System.out.println("Numerator:"+numerator);
					// To calculate te denominator value using factorial()
					denominator = MathFunction.findFactorial(i);
					System.out.println("Denominator:"+denominator);
					term = term * ( numerator / denominator);
				}
				if (i % 4 == 0) 
					sum = sum + term;
	            if (i % 4 == 2) 
	            	sum = sum - term;
			}
		}	
		
		return sum;
	}

	//*****************************************************************************************

		public static Double calculateSine(double angle)
		{
			double radians = angle*Math.PI/180;
			return Math.sin(radians);
		}
		
		
		//************************************************************************************	

		public static Double calculateCosine(double angle)
		{
			double radians = angle*Math.PI/180;
			return Math.cos(radians);
		}
		
		//************************************************************************************	
		
		
		
		
		
		
		
		
		
	 
	 
	 
}
