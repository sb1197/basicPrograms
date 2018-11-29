package com.bridgelabz.functional;

public class PrintK {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 // Function to generate the pattern K 
		int i,j;
		 // loop for rows 
		for(i=0;i<=6;i++)
		{
			 // loop for columns 
			for(j=0;j<=6;j++)
			{
				 //To print vertical lines
				if(j==0) 
				System.out.print("**");
				
				// Logic to generate stars 
				
				else if(i==0 && j==5)
					System.out.print("***");
				else if(i==1 && j==4)
					System.out.print("***");
				else if(i==2 && j==3)
				System.out.print("***");
				else if(i==3 && j==1)
				System.out.print("***");
				else if(i==4 && j==3)
					System.out.print("***");
				else if(i==5 && j==4)
					System.out.print("***");
				else if(i==6 && j==5)
					System.out.print("***");
				else 
					 // For the spaces 
				System.out.print(" ");
			}
			// For changing line 
			System.out.println();
		}
		
		System.out.println();
		
		 // Function to generate the pattern D 
		int n = 16;
          
        // loop for rows 
        for (i = 10; i < n; i++)
        { 	              
            // loop for columns 
            for (j = 10; j <= n; j++)
            { 	                  
                // Logic to generate stars 
                
                if (j == 11 || ((i == 10 || i == n-1) && (j > 10 && j < n-2)) || (j == n-1 && i != 10 && i != n-1)) 
                    System.out.print("**");  	                      
                // For the spaces 
                else
                    System.out.print("  ");  
            } 	              
        // For changing line 
        System.out.println(); 
        } 			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
