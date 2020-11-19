package ssafy_study;

import java.util.Scanner;

public class 숫자의개수 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		int res= a*b*c; //17037300
		//0~ 9까지 몇개가 사용되었는지 출력하기
		
		int[] num= new int[10];
		int x=10;
		
		/*
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; ; j++) {
				
				if(i == res%x) //1
				{
					num[i]++;
				}
				i ==res/10
				
			}
			
		}
		*/
		System.out.println(0/10 +" ");
	}
}
