package com.bridgelabz.datastructures;

public class OrderedLinkedList<T>
{
		 Node1<T> head;
	    Node1<T> ptr ;
	    int size ;
	 
	    /*  Constructor  */
	    public OrderedLinkedList()
	    {
	        head = null;
	        ptr = null;
	        size = 0;
	    }
	    
	    /*  Function to check if list is empty  */
	    public boolean isEmpty()
	    {
	        return head == null;
	    }
	    
	    /*  Function to get size of list  */
	    public int getSize()
	    {
	        return size;
	    }    
	    
	    /*  Function to insert an element at end  */
	    public void addInt(T val)
	    {
	    	int data;
	    	Node1<T> next = null; 
	        Node1<T> n = new Node1<T>(val,next);
	        T number = val;
	        size++ ;    
	        if(head ==null)
			{
				head = n;
				ptr = n;
			}
			else
			{
				ptr.next = n;
				ptr = n;
			}
	    }

	    /*  Function to display elements  */
	    public void display()
	    {
	        System.out.print("\n\nSingly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }    
	        if (head == null) 
	        {
	            System.out.println(head.data);
	            return;
	        }
	        Node1 ptr = head;
	        System.out.print(head.data+ " ");
	        ptr = head.next;
	        while (ptr.next != null)
	        {
	            System.out.print(ptr.data+ " ");
	            ptr = ptr.next;
	        }
	        System.out.print(ptr.data+ "\n");
	    }
	
	    /*  Function to search given element  */
		public int search(Node1<T> head, int x) 
	    { 
			int position = 0;
	        Node1<T> current = head;    //Initialize current 
	        while (current != null) 
	        { 
	        	position++;
	            if (current.data.equals(x)) 
	                return position;    //data found 
	            current = current.next; 
	        } 
	        return position;    //data not found 
	    } 
	
		  /*  Function to delete an element from given position */
		public Object Delete(Node1<T> head, int position) 
		{
			
		    if (head == null)
		    {
		        return null;
		    } 
		    else if (position == 0) 
		    {
		        return head.next;
		    } 
		    else 
		    {
		        Node1<T> n = head;
		        for (int i = 1; i < position - 1; i++)
		        {
		            n = n.next;
		        }
		        n.next = n.next.next;
		        return head;
		    }
		}
	
		/*  Function to delete last element from list */
		public void pop()
		{
			 Node1<T> start = head;
		        Node1<T> prev = null;

		        if(start == null || start.next == null)
		        {
		            head = null;
		            return;
		        }
		        while (start.next != null)
		        {
		            prev = start;
		            start = start.next;
		        }
		        prev.next = null;
		}

	
	
	
}