package com.ssafy.java;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		int lot[]=new int [6];
		Random ran= new Random();

		int lotNum;
		int i=0;
	
		while(true)
		{
			lotNum = ran.nextInt(45)+1;
			
			for(int j=0;j<lot.length;j++)
			{
				if(lot[j]==lotNum)
					lotNum = ran.nextInt(45)+1;
			}
				
			
			lot[i]=lotNum;
			i++;
			
			if(i==6)
				break;
		}
		
		for(int j=0;j<6;j++)
			System.out.print(lot[j]+" ");
		
		

	}

}
