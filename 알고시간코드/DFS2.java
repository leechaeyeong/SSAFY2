/**
 * DFS 1부터 시작해서 큰 정점부터 출력
 */
public class DFS2 {
	public static void main(String[] args) {
/*
		int[][] G= {
				{},
				{2,3,}
				{1,4,5},
				{1,7}
				,{...
		}; //인접리스트 형식
		*/
		// 저장 - 알파벳을 (해싱 기법 - 맵 (키:값 - A:0), 아스키코드 -65
		int[][] arr = { // 그래프 저장 방법 : 인접행렬
				{}, // 0번 정점
				// 0 1 2 3 4 5 6 7
				{ 0, 0, 1, 1, 0, 0, 0, 0 }, // 1번 정점
				{ 0, 1, 0, 0, 1, 1, 0, 0 }, // 2번 정점
				{ 0, 1, 0, 0, 0, 0, 0, 1 }, // 3번 정점
				{ 0, 0, 1, 0, 0, 0, 1, 0 }, // 4번 정점
				{ 0, 0, 1, 0, 0, 0, 1, 0 }, // 5번 정점
				{ 0, 0, 0, 0, 1, 1, 0, 1 }, // 6번 정점
				{ 0, 0, 0, 1, 0, 0, 1, 0 }, // 7번 정점

		};
		// 입력
		int[] stack = new int[100]; // 이전 갈림길로 돌아가기 위해가는 경로를 저장 (왔던 길 저장)
		int top = -1;
		boolean[] visited = new boolean[arr.length]; // 정점의 방문 여부를 체크할 변수

		// dfs 순회
		int v = 1;// 시작 정점 지정
		visited[v] = true;// 정점 방문 체크
		stack[++top] = v;// 스택에 넣기
		System.out.print(v + " ");// 방문해서 할일 (정점 번호 출력)

		while (top > -1) {// (스택이 비워질때 까지)
			int w = -1; // 다음 갈 정점을 저장할 변수
			for (int i = arr[v].length-1; i >=0; i--) {// 반복문으로
				if (arr[v][i] == 1 && !visited[i]) { // 인접한 정점 찾기, 미방문 정점 찾기
					w = i;
					visited[w] = true;// 정점 방문 체크
					stack[++top] = w;// 스택에 넣기
					System.out.print(w + " ");// 방문해서 할일 (정점 번호 출력)
					v = w;
					break; // 갈 경로를 찾았으면 for반복 종료. 전진
				}
			}
			if(w ==-1) {// 못찾았으면 이전 갈림길로 되돌아가기 (스택에서 꺼냄)
				v= stack[top--];
			}
		} // while

	}// end of main
}// end of class
