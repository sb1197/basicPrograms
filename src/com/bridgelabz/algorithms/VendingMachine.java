package com.bridgelabz.algorithms;
import utility.Utility;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the money to be returned by vending machine");
		int amount = Utility.inputNumber();
		Utility.countCurrency(amount);
	}

}
