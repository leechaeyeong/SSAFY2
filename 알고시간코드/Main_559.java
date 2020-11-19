package jungol;

import java.util.Scanner;

public class Main_559 {

	public static void main(String[] args) {
		
		double cl[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner scan = new Scanner(System.in);
		
		int f, s;
		f= scan.nextInt();
		s=scan.nextInt();
		
		double sum=cl[f-1]+cl[s-1];
		
		System.out.print(Math.round(sum*100)/100.0);

	}

}
