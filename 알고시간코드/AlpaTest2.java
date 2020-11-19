package com.ssafy.java;

public class AlpaTest2 {

public static void main(String[] args) {
		
		//2
		char a = 'A';
		for(int i=0;i<5;i++)
		{
			for(int j=4;i<j;j--)
				System.out.print("\t");
			for(int j=0;j<=i;j++)
			{
				System.out.print(a+"\t");
				a++;
			}
			System.out.println();
	
		}

	}

}
