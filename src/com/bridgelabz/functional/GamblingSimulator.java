/**
 * Purpose  : This program is to print the Number of times user won, Percentage of Win and 
 * 			  Average number of bets made in Gambling Game played.
 * @author  : Shweta Bochare
 * @version : 1.0
 * @since   : 18/11/18
 */


package com.bridgelabz.functional;
import utility.Utility;

public class GamblingSimulator {

	public static void main(String[] args) {
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
		
		//Utility.gambler(stake,goal,trials);
    }

}

//check logic

//
//% java Gambler 50 100 1000
//*  503 wins of 1000
//*  Percent of games won = 50.3
//*  Avg # bets           = 2464.59
//*
