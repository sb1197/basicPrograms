 package com.bridgelabz.datastructures;
import java.util.Scanner;

import utility.Utility;

import java.io.*;

import java.io.InputStreamReader;

public class UnorderedList 
{
	private static BufferedReader br;

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File file=new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructures/sample.txt");	// to open the file	
			
		br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));		
		String line = " ";
		Scanner sc = new Scanner(System.in);
		    
		MyLinkedList<String> list = new MyLinkedList<String>();		//Linked list created manually
		String read = " ";
		while((line = br.readLine())!= null)	//Read file till the End
		{
			read += line;						//Copy the file elements into a string
		}
		
		//System.out.println(read);
		
		String array[] = read.split(" ");		//Copy the elements from string to String array by splitting each element
		for(int i=0;i<array.length;i++)
		{
			list.add(array[i]);					//Add each element into the LinkedList
		}
		
		//Check if the list is empty
		 System.out.println("List empty? " + list.isEmpty());
		  
		 list.display();						//Print the elements of LinkedList
		 
		// System.out.println("The size of the linked list is: "+ list.size()); 
		 
		// System.out.println("The Natasha is at index:"+ list.indexOf("Natasha"));
		// String toFile[] = {};
		 System.out.println("Enter a word to search from input file :");
		    String search = Utility.inputString();
		    System.out.println("Input string to be search :"+search);
		    if(list.search(list.head,search))
		    {
		    	int index = list.indexOf(search);
		    	list.Delete(list.head,index);
		    	list.display();
		    	//System.out.println("Element found..");
		    }
		    else
		    {	
				//System.out.println("Element not found..");
				list.add(search);
				//list.display();
				
				
				String temporary="";
				System.out.println("Array write to file:");
				
				String[] strArr = new String[list.size()];
		       
				//write a file to specfied path and store the number in the list
				Utility.writeAllToFile("/home/bridgeit/Documents/WriteTo/unordered.txt", temporary);
//				String readedFile2=Utility.readAllFromFile("/home/adminstrato/Desktop/demohashing");
//				System.out.println(readedFile2);
				
				
				
				
		    }
			
		    
			
//		    System.out.println("Enter a positon of a number to delete from input file :");
//		   int position = Utility.inputNumber();
//		    	list.Delete(list.head,position);
//		    list.display();
//		    
//		  System.out.println("Enter the loaction where you want to add the node:");
//		  int location = Utility.inputNumber();
//		  System.out.println("Enter the data to be inserted at above position :");
//		  String newStr = sc.nextLine();
//		  list.insert(newStr, location);
//		   
//		  list.display();
//
//		  System.out.println("Deleting element from last of Linked List...");
//		  list.deleteLast();
//	
//		  System.out.println("Updated List after delete..");
//		  list.display();
	
	
	
	
	
	
	}

}
