import java.util.Scanner;

public class DFS_재귀_연습문제1_임진섭 {
	static boolean[] visited = new boolean[8]; // 방문 설정
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[8][8];
	
		for (int i = 0; i < 8; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			arr[u][v] = 1;
			arr[v][u] = 1;
		} // end of input 
		
		DFS_Recursive(arr, 1);
		
		
	} // end of main

	public static void DFS_Recursive(int[][] G, int v) {
		visited[v] = true;
		System.out.print(v + " ");
		
		for (int i = 1; i < G[v].length; i++) {
			if(!visited[i] && G[v][i] == 1) {
				DFS_Recursive(G, i);
			}
		}
	}
} // end of class
