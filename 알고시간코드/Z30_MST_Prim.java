import java.util.Scanner;

/**
 * MST 최소 신장 트리 : 모든 정점의 개수 V개라면 간선을 V-1를 선택한 사이클이 없는 트리 Prim, KRUSKAL 임의의 정점을
 * 하나 선택해서 시작, 결과는 동일하게 나옴 선택한 정점들에서 인접한, 선택하지 않은 정점중 가중치가 최소인 정점을 선택해 나간다 정점의
 * 개수 V, 간선의 개수 E 7 11 5 3 18 1 2 21 2 6 25 0 1 32 3 4 34 5 4 40 2 4 46 0 6 51 4
 * 6 51 0 5 60
 */

public class Z30_MST_Prim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt(); // 정점의 개수
		int E = sc.nextInt(); // 간선의 개수

		int[][] G = new int[V][V]; // 인접행렬, 초기값 0
		for (int i = 0; i < E; i++) {
			int parent = sc.nextInt();
			int index = sc.nextInt();
			int value = sc.nextInt();
//			G[parent][index] = value;
//			G[index][parent] = value;
			G[parent][index] = G[index][parent] = value;
		}

		int[] p = new int[G.length]; // 부모 index를 저장할 배열, st, 파이
		int[] val = new int[G.length]; // 최소 가중치를 저장할 배열, val, key

		int index = 0; // 시작할 정점 지정(어떤 정점이 와도 결과는 동일)
		for (int i = 0; i < G[index].length; i++) {
			if (G[index][i] > 0) { // 인접함
				p[i] = index;
				val[i] = G[index][i];
			} else { // 인접하지 않음
				p[i] = -1; // 부모없음 null
				val[i] = Integer.MAX_VALUE; // 무한대 표시
			}
		}
		p[index] = index; // 시작정점의 부모는 자기 자신 (root를 의미)
		val[index] = 0; // 자기자신으로 가는 가중치는 0
		boolean[] selected = new boolean[V]; // 선택한 정점 체크할 배열
		selected[index] = true; // 시작 정점 선택 표시

		for (int i = 1; i < V; i++) { // 정점의개수 V, MST 간선의 개수는 V-1개
			// 한 사이클마다 1개의 정점을 선택한다.
			// 선택하지 않은 정점 중에서 가중치가 최소인 정점을 찾는다.
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int j = 0; j < val.length; j++) {
				if (!selected[j] && min > val[j]) {
					min = val[j];
					minIndex = j;
				}
			}
			index = minIndex; // 최소 가중치 정점을 선택
			selected[index] = true;
			// 선택한 정점을 출력(정점1-정점2-가중치)
			System.out.println(p[index] + "-" + index + " " + val[index]);

			// 새로 선택한 정점을 통해서 개척된 새로운 경로를 업데이트(부모, 가중치)
			for (int j = 0; j < G[index].length; j++) {
				// 선택하지 않은 정점 중, 인저했고, 가중치가 더 작으면 없데이트
				if (!selected[j] && G[index][j] > 0 && val[j] > G[index][j]) {
					p[j] = index; // 부모 업데이트
					val[j] = G[index][j]; // 가중치 업데이트
				}
			}
		}
		// MST 합을 출력
		int MST = 0;
		for (int i = 0; i < val.length; i++) {
			MST += val[i];
		}
		System.out.print("Prim으로 구현한 MST의 전체 가중치 합 : " + MST);
		

	} // end of main
} // end of class

class Dot {
	int s;
	int d;

	Dot(int s, int d) {
		this.s = s;
		this.d = d;
	}
}