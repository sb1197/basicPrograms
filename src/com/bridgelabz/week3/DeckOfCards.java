package com.bridgelabz.week3;

public class DeckOfCards 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String cards[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};		
		
		// initialize deck
	    int n = suit.length * cards.length;
	    String[] deck = new String[n];
	    
	    for (int i = 0; i < cards.length; i++) 
	    {
	        for (int j = 0; j < suit.length; j++)
	        {
	            deck[suit.length*i + j] = cards[i] +  suit[j];
	        }
	    }
	    
	    System.out.println("Deck elements are :");
	    for (int i = 0; i < deck.length; i++) 
	    { 
	           System.out.print(deck[i]+" ");	        
	    }
	    System.out.println();
	    
	    // shuffle the cards to get random cards
	    for (int i = 0; i < n; i++)
	    {
	        int r = i + (int) (Math.random() * (n-i));
	        String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	    }
	    
	 // print shuffled deck
	    for (int i = 0; i < 4; i++) {
	        System.out.println("\n* Person "+(i + 1)+"*");
	        for (int j = 0; j < 9; j++) {
	            System.out.println(deck[i + j * 4]);
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
