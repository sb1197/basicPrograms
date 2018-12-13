package com.calculaterandom;
import java.util.Random;

import utility.Utility;

public class NewRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();

		int n = 10;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int x = rd.nextInt(10);		
				arr[i] = x;
		}
		int result[] = Utility.bubbleIntSort(arr, arr.length);
		for(int i=0;i<10;i++)
		{
			System.out.print(result[i]+" ");
		}
		
		
	}

}
