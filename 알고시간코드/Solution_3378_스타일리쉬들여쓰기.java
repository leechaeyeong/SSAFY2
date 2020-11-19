package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3378_스타일리쉬들여쓰기 {
	
	static int p, q; 
	static char[][] prr; // 마스터 내용
	static char[][] qrr; // 사용자 내용 
	
	static int[] res; //  출력
	
	public static void main(String[] args) throws Exception{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(rd.readLine());
		StringTokenizer st =  null;
		
		for (int tc = 1	; tc <= T; tc++) {
			st = new StringTokenizer(rd.readLine(), " "); // 한줄 읽은 것을 공백으로 자름
			p = Integer.parseInt(st.nextToken()); // 첫번째 문자
			q = Integer.parseInt(st.nextToken()); // 두번째 문자
			
			prr = new char[p][]; // 라인마다 갯수가 다름
			qrr = new char[q][];
			
			res = new int[q]; // 사용자의 라인만큼
			
			// 사용된 흔적은 판단하는 수로 초기화
			for(int i=0; i<q;i++) {
				res[i] =-2;
			}
			
			for (int i = 0; i < p; i++) {
				prr[i] = rd.readLine().toCharArray();
			}
			for (int i = 0; i < q; i++) {
				qrr[i] = rd.readLine().toCharArray();
			}
			// 입력 완료
			
			
			for(int r=1;r<=20;r++) {
				for(int c =1;c<=20;c++) {
					for(int s =1;s<=20;s++) {
						if(isFind(r, c, s)) {
							solve(r,c,s); // 점의 갯수를 숫자로 저장
						}
					}
				}
			}

			System.out.print("#"+tc+" "); // 추가 출력
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
		int intent =0; // 들여쓰기
		for (int i = 0; i < p; i++) {
			cnt=0;
			for (char ch : prr[i]) { // 문자 하나하나
				if(ch=='.') {
					cnt++;
				}else {
					break;
				}
			}
			// 공백 판단
			intent = rcnt * r +ccnt *c + scnt *s; // 점의 개수
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
				res[i] = intent; // 처음 들어가는 값인지 아닌지 판단				
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
