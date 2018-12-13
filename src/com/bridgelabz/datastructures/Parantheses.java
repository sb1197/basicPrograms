package com.bridgelabz.datastructures;

public class Parantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Arithmetic expression : ");
        String expression = "(())))";
        System.out.println(expression);
        MyLinkedList<String> list = new MyLinkedList<String>();
        char abcd[] = expression.toCharArray();
        Stack stack = new Stack(abcd.length);
        int m = 0,n = 0;
        //utility.inputString();
        for(int i=0 ; i<expression.length();i++)
        {
            char ch = expression.charAt(i);
        
            if(ch == '(')
            {
                m = stack.push(abcd);
            }
            if(ch == ')')
            {
                 n = stack.pop(abcd);
            }
        }
        if(stack.isEmpty() || m==n)
        {
            System.out.println("Expression is balanced ");
        }
        else
        {
            System.out.println("Not balanced ");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
