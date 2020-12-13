/**
 * DFS : 그래프 순회 방법중 하나 깊이우선 탐색, 갈 수 있는 길이 있으면 계속 고고싱, 막다른 길이면 이전 갈림길로 되돌아옴 ( 스택)
 * 모든 정점을 한번씩 방문하기 위한 코드블럭
 */
public class Z13_DFS {
	public static void main(String[] args) {
		int[][] arr = { // 그래프 저장 방법 : 인접행렬
//			     	     0  1  2  3  4  5  6  7
				/* 0 */{ 0, 0, 0, 0, 0, 0, 0, 0 },
				/* 1 */{ 0, 0, 1, 1, 0, 0, 0, 0 }, 
				/* 2 */{ 0, 1, 0, 0, 1, 1, 0, 0 }, 
				/* 3 */{ 0, 1, 0, 0, 0, 0, 0, 1 },
				/* 4 */{ 0, 0, 1, 0, 0, 0, 1, 0 }, 
				/* 5 */{ 0, 0, 1, 0, 0, 0, 1, 0 }, 
				/* 6 */{ 0, 0, 0, 0, 1, 1, 0, 1 },
				/* 7 */{ 0, 0, 0, 1, 0, 0, 1, 0 },

		};		

		int[] stack = new int[100]; // 이전 갈림길로 돌아가기위해 가는 경로를 저장
		int top = -1;
		boolean[] visited = new boolean[arr.length]; // 정점의 방문여부를 체크할 변수

//	DFS 순회
		int v = 1; // 시작 정점 지점
		visited[v] = true; // 정점 방문 체크
		stack[++top] = v; // 스택에 push 넣기
		System.out.print(v + " "); // 방문해서 할일 (정점 번호 출력)

		while (top > -1) { // 스택이 비워질때까지 반복
			int w = -1; // 다음 갈 정점을 저장할 변수
			for (int i = 0; i < arr[v].length ; i++) { // 반복문으로
				if (arr[v][i] == 1 && !visited[i]) { // 인접한 정점 찾기, 미방문정점 찾기
					w = i;
					visited[w] = true; // 정점 방문 체크
					stack[++top] = w; // 스택에 넣기
					System.out.print(w + " ");// 방문해서 할일 (정점 번호 출력)
					v = w;
					break; // 갈 경로를 찾았으면 for문 종료후 고고싱
				}
			}
			if (w == -1) { // 못찾았으면
				v = stack[top--]; // 이전 갈림길로 되돌아가기 (스택에서 꺼냄)
			}
		
			
		}
	} // end of main
} // end of class
