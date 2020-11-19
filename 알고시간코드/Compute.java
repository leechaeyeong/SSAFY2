package com.java.first;

import java.util.Scanner;

public class Compute {

	//2
	public static void main(String[] args) {
		int a=0, b=0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b= scan.nextInt();
		
		System.out.println("곱="+a*b);
		System.out.println("몫="+a/b);

	}

}
