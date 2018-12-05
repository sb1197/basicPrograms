package com.bridgelabz.week3;

import utility.Utility;

public class Poem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the animal :");
		String animal = Utility.inputStr();
		System.out.println("Enter sound :");
		String sound = Utility.inputStr();
		
		String template = "Old MacDonald had a farm,\n" + 
				"E­I­E­I­O.\n" + 
				"\n" + 
				"And on his farm he had some  %ANIMAL%,\n" + 
				"E­I­E­I­O.\n" + 
				"\n" + 
				"With a  %SOUND%, %SOUND% here,\n" + 
				"And a  %SOUND%, %SOUND% there,\n" + 
				"Here a  %SOUND%, there a  %SOUND%,\n" + 
				"Everywhere a  %SOUND%, %SOUND%,";
		
		String regexAnimal = "%ANIMAL%";
		String regexSound = " %SOUND%";
		
		template = Utility.poemReplace(template, regexAnimal, animal);
		template = Utility.poemReplace(template, regexSound, sound);
		System.out.println(template);
	}

}
