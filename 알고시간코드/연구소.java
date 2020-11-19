package ssafy_study;

import java.util.Scanner;

public class 연구소 {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		//입력
		int n =scan.nextInt();
		int m =scan.nextInt();
		
		n=n+2;
		m=m+2; //1 벽치기
		
		int[][] lap = new int[n][m];
		for (int i = 0; i < lap.length; i++) {
			for (int j = 0; j < lap[i].length; j++) {
				if(i==0 || j==0 || i==lap.length-1 || j==lap[i].length-1)
					lap[i][j] = 1;
				else {
				lap[i][j] = scan.nextInt();
				}
			}
		}

		//출력
		
		
	}
}
