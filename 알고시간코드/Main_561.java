package jungol;

import java.util.Scanner;

public class Main_561 {

	public static void main(String[] args) {
		
		int [] num=new int[10];
		Scanner scan= new Scanner(System.in);
		int max=0, min=100;
		
		for(int i=0;i<10;i++)
		{
			num[i]=scan.nextInt();
			
			if(num[i]<100)
			{
				if(max<num[i])
					max=num[i];
			}
			else
			{
				if(min>num[i])
					min=num[i];
			}
		}

		System.out.println(min+" "+max);
	}

}
