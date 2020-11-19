package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/** BFS 공부 */
public class Solution_7793_오나의여신님 {
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static char[][] map;
	static int n,m;
	static class pair{
		int x;
		int y;
		int d;
		
		public pair(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}
	static Queue<pair> devil;
	static Queue<pair> human;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <=T; tc++) {
			n=sc.nextInt();
			m = sc.nextInt();
			
			map = new char [n][m];
			
			devil = new LinkedList<pair>();
			human = new LinkedList<pair>();
			
			String input = ""; // 입력
			for (int i = 0; i < n; i++) {
				input = sc.next();
				for (int j = 0; j < m; j++) {
					map[i][j] = input.charAt(j);
					
					if(map[i][j] == 'S') { // 수연 위치
						human.add(new pair(i,j,0));
						
					}else if(map[i][j] =='*') { // 악마 위치
						devil.add(new pair(i,j,0));
					}
				}
			}
			// 입력
			
			// 출력 및 연산
			System.out.print("#"+tc+" ");
			while(true) {
				if(human.size()==0) {
					System.out.println("GAME OVER");
					break;
				}
				devilgo(); 
				int result = humango();
				if(result != -1) {
					System.out.println(result);
					break;
				}
			}

			// 출력
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < m; j++) 
//					System.out.print(map[i][j]+ " ");
//				System.out.println();
//			}
//			System.out.println();
		}//end of testcase
		
	}//end of main
	private static void devilgo() {
		// 사방탐색 -> .이면 전진, S만나면 끝
		// visit 배열 필요없이 오염시키기!
		
		int size = devil.size();
		while(size-- >0) {
			pair start = devil.poll();
			
			for (int i = 0; i < dx.length; i++) {
				int xx = start.x + dx[i];
				int yy = start.y + dy[i];
				
				if(xx<0 || xx>=n || yy<0 || yy>=m)
					continue;
				
				if(map[xx][yy]=='.' || map[xx][yy]=='S') {
					map[xx][yy] = '*';
					devil.offer(new pair(xx,yy,start.d+1));
				}
			}
		}

	}//end of devilgo
	private static int humango() {
		// 사방탐색 -> D 만나면 d 반환
		int size = human.size();
		while(size-- >0) {
			pair start = human.poll();
			
			for (int i = 0; i < dx.length; i++) {
				int xx = start.x + dx[i];
				int yy = start.y + dy[i];
				
				if(xx<0 || xx>=n || yy<0 || yy>=m)
					continue;
				
				if(map[xx][yy]=='.' ) {
					map[xx][yy] = 'S';
					human.offer(new pair(xx,yy,start.d+1));
				}
				
				if(map[xx][yy]=='D') {
					return start.d+1;
				}
			}
		}
		
		return -1;
		
	}//end of humango
}//end of class
