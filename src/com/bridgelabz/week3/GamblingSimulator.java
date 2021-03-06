/**
 * Purpose  : This program is to print the Number of times user won, Percentage of Win and 
 * 			  Average number of bets made in Gambling Game played.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 18/11/18
 */

package com.bridgelabz.week3;
import utility.Utility;

public class GamblingSimulator 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int stake, goal, trials;		
		// Take input money to invest in game, goal and number of times to play.
		System.out.println("Enter the money :");
		stake = Utility.inputNumber();
		System.out.println("Enter the goal to set :");
		goal = Utility.inputNumber();
		System.out.println("Enter number of times to play  :");
		trials = Utility.inputNumber();
		
//		   int stake  = Integer.parseInt(args[0]);    
//	       int goal   = Integer.parseInt(args[1]);    
//	       int trials = Integer.parseInt(args[2]); 
		
		String output[][] = Utility.gambler2DArray(stake,goal,trials);

        for(int i=0;i<2;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(output[i][j]+"  ");
        	}
        	System.out.println();
        }
        
    }

}

