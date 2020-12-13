import java.util.LinkedList;
import java.util.Queue;

public class Z21_BFS_연습문제3 {
	public static void main(String[] args) {
		// 연결리스트 방식으로 저장
		int[][] G = { {}, // 정점 0에 인접한 정점 정보
				{ 2, 3 }, // 정점 1에 인접한 정점 정보
				{ 1, 4, 5 }, // 정점 2에 인접한 정점 정보
				{ 1, 7 }, // 정점 3에 인접한 정점 정보
				{ 2, 6 }, // 정점 4에 인접한 정점 정보
				{ 2, 6 }, // 정점 5에 인접한 정점 정보
				{ 4, 5, 7 }, // 정점 6에 인접한 정점 정보
				{ 3, 6 } // 정점 7에 인접한 정점 정보
		};

// 선형큐를 직접 구현해서 사용
	int[] q = new int[100];
	int front = -1;
	int rear = -1;
	boolean[] visited = new boolean[8];
		
	int v = 1; // 시작정점 지정
	q[++rear] = v; // 정점 큐에 삽입
	visited[v] = true; // 방문한 것으로 표시
	while (front != rear) { // 반복, 큐가 비어질때까지
		v = q[++front]; // 큐에서 첫번째 원소 꺼내기
		System.out.print(v + " "); // 방문 처리(출력)
		for (int i = 0; i < G[v].length; i++) { // 인접한 정점의 개수만큼 방문하면서 모두 작업
			if(!visited[G[v][i]]) { // 방문하지 않았으면
				q[++rear] = G[v][i]; // 큐에 넣기
				visited[G[v][i]] = true; // 방문한 것으로 표시
			}			
		}		
	}
		
//// API 사용
//		Queue<Integer> q = new LinkedList<Integer>(); // 큐생성
//		boolean[] visited = new boolean[8];
//
//		int v = 1; // 시작정점 지정
//		q.offer(v); // 정점 큐에 삽입
//		visited[v] = true; // 방문한 것으로 표시
//		while (!q.isEmpty()) { // 반복, 큐가 비어질때까지
//			v = q.poll(); // 큐에서 첫번째 원소 꺼내기
//			System.out.print(v + " "); // 방문 처리(출력)
//			for (int i = 0; i < G[v].length; i++) { // 인접한 정점의 개수만큼 방문하면서 모두 작업
//				if(!visited[G[v][i]]) { // 방문하지 않았으면
//					q.offer(G[v][i]); // 큐에 넣기
//					visited[G[v][i]] = true; // 방문한 것으로 표시
//				}			
//			}		
//		}
	}
}
