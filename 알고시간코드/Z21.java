import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Z21 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 7;
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] check = new boolean[n];
		int[][] arr = new int[n][n];

		for (int i = 0; i < 8; i++) {
			int v = sc.nextInt() - 1;
			int u = sc.nextInt() - 1;
			arr[v][u] = 1;
			arr[u][v] = 1;
		}

		int start = 1;
		q.add(start - 1);
		System.out.print(start+ " ");
		check[start - 1] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int i = 0; i < arr[cur].length; i++) {
				if (arr[cur][i] == 1 && !check[i]) {
					check[i] = true;
					q.add(i);
					System.out.print(i + 1 + " ");
				}
			}
		}
	}
}
