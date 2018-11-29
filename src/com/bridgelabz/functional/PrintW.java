package com.bridgelabz.functional;

public class PrintW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Function to generate the pattern W
		int i,j;
		 // loop for rows 
		for(i=0;i<=6;i++)
		{
			 // loop for columns 
			for(j=0;j<=20;j++)
			{			 
				// Logic to generate stars 
				
				if(j==0 || j==12)
				System.out.print("**");
				else if(i==5 && (j==2 || j==10))
				System.out.print("*");
				else if(i==4 && (j==4 || j==8))
				System.out.print("*");
				else if(i==3 && j==6)
				System.out.print("*");
				else 
					 // For the spaces 
				System.out.print(" ");
			}
			// For changing line 
			System.out.println();
		}	
		
	}
}