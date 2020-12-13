import java.util.Arrays;
import java.util.Scanner;

public class 게리맨더링 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 구역의 개수
		int[][] arr = new int[n][n];
		int[] man = new int[n]; // 구역의 인구 배열
		for (int i = 0; i < n; i++) {
			man[i] = sc.nextInt();
		} // 구역 마다의 인구 저장
		
		for (int i = 0; i < n; i++) {
			int cnt = sc.nextInt(); // 인접한 구역의 정보
			for (int j = 0; j < cnt; j++) {
				int near = sc.nextInt()-1;
				arr[i][near] = 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		// 구역을 두개로 나눈다.
		// 한 선거구에 포함되어 있는 구역은 모두 연결되어 있어야 한다.(A->B 이동 가능)
		// => 두 선거구에 포함된 인구의 차이의 최소값
		
	} // end of main
} // end of class
