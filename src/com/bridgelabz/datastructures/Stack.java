package com.bridgelabz.datastructures;

class Stack<T>
{
	MyLinkedList<T> list = new MyLinkedList<T>();

	
	
	private Node<T> top;

	public Stack()
	{
		this.top = null;
	}

	// Utility function to add an element x in the stack
	public void push(int x) // insert at the beginning
	{
//		// Allocate the new Node<T> in the heap
//		Node<T> Node = new Node<T>(null, Node);
//
//		// check if stack (heap) is full. Then inserting an element would
//		// lead to stack overflow
//		if (Node == null)
//		{
//			System.out.print("\nStack Overflow");
//			return;
//		}
//
//		System.out.println("Inserting " + Node);
//
//		// set the data in allocated Node<T>
//		Node.data = x;
//
//		// Set the .next pointer of the new Node<T> to point to the current
//		// top Node<T> of the list
//		Node.next = top;
//
//		// update top pointer
//		top = Node;
		
	list.add();
		
		
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty()
	{
		return top == null;
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Utility function to pop top element from the stack
	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (top == null)
		{
			System.out.print("\nStack Underflow");
			return;
		}

		System.out.println("Removing " + peek());

		// update the top pointer to point to the next Node<T>
		top = (top).next;
	}
}








//public class Stack {
//	
//	  private int stack [];
//	    private int top; 
//
//	    public Stack(int SIZE) 
//	    {
//	        stack = new int [SIZE];
//	        top = -1;
//	    }
//
////	    public int push(char[] a) 
////	    {
////	    	for(int i=0;i<a.length;i++)
////	    	{
////		        stack[top]= i;
////		        top++;
////	    	}
////	    	return top;
////	    }
////
////	    public int pop(char[] a) 
////	    {
////	        top --;
////	        return top;
////	    }
////
////	    public int peek()
////	    {
////	        return stack[top];
////	    }
////
////	    public boolean isEmpty() 
////	    {
////	        if ( top == -1);
////	        {
////	            return true;
////	        }
////	    }
//	
//	
//	
//}
