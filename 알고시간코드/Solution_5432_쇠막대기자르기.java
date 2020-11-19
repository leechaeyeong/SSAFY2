package SWEA;

import java.util.Scanner;
import java.util.Stack;

public class Solution_5432_쇠막대기자르기 {
	static char[] bar;
	static int[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc<=T; tc++) {
			String input = sc.next();
			bar = input.toCharArray();
			check = new int[bar.length];
			// 입력
			
			// check 배열에 몇번째 막대인지, 레이저 = 0
			int cnt = 1; // 몇번째 막대인지
			Stack<Character> st = new Stack<>();
			for (int i = 0; i < bar.length; i++) {
				if(bar[i]=='(') {
					st.push(bar[i]);
					check[i] = cnt;
					cnt++;
				}
				else { 
					st.pop();
					if(bar[i-1]=='(') {
						check[i-1] = 0;
						check[i]=0;
					}else {
						
					}
					
				}
			}
			
			
			
			
// 			출력			
//			for (int i = 0; i < bar.length; i++) {
//				System.out.print(bar[i]+" ");
//			}
//			System.out.println();
			
		}//end of testcase
	}//end of main
}//end of class
