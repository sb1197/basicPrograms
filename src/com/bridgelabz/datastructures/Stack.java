package com.bridgelabz.datastructures;

public class Stack {

	ParanthesesLinkedList list = new ParanthesesLinkedList();
	int size = -1;
	
	void push(char d)
	{
		list.addNode(d);
		size++;
	}
	
	void show()
	{
		list.display();
	}
	
	void pop(char d)
	{
		list.deleteNode(d);
		size--;
	}
	
	int length()
	{		
		return list.size();
	}
	
	boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	
}
