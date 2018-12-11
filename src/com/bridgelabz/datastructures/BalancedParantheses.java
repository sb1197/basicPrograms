package com.bridgelabz.datastructures;

// Java program for checking balanced Parenthesis 
public class BalancedParantheses 
{ 

	static class Stack
	{
		int stackTop = -1;
		public void push(String item)
		{
			
		}
		public void pop()
		{
			
		}
		public String peek()
		{
			String str="";
			return str;
		}
		public boolean isEmpty()
		{
			if(stackTop == -1)
				return true;
			else 
				return false;
		}
	}


private static boolean checkBalancedParentheses(String input)
{
		Stack stack = new Stack();
		boolean isBalanaced = false;
	
		for(int i=0; i < input.length(); i++)
		{
			String str = ""+input.charAt(i);		//store characters as String
	
			//if opening bracket then push into stack
			if(str.equals("(") || str.equals("[") || str.equals("{"))
			{
				stack.push(str);
			}
	
			//if closing bracket, pop bracket and compare if its a pair
			if(str.equals(")") || str.equals("]") || str.equals("}")){
				//if stack becomes empty in between then also its not balanced
				if(stack.isEmpty())
				{
					return false;
				}
				String opening = stack.peek();
				if(str.equals(")") && opening.equals("(")){
					stack.pop();
				}
				if(str.equals("]") && opening.equals("[")){
					stack.pop();
				}
				if(str.equals("}") && opening.equals("{")){
					stack.pop();
				}
			}			
		}
		//if stack is empty at end, then its balanced
		if(input.length() > 0 && stack.isEmpty()){
			isBalanaced = true;
		}
	
		return isBalanaced;
}

public static void main(String[] args) 
{
		String[] inputs = {"{[()]}","{[(])}","{{[[(())]]}}"};		
	
		for(String input : inputs){
			boolean flag = checkBalancedParentheses(input);
			if(flag)
			{	
				System.out.println("YES BALANCED.");
			}
			else
			{
				System.out.println("NOT BALANCED.");
			}		
		}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}