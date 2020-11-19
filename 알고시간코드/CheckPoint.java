package com.java.first;

import java.util.Scanner;

public class CheckPoint {
 //3
	public static void main(String[] args) {
		int num = 0;
		int hi =0;
		int wei =0;
		
		Scanner scan = new Scanner(System.in);
		hi=scan.nextInt();
		wei=scan.nextInt();
		
		num = wei+100-hi;
		System.out.println("비만수치는 "+num+"입니다");
		if(num>0)
			System.out.println("당신은 비만이군요");
		
		else
			System.out.println("당신은 비만이 아니군요");

	}

}
