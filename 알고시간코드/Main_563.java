package jungol;

import java.util.Scanner;

public class Main_563 {
	public static void main(String [] args)
	{
		int [] num= new int[10];
		int [] nnum= new int[10];
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<10;i++)
			num[i]=scan.nextInt();
		
		int max=1000;
		for(int i=0;i<10;i++)
		{
			
			for(int j=0;j<10;j++)
			{
				if(num[i]>num[j])
				{			
					max=num[i];
					num[i]=num[j];
					num[j]=max;
					
				}
				
			}

		}
		
		for(int i=0;i<10;i++)
			System.out.print(num[i]+" ");
	}
}
