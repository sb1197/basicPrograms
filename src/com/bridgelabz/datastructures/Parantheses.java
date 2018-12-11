package com.bridgelabz.datastructures;

public class Parantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Arithmetic expression : ");
        String expression = "))))";
        System.out.println(expression);
        Stack stack = new Stack(expression);    
        //utility.inputString();
        for(int i=0 ; i<expression.length();i++)
        {
            char ch = expression.charAt(i);
        
            if(ch == '(')
            {
                stack.push(expression);
            }
            if(ch == ')')
            {
                stack.pop();
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Expression is balanced ");
        }
        else
            System.out.println("Not balanced ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
