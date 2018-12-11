package com.bridgelabz.datastructures;
import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.io.InputStreamReader;
import java.util.Scanner;

import utility.Utility;

public class OrderedList {

	private static Scanner scan;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructures/numbers.txt");	// to open the file	
		OrderedLinkedList<Integer> listInt = new OrderedLinkedList<Integer>();		//Linked list created manually
		
		 scan = new Scanner(file);
	        int counter =0; 	//keep track of how many integers in the file
	        while(scan.hasNextInt()) 
	        {
	            counter++;
	            scan.nextInt();
	        }
	        scan = new Scanner(file); 
	        int a[] = new int[counter];
	        System.out.println("File elements are:");
	        for(int i=0;i<counter;i++)
	        {
	            a[i]=scan.nextInt(); 	//fill the array with the integers
	            System.out.print(a[i]+" ");
	        }
		System.out.println("\n \nSorted file elements into array:");
		Utility.bubbleIntSort(a, counter);
	        for(int i=0;i<counter;i++)
	        {
	            System.out.print(a[i]+" ");
	            listInt.addInt(a[i]);	//fill the array with the integers
	        }
	
	        boolean isEmpty = listInt.isEmpty();
	        System.out.println("\nIs Linked list Empty?? :"+isEmpty);
	        
	        listInt.display();		//To display elements of linked list
		
	       int size = listInt.getSize();
	    System.out.println("Size of Linked List is :"+size);
	    
		System.out.println("\nEnter an element to search :");
		int search = Utility.inputNumber();
		
		int elementFound = listInt.search(listInt.head,search);
		System.out.println("Element "+search+" found at location :"+elementFound);
		
		System.out.println("Enter a positon of a number to delete from input file :");
		int position = Utility.inputNumber();
		listInt.Delete(listInt.head,position);
		listInt.display();
		
		System.out.println("Deleting last element from Linked List...");
		listInt.pop();
			
		System.out.println("Updated List after delete..");
		listInt.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
