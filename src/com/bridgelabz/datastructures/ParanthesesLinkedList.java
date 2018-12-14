package com.bridgelabz.datastructures;

public class ParanthesesLinkedList
{
	static class Node 
	{

		char data;
		Node next;
		public Node(char data) 
		{		
			this.data = data;
		}
	}
	
	Node head;
	
	void addNode(char data)
	{
		Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
	}
	
	
	void display()
	{
		Node n = head;
		for(int i=0;i<size();i++)
		{
			System.out.println(n.data);
			n = n.next;
		}
	
	}
	
	void deleteNode(char data)
	{
		Node temp =  head;
		Node prev = null;
		if(temp!=null && temp.data==data)
		{
			temp=temp.next;
		}
		while(temp.data!=data)
		{
			prev=temp;
			temp=temp.next;
			
		}
		prev.next = temp.next;
	}
	
	public int size() 
	{
		 Node n = head;
		 int count=0;
		 while(n!=null)
		 {
			 count++;
			 n = n.next;
		 }
		 return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
