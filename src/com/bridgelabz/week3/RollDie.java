package com.bridgelabz.week3;
import utility.Utility;
public class RollDie 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("Enter the number of times to roll the dice :");
		int n = Utility.inputNumber();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int random = (int) ((Math.random()*6)+1);
			if(random>1 || random<6)
			{
				arr[i]=random;
			}
			
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		Utility.countNumberFrequency(arr);
		
		
					
		
	}

}
