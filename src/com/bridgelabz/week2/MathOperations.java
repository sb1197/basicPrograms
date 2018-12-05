package com.bridgelabz.week2;
import com.bridgelabz.libraries.MathFunction;
import utility.Utility;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" 1) To return an harmonic number. "
				+ "\n 2) To return a sin of an angle. "
				+ "\n 3) To return cosine of an angle."
				+ "\n 4) To return Binary of a number. ");

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
					System.out.println("Enter an angle to find sine value :");
					double angle = Utility.doubleNumber();
					System.out.println("Input number is" +angle);
					System.out.println("Sine of given angle :");
	
					double res = MathFunction.calculateSine(angle);
					System.out.println("Sine value for "+angle+" gives "+res);
					break;
				
				case 3:  // TO RETURN A COSINE VALUE OF ANGLE
					System.out.println("Enter an angle to find cosine value :");
					double angle1 = Utility.doubleNumber();
					System.out.println("Input number is" +angle1);
					
					double result1 = MathFunction.calculateCosine(angle1);
					System.out.println("Cosine value for "+angle1+" gives "+result1);
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
