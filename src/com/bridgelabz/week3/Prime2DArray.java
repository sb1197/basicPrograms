package com.bridgelabz.week3;

public class Prime2DArray {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
			int i,j,n=1000,k=0;
			int flag = 0;
			int intArray[] = new int[n];
			
			for(i=0;i<=n;i++)
			{
				for(int z=2;z<i;z++)
				{
					if(i%z==0)
					{
						flag = 0;
						break;
					}
					else					
						flag = 1;						
				}
				if(flag == 1)
				{
					System.out.print(i+" ");
					intArray[k] = i;
					k++;
				}
			}
//			System.out.println("\nK"+k);
//			System.out.println("\nArray is");
//			for(int m=0;m<k;m++)
//			{
//				System.out.println(intArray[m]);
//			}
			
			int a[][]=new int[10][30];
			int b[][]=new int[10][30];
	
			int count=0;
		      for(i=0;i<10;i++)
		        {
		           for(j=0;j<25;j++)
		            {
		                if(count==intArray.length) 
		                	break;

		            a[i][j]=intArray[count];
		            count++;
		            }
		        }
		    System.out.println("Count is "+count);	
					
		    
		    int pause = 100;//taking for partition purpose
					
			System.out.println("2d Array :"); 
			
		    for(i=0;i<10;i++)
	        {
	           for(j=0;j<25;j++)
	            {	
	        	  
	        	   if(a[i][j]>pause)
	                 {
	        		   //System.out.print(a[i][j]+" ");
	        		//   System.out.println("Pause :"+pause);
	                     pause=pause+100;
	                     System.out.println();
	                 }	
	        	   System.out.print(a[i][j]+" ");
	            }
	        }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					

	}

}
