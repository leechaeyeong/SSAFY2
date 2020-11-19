package com.java.first;

import java.util.Scanner;

public class CircleArea {

	//1
	public static void main(String[] args) {
		
		int r=0;
		Scanner scan = new Scanner(System.in);
		
		r= scan.nextInt();
		
		System.out.println("반지름이 "+r+"Cm 인 원의 넓이는 "
				+(double)(r*r*3.14)+"Cm2 입니다");

	}

}
