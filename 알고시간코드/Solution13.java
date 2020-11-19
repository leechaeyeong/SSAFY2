package com.ssafy.algo;

import java.util.Scanner;

public class Solution13 {
	public static void main(String[] args) {
		//b g
		//b - g가 인접 > 2층
		//가로 세로 b의 위치만큼 세울 수 있다.
		//가장 높은 층?
		Scanner scan=new Scanner(System.in);
		
		int T=scan.nextInt();
		
		for (int t = 0; t < T; t++) {
			
			int n=scan.nextInt();
			n=n+2;
			
			char[][] a= new char[n][n];
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if(i==0 || j==0 || i==(n-1)||j==(n-1))
						a[i][j] = 'E';
					else
						a[i][j]=scan.next().charAt(0);
				}
			}
			
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		
			
			//공원 + 빌딩 층
		
			int cnt=0;
			
			for (int i = 1; i < a.length-1; i++) {
				for (int j = 1; j < a.length-1; j++) {

					if((a[i-1][j]=='B'||a[i-1][j]=='E')&& 
						(a[i+1][j]=='B'||a[i+1][j]=='E')&&
						(a[i][j-1]=='B'||a[i][j-1]=='E')&& 
						(a[i][j+1]=='B'||a[i][j+1]=='E')&&
						(a[i-1][j-1]=='B'||a[i-1][j-1]=='E')
						&&(a[i-1][j+1]=='B'||a[i-1][j+1]=='E')&&
						(a[i+1][j-1]=='B'||a[i+1][j-1]=='E')&&
						(a[i+1][j+1]=='B'||a[i+1][j+1]=='E'))
						
					{
						for (int x = 1; x < n-1; x++) {
							for (int y = 1; y < n-1; y++) {
								
								if(i==x && a[i][j] =='B')
									cnt++;
								else if(j==y && a[i][j] =='B')
									cnt++;
								
								
							}
						}
						break;
						
					}
					else if(a[i-1][j]=='E'&& a[i+1][j]=='B'&&
							a[i][j-1]=='E'&& a[i][j+1]=='B'&&
							 a[i-1][j-1]=='E'&&a[i-1][j+1]=='E'&&
							a[i+1][j-1]=='E'&&a[i+1][j+1]=='B')
						
					{
						for (int x = 1; x < n-1; x++) {
							for (int y = 1; y < n-1; y++) {
								
								if(i==x && a[i][j] =='B')
									cnt++;
								else if(j==y && a[i][j] =='B')
									cnt++;
								
							}
						}
						break;
					}
					else
					{
						if(cnt<2)
							cnt=2;
						
					}
						
					
				}
			}
		System.out.println(cnt);
			
			
		}
		
	}
}
