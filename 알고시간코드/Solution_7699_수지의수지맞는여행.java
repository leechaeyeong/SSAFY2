package SWEA;

import java.util.Arrays;
import java.util.Scanner;
/** DFS공부 8월 25일 */
public class Solution_7699_수지의수지맞는여행 {
	
	static int r,c;
	static int [][] map;
	static boolean[] visit = new boolean[26]; // a = 0 z = 25
	static int result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			r=sc.nextInt();
			c=sc.nextInt();
			
			result =0;
			Arrays.fill(visit, false);
			
			map = new int[r][c];
			
			String input="";
			
			for (int i = 0; i < r; i++) {
				input = sc.next();
				for (int j = 0; j < c; j++) {
					map[i][j] = input.charAt(j)-'A';
				}
			}
			// 입력
			
			dfs(0,0,1);
			System.out.println("#"+tc+" "+result);
			
// 			출력			
//			for (int i = 0; i < r; i++) {
//				for (int j = 0; j < c; j++) {
//					System.out.print(map[i][j]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();

		}//end of testcase
	}//end of main
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};

	private static void dfs(int x, int y, int cnt) {
		if(cnt==26) { // 
			result =26;
			return;
		}
		// 현위치 값


		visit[map[x][y]]=true;
		result = Math.max(result, cnt);
	
		
		for (int i = 0; i < dx.length; i++) {
			int xx = x+dx[i];
			int yy = y+dy[i];
			
			if(xx<0||xx>=r||yy<0||yy>=c)
				continue;
			
			if(visit[map[xx][yy]])
				continue;
			
			visit[map[xx][yy]] = true;
			dfs(xx,yy,cnt+1);
			visit[map[xx][yy]] = false; // 원복
			
		}
		
	}//end of dfs
}//end of class
