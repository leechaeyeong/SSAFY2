package SWEA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Solution_5653_�ٱ⼼����� {
	static int N, M, K; // �迭�� �⺻������, ������ �����
	static int res;
	static int[][]  map;
	
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
//	����Ʈ�� ����Ʈ ���
	static List<ArrayList<Data>> list = new ArrayList<>() ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
//		
		
		for(int t= 1; t <= TC ; t++) {
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
//			������ ������� ���� ������ �Ѵ�. �̰��� �����ϱⰡ �ʿ��ϴ�
//			�׷���  ����º��� ������ ��Ƴ��Ҵٰ�, ������� �������� ���� ��Ʈ����(BFS) ���� ������?
//			����º� ������ ��Ƴ��� ����Ʈ �����
//			������� �ְ�����ŭ�� ����Ʈ�� �ʿ���
			list.clear();
			for(int i = 0; i < 10; i++) {
				list.add(new ArrayList<Data>());
			}
			
//			������ ���� �������� ������ Ȯ��
			map = new int[700][700]; //�ִ� ������ ���
			for(int i = 350; i < N + 350; i++) {
				for(int j = 350; j < M + 350; j++) {
					map[i][j] = sc.nextInt(); // map�� ������ ����
					if(map[i][j] != 0) { //�о� ���̸鼭 ���̷����� ������ ����Ʈ�� �����ϱ�
//						�迭 ÷�� ����
						list.get(map[i][j]-1).add(new Data(j,i,map[i][j],map[i][j],K,false));
					}
				}
			}
//			ó��
//			for(int i = 350; i < N + 350; i++) {
//				for(int j = 350; j < M + 350; j++) {
//					System.out.print(map[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			bfs();
//			System.out.println("================================");
//			for(int i = 350-K; i < N + 350 + K; i++) {
//				for(int j = 350-K; j < M + 350 + K; j++) {
//					System.out.print(map[i][j] + "\t");
//				}
//				System.out.println();
//			}
			res = 0;
//			������ ����
			for(int i = 0; i < 700; i++ ) {
				for(int j = 0 ; j < 700; j++) {
//					������ �������� �ʰų�, ������ �׾� �ִ� �ڸ��� ���� ����ϱ�
					if(map[i][j] != 0 && map[i][j]!= -1) {
						res++;
					}
				}
			}
			System.out.println("#" + t + " " + res);
		}
		
	}
	
	private static void bfs() {
//		ť�� ������� ������ ���� �ֱ�
		Queue<Data>  q = new LinkedList<Data>();
//		Data�� ������ �ִ� ����Ʈ���� ������� �����ͺ��� ��Ʈ���� ���� ť�� ����
		for(int i = 9; i >= 0; i--) {
			if(list.get(i).size() != 0) { //������� �����ϴ°� �鸸
				for(Data d : list.get(i)) {
					q.offer(d);
				}
			}
		}
//		���� ��Ʈ����
//		System.out.println(q.size());
		Data d;
		while(!q.isEmpty()) {
			d = q.poll();
//			���� ������ -1 ���� �����ϰ� �� ������ �����ϱ�
			if(d.life == 0 && d.flag) {
				map[d.y][d.x] = -1;
				continue;
			}
			
			if(d.time == 0) {// ���ð��� �� ������ ����
				continue;
			}
			if(d.life != 0 ) { // �������� ��� ������ �������� 1 �����ϰ� �ٽ� ť�� ���� ����� ���� ����
				q.offer(new Data(d.x, d.y, d.X, d.life -1, d.time-1, d.flag));
				continue;
			}
//			�������� 0�� �Ǹ鼭 ��Ȱ��ȭ�� ���� Ȱ��ȭ�� �� ������ ť���� ������ �Ǿ�� ��
			q.offer(new Data(d.x, d.y, d.X, d.X, d.time, true));
//			���� ������ ���� �о��� 4�������� �ؾ� ��
			for(int i = 0 ; i< 4 ; i++) {
				int nx = d.x + dx[i];
				int ny = d.y + dy[i];
//				���� üũ
				if(nx < 0 || nx >= 700 || ny < 0 || ny >= 700) {
					continue;
				}
//				�ٸ� ������ �������� ������
				if(map[ny][nx] == 0) {
					map[ny][nx] = d.X;  // ���� ���� ������  ����� �Է�
					q.offer(new Data(nx, ny, d.X, d.X, d.time-1, false));
				}
			}
		}
		
	}

	static class Data { // �������� ���� Ŭ����
		int x;
		int y;
        int X;//X�ٱ⼼���� �����
        
        int life; //Ȱ��ȭ �ð� �� ����ִ� �ð����� ������ ���� ����
        int time; //���ð� (�ð��� �����鰨����)
        boolean flag; // ȭ��ȭ ����(��Ȱ��ȭ : false, Ȱ��ȭ : true;
		public Data(int x, int y, int X, int life, int time, boolean flag) {
			super();
			this.x = x;
			this.y = y;
			this.X = X;
			this.life = life;
			this.time = time;
			this.flag = flag;
		}
        
        
	}
}//end of class
