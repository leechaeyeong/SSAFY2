import java.util.Scanner;
import java.util.Stack;

public class DFS_반복문_연습문제1_임진섭 {
	static boolean[] visited = new boolean[8];
	static Stack<Integer> st = new Stack<Integer>();
	static int[][] arr = new int[8][8];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			arr[u][v] = 1;
			arr[v][u] = 1;
		}

		DFS(1);

	} // end of main

	public static void DFS(int v) {
		visited[v] = true;
		st.push(v);
		System.out.print(v + " ");
		while (!st.isEmpty()) {
			int flag = -1;
			for (int i = 1; i < arr[v].length; i++) {
				if (arr[v][i] == 1 && !visited[i]) {
					flag = i;
					visited[flag] = true;
					st.push(flag);
					v = flag;
					System.out.print(flag + " ");
					break;
				}
			} // end of for
			if (flag == -1)
				v = st.pop();
		}
	}
} // end of class
