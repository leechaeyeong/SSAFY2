package SWEA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/** BFS ���� */
public class Solution_7793_�����ǿ��Ŵ� {
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
			
			String input = ""; // �Է�
			for (int i = 0; i < n; i++) {
				input = sc.next();
				for (int j = 0; j < m; j++) {
					map[i][j] = input.charAt(j);
					
					if(map[i][j] == 'S') { // ���� ��ġ
						human.add(new pair(i,j,0));
						
					}else if(map[i][j] =='*') { // �Ǹ� ��ġ
						devil.add(new pair(i,j,0));
					}
				}
			}
			// �Է�
			
			// ��� �� ����
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

			// ���
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < m; j++) 
//					System.out.print(map[i][j]+ " ");
//				System.out.println();
//			}
//			System.out.println();
		}//end of testcase
		
	}//end of main
	private static void devilgo() {
		// ���Ž�� -> .�̸� ����, S������ ��
		// visit �迭 �ʿ���� ������Ű��!
		
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
		// ���Ž�� -> D ������ d ��ȯ
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
