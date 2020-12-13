/*
 * 순열
 * 		1. 반복문 (x)
 * 		2. backtrack 재귀
 * 		3. 재귀 (swap을 이용)
 */
public class Z18_순열 {
	public static int[] arr = { 3, 5, 6, 7 }; // 부분집합을 구하고자 하는 원래 배열
	static int t = 1;

	public static void main(String[] args) {
		// arr 배열의 모든 부분집합을 구해보자
		int[] a = new int[arr.length]; // 순열의 index 순번을 저장할 배열
		backtrack(a, 0, a.length);
	} // end of main

	/** []a : 배열원소의 사용유무를 저장할 배열, k : 현재 단계, input : 단계의 끝 */
	public static void backtrack(int[] a, int k, int input) {
		if (k == input) { // 종료파트 (해인가?) is_a_Solution()
			process_solution(a, k);
		} else { // 재귀파트
			int[] c = new int[a.length];// 후보군을 담을 배열 : 사용하지 않은 숫자
			int ncands = make_candidates(a, k, input, c);// 후보군의 개수
			// 후보군의 개수만큼 반복, 배열의 원소를 넣고 재귀호출
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				backtrack(a, k + 1, input);
			}
		}
	}

	/** 후보군 배열을 셋팅 후 후보군 개수를 리턴 */
	public static int make_candidates(int[] a, int k, int input, int[] c) {
		// 사용한 숫자인지 체크할 플래그 변수
		boolean[] in_perm = new boolean[a.length];
		for (int i = 0; i < k; i++) {
			in_perm[a[i]] = true;
		}
				
		// 플래그변수에서 false인 숫자를 후보군으로 만들기
		int ncands = 0; // 후보군의 개수
		for (int i = 0; i < in_perm.length; i++) {
			if(!in_perm[i]) {
				c[ncands] = i; //i는 인덱스
				ncands++;
			}
		}
		
		return ncands; // 후보군의 개수 리턴
	}

	/** a배열의 원소를 보고 순열출력 */
	public static void process_solution(int[] a, int k) {
		for (int i = 0; i < k; i++) { // k?
				System.out.print(arr[a[i]] + " ");	// 저장된 순번 출력
//				?????
			}
		System.out.println();
		}
} // end of class
