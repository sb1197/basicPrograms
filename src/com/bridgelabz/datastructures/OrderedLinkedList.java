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
	    /*  Function to insert an element at begining  */
//	    public void insertAthead(int val)
//	    {
//	        Node1 nptr = new Node1(val, null);    
//	        size++ ;    
//	        if(head == null) 
//	        {
//	            head = nptr;
//	            end = head;
//	        }
//	        else 
//	        {
//	            nptr.setLink(head);
//	            head = nptr;
//	        }
//	    }
	    /*  Function to insert an element at end  */
	    public <T> void addInt(T val)
	    {
	    	int data = (Integer) null;
	    	Node1<T> next = null; 
	        Node1<T> n = new Node1<T>(val,null);
	        T number = val;
	        size++ ;    
	        if(head == null) 
	        {
	            head.data = n;
	            n.next = n;
	        }
	        else 
	        {
	            ptr.next = n;
	            n.next = null;
	        }
	    }
//	    /*  Function to insert an element at position  */
//	    public void insertAtPos(int val , int pos)
//	    {
//	        Node1 nptr = new Node1(val, null);                
//	        Node1 ptr = head;
//	        pos = pos - 1 ;
//	        for (int i = 1; i < size; i++) 
//	        {
//	            if (i == pos) 
//	            {
//	                Node1 tmp = ptr.getLink() ;
//	                ptr.setLink(nptr);
//	                nptr.setLink(tmp);
//	                break;
//	            }
//	            ptr = ptr.getLink();
//	        }
//	        size++ ;
//	    }
//	    /*  Function to delete an element at position  */
//	    public void deleteAtPos(int pos)
//	    {        
//	        if (pos == 1) 
//	        {
//	            head = head.getLink();
//	            size--; 
//	            return ;
//	        }
//	        if (pos == size) 
//	        {
//	            Node1 s = head;
//	            Node1 t = head;
//	            while (s != end)
//	            {
//	                t = s;
//	                s = s.getLink();
//	            }
//	            end = t;
//	            end.setLink(null);
//	            size --;
//	            return;
//	        }
//	        Node1 ptr = head;
//	        pos = pos - 1 ;
//	        for (int i = 1; i < size - 1; i++) 
//	        {
//	            if (i == pos) 
//	            {
//	                Node1 tmp = ptr.getLink();
//	                tmp = tmp.getLink();
//	                ptr.setLink(tmp);
//	                break;
//	            }
//	            ptr = ptr.getLink();
//	        }
//	        size-- ;
//	    }    
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
	    
	    
		public int search(Node1<T> head,int number)
		{	
			Node1<T> ptr = head;
			int index = 0;
				if((ptr.data).equals(number))
				{
					index++;
					return index;	
				}
				else
				{
					index++;
					ptr.next = ptr.next.next;
				}
			
			return index;
			
		}

	
	
	
	
	
	
	
	
	
	
}