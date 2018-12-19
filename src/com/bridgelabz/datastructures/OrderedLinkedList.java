package com.bridgelabz.datastructures;

public class OrderedLinkedList<T>
{
		 Node<T> head;
	    Node<T> ptr ;
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
	    	Node<T> next = null; 
	        Node<T> n = new Node<T>(val,next);
	        T number = val;
	        size++ ;    
	        if(head == null)
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
	        Node ptr = head;
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
		public boolean search(Node<T> head, int x) 
	    { 
			
	        Node<T> current = head;    //Initialize current 
	        while (current != null) 
	        { 
	        	
	            if (current.data.equals(x)) 
	                return true;    //data found 
	            current = current.next; 
	        } 
	        return false;    //data not found 
	    } 
	
		  /*  Function to delete an element from given position */
		public Object Delete(Node<T> head, int position) 
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
		        Node<T> n = head;
		        for (int i = 0; i < position - 1; i++)
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
			 Node<T> start = head;
		        Node<T> prev = null;

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

	
		public int indexOf(T num)
		{
		     int size = 1;
		    Node<T> current = head.next;
		    while (current != null) {
		        if (current.data.equals(num)) {
		            return size;
		        }
		        size++;
		        current = current.next;
		    }
		        return size;
		    
		}
	
		public int size() 
		{
			 Node<T> n = head;
			 int count=0;
			 while(n!=null)
			 {
				 count++;
				 n = n.next;
			 }
			 return count;
		}
		
		
		public T get(int index)
		{
			if(index>=size())
			{
				throw new IndexOutOfBoundsException();
			}
			Node<T> temp=head;
			for(int i=0;i<index;i++)
			{
				temp=temp.next;
			}
			return temp.data;
		}
	
}