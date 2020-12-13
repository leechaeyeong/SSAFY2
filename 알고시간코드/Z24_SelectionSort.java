import java.util.Arrays;

/**
 * 선택 정렬 O[n^2]
 * 선택 정렬 영역의 최소값을 찾아서 영역의 첫번째 위치와 자리를 바꿈
 */
public class Z24_SelectionSort {
	public static void main(String[] args) {
		int[] a = { 5, 7, 2, 9, 3, 6, 1, 4, 8 }; // 9개
// 		0~8 의 최소값 a[0] <-> a[k]
// 		1~8 의 최소값 a[1] <-> a[k]
// 		2~8 의 최소값 a[2] <-> a[k]
// 		...
// 		0~8 의 최소값 a[8] <-> a[k]
// 		i~8 의 최소값 a[i] <-> a[k]
		for (int i = 0; i < a.length; i++) { // 영역의 시작위치를 지정할 변수
			//int min = Integer.MAX_VALUE;
			int min = a[i];
			int minIndex = i;
			for (int j = i; j < a.length; j++) { // 영역 1~8
				if (min > a[j]) {
					min = a[j];
					minIndex = j; // 방번호 저장
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		System.out.println(Arrays.toString(a));
	} // end of main
} // end of class
