package com.ssafy.java;

import java.util.Scanner;

public class ArrayTest {
	
	static int arr[]= {34,23,64,25,12,75,22,88,53,37};
	public static void print()
	{
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}
	public static void total() //sum
	{
		int sum=0;
		for(int i=0;i<10;i++)
			sum+=arr[i];
		System.out.print(sum);
	}
	public static void average() 
	{
		int sum=0;
		for(int i=0;i<10;i++)
			sum+=arr[i];
		System.out.print(sum/arr.length);
	}
	public static void minimum()
	{
		int min=1000;
		for(int i=0;i<10;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.print(min);
	}
	
	
	public static void main(String[] args) {
		
		
		print();
		System.out.println();
		System.out.print("배열을 합 : ");
		total();
		System.out.println();
		System.out.print("배열을 평균 : ");
		average();
		System.out.println();
		System.out.print("배열을 최소값 : ");
		minimum();

	}

}
