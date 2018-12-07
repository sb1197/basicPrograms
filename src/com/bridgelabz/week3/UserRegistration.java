package com.bridgelabz.week3;
import utility.Utility;
public class UserRegistration 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		boolean flag, flag1, flag2, flag3, flag4, flag5;
		String fName,lName,email,contact,company,userId,password;
		
		do 
		{
			//**********READ FIRST NAME OF USER***********//
			
			System.out.println("Enter your First name : ");
			 fName = Utility.inputStr(); 
			 flag = Utility.nameValidate(fName);
			
			//**********READ LAST NAME OF USER***********//
			
			System.out.println("Enter your Last name : ");
			 lName = Utility.inputStr();
			 flag1 = Utility.nameValidate(lName);
			
			//**********READ EMAIL ID OF USER***********//
			
			System.out.println("Enter your Email address :");
			 email = Utility.inputStr();
			 flag2 = Utility.emailValidate(email);
			
			//**********READ CONTACT OF USER***********//
		
			System.out.println("Enter your contact : ");
			 contact = Utility.inputStr();
			 flag3 = Utility.contactValidate(contact);
		 		
			//**********READ COMPANY NAME OF USER***********//
			
			System.out.println("Enter Company name :");
			 company = Utility.inputStr();
			
		
			//**********READ USER ID OF USER***********//
			
			System.out.println("Enter UserId :");
			userId = Utility.inputStr();
			 flag4 = Utility.userIdValidate(userId);
		
			//**********READ PASSWORD OF USER***********//
			
			System.out.println("Enter Password :");
			 password = Utility.inputStr();
			 flag5 = Utility.passwordValidate(password);
					
					
			if(!flag || !flag1 || !flag2 || !flag3 || !flag4 || !flag5)	
			{
				System.out.println("Please enter valid details...");
			}
					
		}while(!flag || !flag1 || !flag2 || !flag3 || !flag4 || !flag5);
		
		
	//**************************************************************
		if(flag)
		{
			System.out.println("First Name :"+fName);
		}
		else
        {
            System.out.println("Invalid First Name");  
        }
		
	//**************************************************************
		if(flag1)
		{
			System.out.println("Last Name :"+lName);
		}
		else
        {
            System.out.println("Invalid Last Name");  
        }
		
	//**************************************************************
		if (flag2)  
		{ 
            System.out.println("Email Id :" +email);
		}
        else
        {
            System.out.println("Invalid Email Address");  
        }	
		
	//**************************************************************
		if (flag3)  
		{ 
			System.out.println("Contact is :"+contact);
		}
        else
        {
            System.out.println("Invalid Contact Number");  
        }	
		
	//**************************************************************	
		if(company==null)
		{
			System.out.println(" ");
		}
		else
			System.out.println("Company Name :"+company);
		
	//**************************************************************
		if(flag4)
		{
			System.out.println("User Id is :"+userId);
		}
        else
        {
            System.out.println("Invalid User Id");  
        }	
	
		
	//**************************************************************	
		if(flag5)
		{ 
			System.out.println("Password is :"+password);
		}
        else
        {
            System.out.println("Invalid Password");  
        }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
