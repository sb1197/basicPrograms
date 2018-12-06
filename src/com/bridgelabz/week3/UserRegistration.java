package com.bridgelabz.week3;

import utility.Utility;

public class UserRegistration 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//**********READ FIRST NAME OF USER***********//
		
		System.out.println("Enter your First name : ");
		String fName = Utility.inputString(); 
		boolean flag = Utility.nameValidate(fName);
//		if(flag==true)
//		{
//			System.out.println("First Name :"+fName);
//		}
		
		//**********READ LAST NAME OF USER***********//
		
		System.out.println("Enter your Last name : ");
		String lName = Utility.inputString();
		boolean flag1 = Utility.nameValidate(lName);
//		if(flag1==true)
//		{
//			System.out.println("Last Name :"+lName);
//		}
		
		//**********READ EMAIL ID OF USER***********//
		
		System.out.println("Enter your Email address :");
		String email = Utility.inputString();
//		if (Utility.emailValidate(email))  
//		{ 
//            System.out.println("Email Id :" +email);
//		}
//        else
//        {
//            System.out.println("Invalid Email Address");  
//        }	
		
		//**********READ CONTACT OF USER***********//
	
		System.out.println("Enter your contact : ");
		String contact = Utility.inputString();
	 
//		if (Utility.contactValidate(contact))  
//		{
////            System.out.println("Valid Number");  
//			System.out.println("Contact is :"+contact);
//		}
//        else
//        {
//            System.out.println("Invalid Number");  
//        }	
//		
		//**********READ COMPANY NAME OF USER***********//
		
		System.out.println("Enter Company name :");
		String company = Utility.inputStr();
//		System.out.println("Company Name :"+company);
	
		//**********READ USER ID OF USER***********//
		
		System.out.println("Enter UserId :");
		String userId = Utility.inputStr();
		
//		if(Utility.userIdValidate(userId))
//		{
////			System.out.println("Valid User Id");  
//			System.out.println("User Id is :"+userId);
//		}
//        else
//        {
//            System.out.println("Invalid User Id");  
//        }	
	
		//**********READ PASSWORD OF USER***********//
		
		System.out.println("Enter Password :");
		String password = Utility.inputStr();
	
//		if(Utility.passwordValidate(password))
//		{
////			System.out.println("Valid Password");  
//			System.out.println("Password is :"+password);
//		}
//        else
//        {
//            System.out.println("Invalid Password");  
//        }	
//	
	//**************************************************************
		if(flag==true)
		{
			System.out.println("First Name :"+fName);
		}
		
	//**************************************************************
		if(flag1==true)
		{
			System.out.println("Last Name :"+lName);
		}
		
	//**************************************************************
		if (Utility.emailValidate(email))  
		{ 
            System.out.println("Email Id :" +email);
		}
        else
        {
            System.out.println("Invalid Email Address");  
        }	
		
	//**************************************************************
		if (Utility.contactValidate(contact))  
		{
//            System.out.println("Valid Number");  
			System.out.println("Contact is :"+contact);
		}
        else
        {
            System.out.println("Invalid Number");  
        }	
		
	//**************************************************************	
		if(company==null)
		{
			System.out.println(" ");
		}
		else
			System.out.println("Company Name :"+company);
		
	//**************************************************************
		if(Utility.userIdValidate(userId))
		{
//			System.out.println("Valid User Id");  
			System.out.println("User Id is :"+userId);
		}
        else
        {
            System.out.println("Invalid User Id");  
        }	
	
		
	//**************************************************************	
		if(Utility.passwordValidate(password))
		{
//			System.out.println("Valid Password");  
			System.out.println("Password is :"+password);
		}
        else
        {
            System.out.println("Invalid Password");  
        }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
