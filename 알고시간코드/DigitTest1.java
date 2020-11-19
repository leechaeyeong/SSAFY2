package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		int []num = new int[100];

		int cnt=0;
		int input;
		Scanner scan = new Scanner(System.in);
		
		while(true) //0까지 입력
		{
			input = scan.nextInt();
			
			if(input ==0)
				break;
			
			num[cnt]=input;
			cnt++; //배열 길이
		}

		//빈도

		int arr[]= new int[10]; 
		
		int j=0;
		
		while(true)
		{
			for(int i=0;i<cnt;i++)
				if((num[i]/10) == j)
					arr[j]++;
			j++;
			
			if(j==10)
				break;
		}
		
		for(int i=0;i<10;i++)
			if(arr[i]!=0) 
				System.out.println(i+" : "+arr[i]+"개");

	}//main

}
