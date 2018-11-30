package com.bridgelabz.libraries;

public class MathFunction {

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
	 
	 public static double futureValue(double C,double R, double T)
	 {
		 double r = Math.pow((1+R), T);
		 double futureVal = C * r;
		 return futureVal;
	 }
	 
	//********************************************************************************** 
	 
	 public static double presentValue(double C,double R, double T)
	 {
		 double r = Math.pow((1+R), T);
		 double futureVal = C / r;
		 return futureVal;
	 }
	 
	//**********************************************************************************  
	 
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	 
	 
}
