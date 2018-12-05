package com.bridgelabz.week3;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import utility.Utility;

public class RegularExpression 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter name :");
		String name = Utility.inputString();
		String splitname[] = name.split(" ");
		String fname = splitname[0];
		System.out.println(fname);
		System.out.println("Enter your mobile :");
		String contact = Utility.inputString();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String today = dateFormat.format(date);
		System.out.println(today);
		
		String template ="Hello <<name>>, We have your full name as <<full name>> in our system. "
				+ "Your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification."
				+ " Thank you BridgeLabz 01/01/2016";
		String regexName="<<name>>";
		String regexFullName="<<full name>>";
		String regexPhoneNumber="xxxxxxxxxx";
		String regexDate="01/01/2016";
		
		//Method is used for replace the operation
				template=Utility.replaceOperation(template,regexName,fname);
				template=Utility.replaceOperation(template,regexFullName,name);
				template=Utility.replaceOperation(template,regexPhoneNumber,contact);
				template=Utility.replaceOperation(template,regexDate,today);
				System.out.println(template);
	}

}
