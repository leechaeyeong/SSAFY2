package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3378_��Ÿ�ϸ����鿩���� {
	
	static int p, q; 
	static char[][] prr; // ������ ����
	static char[][] qrr; // ����� ���� 
	
	static int[] res; //  ���
	
	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(rd.readLine());
		StringTokenizer st =  null;
		
		for (int tc = 1	; tc <= T; tc++) {
			st = new StringTokenizer(rd.readLine(), " "); // ���� ���� ���� �������� �ڸ�
			p = Integer.parseInt(st.nextToken()); // ù��° ����
			q = Integer.parseInt(st.nextToken()); // �ι�° ����
			
			prr = new char[p][]; // ���θ��� ������ �ٸ�
			qrr = new char[q][];
			
			res = new int[q]; // ������� ���θ�ŭ
			
			// ���� ������ �Ǵ��ϴ� ���� �ʱ�ȭ
			for(int i=0; i<q;i++) {
				res[i] =-2;
			}
			
			for (int i = 0; i < p; i++) {
				prr[i] = rd.readLine().toCharArray();
			}
			for (int i = 0; i < q; i++) {
				qrr[i] = rd.readLine().toCharArray();
			}
			// �Է� �Ϸ�
			
			
			for(int r=1;r<=20;r++) {
				for(int c =1;c<=20;c++) {
					for(int s =1;s<=20;s++) {
						if(isFind(r, c, s)) {
							solve(r,c,s); // ���� ������ ���ڷ� ����
						}
					}
				}
			}

			System.out.print("#"+tc+" "); // �߰� ���
			for (int i = 0; i < q; i++) {
				System.out.print(res[i]+" ");
			}
			System.out.println();
			
		}//end of testcase
		
	}//end of main

	private static boolean isFind(int r, int c, int s) {
		int rcnt=0, ccnt=0, scnt =0;
		boolean flag = true;
		int cnt=0;
		int intent =0; // �鿩����
		for (int i = 0; i < p; i++) {
			cnt=0;
			for (char ch : prr[i]) { // ���� �ϳ��ϳ�
				if(ch=='.') {
					cnt++;
				}else {
					break;
				}
			}
			// ���� �Ǵ�
			intent = rcnt * r +ccnt *c + scnt *s; // ���� ����
			if(intent != cnt) {
				flag = false;
				break;
			}
			for(char ch:prr[i]) {
				switch(ch) {
				case '(':
					rcnt++;
					break;
				case ')':
					rcnt--;
					break;
				case '{':
					ccnt++;
					break;
				case '}':
					ccnt--;
					break;
				case '[':
					scnt++;
					break;
				case ']':
					scnt--;
					break;
				}
			}
		}
		return flag;
	}//end of isFind
	private static void solve(int r, int c, int s) {
		int rcnt=0, ccnt=0, scnt=0;
		int intent;
		
		for (int i = 0; i < q; i++) {
			intent = rcnt*r+ccnt*c+scnt*s;
			
			
			if(res[i] == -2) {
				res[i] = intent; // ó�� ���� ������ �ƴ��� �Ǵ�				
			}else if(res[i] != intent) {
				res[i] = -1;
			}
			

			
			for(char ch:qrr[i]) {
				switch(ch) {
				case '(':
					rcnt++;
					break;
				case ')':
					rcnt--;
					break;
				case '{':
					ccnt++;
					break;
				case '}':
					ccnt--;
					break;
				case '[':
					scnt++;
					break;
				case ']':
					scnt--;
					break;
				}
			}
		}
		
	}//end of solve

}//end of class
