import java.util.Arrays;
import java.util.Scanner;

/**
 * O[n^2]
 * 거품정렬
 */
public class Z25_BubbleSort {
	public static void main(String[] args) {
		int[] a = {5,7,2,9,3,6,1,4,8};
// 		앞에서부터 2개씩 비교, 작은값 앞으로 큰값 뒤로
//		영역 0~8 시작값은 0~7	01 12 23 34 45 56 67 78
//		영역 0~7 시작값은 0~6	01 12 23 34 45 56 67 78
//		...
//		영역 0~1 시작값은 0~0
		for (int i = a.length-1; i > 0; i--) { // 영역의 끝나는 숫자
			for (int j = 0; j < i; j++) { // 0~7, j 두개씩 비교할 시작위치 a[j] a[j+1]
				if(a[j] > a[j+1]) { // 큰수가 앞쪽에 있으면 바꾸기
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		} 
		System.out.println(Arrays.toString(a));
	} // end of main
} // end of class
