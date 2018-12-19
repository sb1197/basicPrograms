package com.bridgelabz.datastructures;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String expression = "()())(()";
		Stack sc = new Stack();
		//char ar[] = expression.toCharArray();
//		for(int i=0;i<ar.length;i++)
//		{
			sc.push('a');
			sc.push('b');
			sc.push('c');
			sc.push('d');
			System.out.println("Stack elements to list :");
			sc.show();
			System.out.println("Size is :"+sc.length());
			sc.push('e');
			sc.pop('b');
			sc.show();
		
//		}
		
	}

}
