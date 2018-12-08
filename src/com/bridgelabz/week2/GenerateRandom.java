package com.bridgelabz.week2;

import java.util.Random;

public class GenerateRandom {
	
	static int[] uniqueNumber(int from, int to)
	{
		int n = to - from + 1;
		int a[] =new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = i;
		}
		int result[] =  new int[n];
		int x = n;
		Random rd = new Random();
		for(int i=0;i<n;i++)
		{
			int k = rd.nextInt(x);
			result[i] = a[k];
			a[k] = a[x-1];
			x--;
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result = uniqueNumber(4,25);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

}
