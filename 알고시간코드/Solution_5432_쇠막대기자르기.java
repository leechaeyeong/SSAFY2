package SWEA;

import java.util.Scanner;
import java.util.Stack;

public class Solution_5432_�踷����ڸ��� {
	static char[] bar;
	static int[] check;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc<=T; tc++) {
			String input = sc.next();
			bar = input.toCharArray();
			check = new int[bar.length];
			// �Է�
			
			// check �迭�� ���° ��������, ������ = 0
			int cnt = 1; // ���° ��������
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
			
			
			
			
// 			���			
//			for (int i = 0; i < bar.length; i++) {
//				System.out.print(bar[i]+" ");
//			}
//			System.out.println();
			
		}//end of testcase
	}//end of main
}//end of class
