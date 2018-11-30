package com.bridgelabz.algorithms;
import com.bridgelabz.libraries.MathFunction;
import utility.Utility;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 1) To return an harmonic number. "
				+ "\n 2) To return a sin of an angle. "
				+ "\n 3) To return cosine of an angle."
				+ "\n 4) To return Binary of a number. "
				+ "\n 5) To find Square root of a number."
				+ "\n 6) To find given number is prime or not. "
				+ "\n 7) To find factiorial of a given number."
				+ "\n 8) To calculate Future and Present Value."
				+ "\n 9) To find MINIMUM and MAXIMUM value from integer array.");

		int cont;
		do
		{
			System.out.println("Enter your choice to perform Math Operations:");
			int choice = Utility.inputNumber();
			switch(choice)
			{
				case 1: // TO FIND HARMONIC VALUE OF GIEN NUMBER
					System.out.println("Enter the number to return a harmonic value of :");
					int number = Utility.inputNumber();
					System.out.println("Input Value is :"+number);		
					double result = MathFunction.harmonicNumber(number);
					System.out.println(result);		//Print the harmonic value
					break;
				
				case 2:  // TO RETURN A SINE VALUE OF ANGLE
					break;
				
				case 3:  // TO RETURN A COSINE VALUE OF ANGLE
					break;
				
				case 4:  //TO CONVERT GIVEN NUMBER INTO BINARY FORM
					System.out.println("Enter the number to convert in Binary :");
					int decimalNum = Utility.inputNumber();
					//int decimalNum = Integer.parseInt(args[0]);
					if(decimalNum<0)
					{
						System.out.println("Invalid Input.Enter Positive Decimal Number..Try Again..");
					}
					else
						MathFunction.decimalToBinary(decimalNum);
					break;
				
				case 5:  //TO FIND SQUARE ROOT OF GIVEN NUMBER
					System.out.println("Enter a number to find square root of :");
					  double num = Utility.doubleNumber();
					  if(num<0)
					  {
						  System.out.println("Invalid Input.. Try Again.");
					  }
					  else
					  {
						 // print out the square root of c	       
						  double output = MathFunction.squareRoot(num);
						  System.out.println("Square root of given number "+num+" is :"+output);
					  }
					break;
				
				case 6: //TO FIND GIVEN NUMBER IS PRIME OR NOT
						System.out.println("Enter any number to check whether itis prime or not: ");
						int primeNum = Utility.inputNumber();
						if(primeNum != 0)
						{
							boolean flag = MathFunction.primeNumber(primeNum);
							if (!flag)
					            System.out.println(primeNum + " is a prime number.");
					        else
					            System.out.println(primeNum + " is not a prime number.");
						}
						else
						{
							System.out.println("Invalid Input..");		
						}
						
					break;
					
				case 7:  //TO FIND FACTORIAL OF A GIVEN NUMBER
						System.out.println("Enter a number to find factorial of:");
						int factNum = Utility.inputNumber();
						if(factNum != 0)
						{
							int res = MathFunction.findFactorial(factNum);
							System.out.println("Factorial of "+factNum+" is: "+res);
						}
						else
							System.out.println("Give proper Input..");						
						break;
				
				case 8:  //TO CALCULATE FUTURE VALUE AND PRESENT VALUE
						System.out.println("Enter money :");
						double money = Utility.doubleNumber();
						System.out.println("Enter rate of interest:");
						double rateOfInterest = Utility.doubleNumber();
						System.out.println("Enter years :");
						double year = Utility.doubleNumber();
						if(money < 0 || rateOfInterest < 0 || year < 0)
						{
							System.out.println("Incorrect Input..");
						}
						else 
						{		
							double futureVal = MathFunction.futureValue(money, rateOfInterest, year);
							System.out.println("Future Value Calculated is : "+futureVal);
							
							double presentVal = MathFunction.presentValue(money, rateOfInterest, year);
							System.out.println("Present Value Calculated is : "+presentVal);
						}
						break;
				
				case 9:  //TO FIND MINIMUM AND MAXIMUM VALUE FROM INTEGER ARRAY
						System.out.println("Enter the size of array :");
						int size = Utility.inputNumber();
						int arrInteger[] =  new int[size];
						System.out.println("Enter the elements :");
						for(int i=0;i<size;i++)
						{
							arrInteger[i] = Utility.inputNumber();
						}
						System.out.println("Input Array Elelments are: ");
						for(int i=0;i<size;i++)
						{
							System.out.println(arrInteger[i]);
						}
						int maxValue = MathFunction.getMaxValue(arrInteger);
						System.out.println("Maximum Value :"+maxValue);
						
						int minValue = MathFunction.getMinValue(arrInteger);
						System.out.println("Maximum Value :"+minValue);
						
						break;
				
				default:
					System.out.println("Invalid Input..Try once more...");
					break;
			
			}
			System.out.println();
			System.out.println("Do you want to continue (0=Exit/1=Continue):");
			cont = Utility.inputNumber();
		}while(cont==1);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
