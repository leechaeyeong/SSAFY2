
/**
 *	이진트리 
 *  문제 : 추가 조건 설명
 *  	레벨 4의 이진트리
 *  전위, 중위, 후위 순회로 출력
 *  
 *  
 13
 1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
 */

import java.util.Arrays;
import java.util.Scanner;

public class Z28_트리 {
	public static int[] tree = new int[32]; // 부족하지 않도록 지정, 자식정점을 저장, 0번은 안씀

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = Integer.parseInt(sc.nextLine()); // 정점의 개수
		String str = sc.nextLine();
		String[] srr = str.split(" ");

		// 이진 트리 저장하기
		tree[1] = 1; // 루트 정점 번호를 저장
		for (int i = 0; i < srr.length; i += 2) {
			int p = Integer.parseInt(srr[i]); // 간선의 시작 정점
			int c = Integer.parseInt(srr[i + 1]); // 간선의 끝 정점

			// tree 배열에 p 정점이 있는지 index를 찾자
			int j;
			for (j = 1; j < tree.length; j++) { // 0번 정점은 안씀
				if (tree[j] == p) {
					break;
				}
			}
			// j 위치에 자식으로 삽입
			if (tree[j * 2] == 0) { // 왼쪽 자식이 없으면, 왼쪽 자식으로 등록
				tree[j * 2] = c;
			} else { // 왼쪽 자식이 있으면, 오른쪽 자식으로 등록
				tree[j * 2 + 1] = c;
			}
		}
		// 이진 트리 순회하기
		
		System.out.print("\n전위순회 : ");
		preOrder(1);
		
		System.out.print("\n중위순회 : ");
		inOrder(1);
		
		System.out.print("\n후위순회 : ");
		postOrder(1);
		
		System.out.println();
		System.out.println(Arrays.toString(tree));
	}

	private static void postOrder(int index) {
		if(index >= tree.length || tree[index] == 0) return; // 배열의 범위 체크, 트리정점이 있는지 체크
		postOrder(index*2);// 왼쪽 자식
		postOrder(index*2+1);// 오른쪽 자식
		System.out.print(tree[index] + " ");// 부모 정점 (방문해서 할 일 : 출력) 
		
	}

	private static void inOrder(int index) {
		if(index >= tree.length || tree[index] == 0) return; // 배열의 범위 체크, 트리정점이 있는지 체크
		inOrder(index*2);// 왼쪽 자식
		System.out.print(tree[index] + " ");// 부모 정점 (방문해서 할 일 : 출력) 
		inOrder(index*2+1);// 오른쪽 자식
		
	}

	public static void preOrder(int index) {
		if(index >= tree.length || tree[index] == 0) return; // 배열의 범위 체크, 트리정점이 있는지 체크
		System.out.print(tree[index] + " ");// 부모 정점 (방문해서 할 일 : 출력) 
		preOrder(index*2);// 왼쪽 자식
		preOrder(index*2+1);// 오른쪽 자식
		
	}
}
