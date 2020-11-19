package jungol;

import java.util.Scanner;

public class Main_560 {

	public static void main(String[] args) {
		
		int min=1000;
		Scanner scan= new Scanner(System.in);
		
		int []num= new int[10];
		
		for(int i=0;i<10;i++)
			num[i]=scan.nextInt();
		
		for(int i=0;i<10;i++)
		{
			if(min>=num[i])
				min=num[i];
			
		}
		System.out.print(min);
		

	}

}
