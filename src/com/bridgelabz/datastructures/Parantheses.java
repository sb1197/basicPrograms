package com.bridgelabz.datastructures;

public class Parantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Arithmetic expression : \n");
        String expression = "[{()}]";
        System.out.println("Expression is :"+expression);
       
        char abcd[] = expression.toCharArray();
        System.out.println("Character array is :");
        for(int i=0 ; i<expression.length();i++)
        {
        	System.out.println(abcd[i]);
        }
          
       
        Stack mystack = new Stack();
  
        for(int i=0 ; i<abcd.length;i++)
        {
            char ch = abcd[i];
            //System.out.println("char is:"+ch);
           
	            if(ch == '(' || ch=='{' || ch=='[')
	            {
	                mystack.push(ch);
	               
	            }
	        
	            else 
	            {
	            	if(ch == ')' )
	            	{
		            	 mystack.pop('(');
		            	
	            	}
	            	else if(ch == '}' )
	            	{
		            	mystack.pop('{');
		            	
	            	}
		            else if(ch == ']' )
		            {
			            mystack.pop('[');
			            
		            }
	              
	            }
            
        }
        
       
        if(mystack.isEmpty())
        {
            System.out.println("Expression is balanced ");
        }
        else
        {
            System.out.println("Expression is Not balanced ");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
