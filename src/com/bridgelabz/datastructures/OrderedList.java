package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OrderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/bridgeit/Desktop/demo.txt");	// to open the file	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));		
		String line = " ";
		Scanner sc = new Scanner(System.in);
		    
		MyLinkedList<Integer> listInt = new MyLinkedList<Integer>();		//Linked list created manually
		String read = " ";
		while((line = br.readLine())!= null)	//Read file till the End
		{
			read += line;						//Copy the file elements into a string
		}
		
		//System.out.println(read);
		
		int array[];		//Copy the elements from string to String array by splitting each element
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(read);
			listInt.addInt(array[i]);					//Add each element into the LinkedList
		}
		
		//Check if the list is empty
		 System.out.println("List empty? " + listInt.isEmpty());
		  
		 listInt.display();						//Print the elements of LinkedList
		 
		 System.out.println("The size of the linked list is: "+ listInt.size()); 
	}

}
