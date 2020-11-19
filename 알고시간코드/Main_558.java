package jungol;

import java.util.Scanner;

public class Main_558 {
	
	public static void main(String[] args)
	{
		int [] num= new int[100]; //0으로 초기화
		int input;
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		
		while(input!=0)
		{
			num[i] = input;
			i++; 
			input = scan.nextInt();
		}
		
		for(int j=i-1; j>=0;j--)
			System.out.print(num[j]+" ");
			
	}

}
