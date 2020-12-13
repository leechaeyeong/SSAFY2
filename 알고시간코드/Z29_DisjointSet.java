/**
 * 상호 배타 집합 그룹을 합치는 문제, 같은 그룹인지 확인 문제, 몇개의 그룹인지 세는 문제
 */
public class Z29_DisjointSet {
	public static int[] p = new int[10]; // 부모 정보를 담는 배열
	public static int[] rank = new int[p.length];// 각 정점의 깊이를 저장할 배열

	public static void main(String[] args) {
		for (int i = 0; i < p.length; i++) {
			makeSet(i);
		}
		printSet();
		union(0, 1);
		printSet();
		union(2, 3);
		printSet();
		union(0, 3);
		printSet();
		union(4, 5);
		printSet();
		union(6, 7);
		printSet();
		union(3, 5);
		printSet();
		union(1, 8);
		printSet();
		union(0, 9);
		printSet();
	} // end of main

	/** 일반멤버 x, 일반멤버 y를 포함하는 두 집합을 통합 */
	public static void union(int x, int y) {
		int px = findSet(x);
		int py = findSet(y);

		if (px != py) { // 다른 집합일 때만 합치기, 같은 집합인데 합치면 StackOverflowError 발생
			link(px, py);
		}

	}

	/** x의 대표자집합과 y의 대표자집합을 rank 값을 기준으로 합침 - 깊은 쪽을 대표자로 설정 */
	public static void link(int px, int py) {
		if (rank[px] > rank[py]) {
			p[py] = px; // 깊은 쪽을 대표자로 설정
		} else { // rank[px] <= rank[py]
			p[px] = py;
			if(rank[px] == rank[py]) { // 깊이가 같은 경우 랭크값을 증가시켜준다
				rank[py]++;
			}
		}
	}

	/** 일반멤버 x를 포함하는 집합의 대표자 index를 리턴 */
	public static int findSet(int x) {
		if (p[x] == x)
			return x;
		else {
			return findSet(p[x]);
		}
	}

	/** 배열의 정보를 출력 */
	public static void printSet() {
		System.out.print("index : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", i); // 배열의 인덱스 출력
		}
		System.out.println();
		System.out.print("parent: ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", p[i]); // 부모 정보 출력
		}
		System.out.println();
		System.out.print("rank :  ");
		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%2d ", rank[i]);
		}
		System.out.println();
		System.out.println();

	}

	/** 멤버 x를 포함하는 새로운 집합을 생성 */
	public static void makeSet(int x) {
		p[x] = x; // 부모를 자신의 index로 표기
//		rank[x] = 0; // 깊이 저장, 초기값이 0임
	}
} // end of class
