package com.bridgelabz.datastructures;

//import java.io.BufferedReader;
import java.io.File;
//import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

import utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/bridgeit/eclipse-workspace/JavaPrograms/src/com/bridgelabz/datastructures/numbers.txt");	// to open the file	
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));		
//		String line = " ";
		OrderedLinkedList listInt = new OrderedLinkedList();		//Linked list created manually
//		
//		Scanner sc=new Scanner(file);
//		while(sc.hasNext())
//		{
//			listInt.addInt(Integer.parseInt(sc.next()));
//		}
//		
//		//Check if the list is empty
//		 System.out.println("List empty? " + listInt.isEmpty());
//		  
//		 listInt.display();						//Print the elements of LinkedList
//		

		 Scanner scan = new Scanner(file); //provide file name from outside
	        int counter =0; //keep track of how many integers in the file
	        while(scan.hasNextInt()) 
	        {
	            counter++;
	            scan.nextInt();
	        }
	        Scanner scan2 = new Scanner(file); 
	        int a[] = new int[counter];
	        System.out.println("File elements are:");
	        for(int i=0;i<counter;i++)
	        {
	            a[i]=scan2.nextInt(); //fill the array with the integers
	            System.out.print(a[i]+" ");
	        }
		System.out.println("\n \nSorted file elements into array:");
		Utility.bubbleIntSort(a, counter);
	        for(int i=0;i<counter;i++)
	        {
	            System.out.print(a[i]+" ");
	            listInt.addInt(a[i]);//fill the array with the integers
	        }
	
	        listInt.display();		//To display elements of linked list
		
		System.out.println("\nEnter an element to search :");
		int search = Utility.inputNumber();
		
		int elementFound = listInt.search(listInt.head,search);
		System.out.println("Element "+search+" found at location :"+elementFound);
		
		
	}

}
