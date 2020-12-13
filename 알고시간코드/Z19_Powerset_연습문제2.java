/**
 * 연습문제 2
 */
public class Z19_Powerset_연습문제2 {
	public static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 부분집합을 구하고자 하는 원래 배열

	public static void main(String[] args) {
		// arr 배열의 모든 부분집합을 구해보자
		boolean[] a = new boolean[arr.length];
		backtrack(a, 0, a.length,0);
	} // end of main

	/** []a : 배열원소의 사용유무를 저장할 배열, k : 현재 단계, input : 단계의 끝 sum : 지금까지 선택된 부분집합 원소의 합 */
	public static void backtrack(boolean[] a, int k, int input, int sum) {
		if (k == input) { // 종료파트 (해인가?) is_a_Solution()
			if(sum == 10)
				process_solution(a, k);
		} else { // 재귀파트
			boolean[] c = new boolean[2];// 후보군을 담을 배열 true, false
			int ncands = make_candidates(a, k, input, c);// 후보군의 개수
			// 후보군의 개수만큼 반복, 배열의 원소를 넣고 재귀호출
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				int nextSum = sum + (a[k] ? arr[k] : 0);
				if(nextSum <= 10) {
					backtrack(a, k + 1, input, nextSum);					
				}
			}
		}
	}

	/** 후보군 배열을 셋팅 후 후보군 개수를 리턴 */
	public static int make_candidates(boolean[] a, int k, int input, boolean[] c) {
		c[0] = false;
		c[1] = true;
		return 2; // 후보군의 개수 리턴
	}

	/** a배열의 원소 사용여부를 보고 출력 */
	public static void process_solution(boolean[] a, int k) {
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]) {
//				sum += arr[i];
//			}
//		}
//		if(sum != 10) return;
		for (int i = 0; i < a.length; i++) {
			if (a[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
} // end of class
